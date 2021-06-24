#!/usr/bin/env bash

#set -euo pipefail
#which psql > /dev/null || (echoerr "Please ensure that postgres client is in your PATH" && exit 1)
#
#mkdir -p $HOME/docker/volumes/postgres
#rm -rf $HOME/docker/volumes/postgres/data

# Go to bin of project where .sh and data files are stored and make open git bash and run ./start_postgres.sh
 docker run --name post-postgres -e POSTGRES_PASSWORD=mysecretpassword -p 5432:5432 -d postgres

#docker run --rm --name so-postgres -e POSTGRES_PASSWORD=mysecretpassword -e POSTGRES_DB=dev -d -p 5432:5432 -v $HOME/docker/volumes/postgres:/var/lib/postgresql postgres

export PGPASSWORD=mysecretpassword
psql -U postgres  -h localhost -f schema.sql
psql -U postgres  -h localhost -f data.sql

sleep 10