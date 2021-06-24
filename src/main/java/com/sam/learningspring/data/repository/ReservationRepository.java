package com.sam.learningspring.data.repository;

import com.sam.learningspring.data.entity.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation,Long> {

    Iterable<Reservation> findByReservationDate(Date date);
}
