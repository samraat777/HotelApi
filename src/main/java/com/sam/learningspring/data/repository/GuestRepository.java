package com.sam.learningspring.data.repository;

import com.sam.learningspring.data.entity.Guest;
import com.sam.learningspring.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends CrudRepository<Guest,Long> {
}
