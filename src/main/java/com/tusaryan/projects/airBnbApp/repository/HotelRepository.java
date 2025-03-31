package com.tusaryan.projects.airBnbApp.repository;

import com.tusaryan.projects.airBnbApp.entity.Hotel;
import com.tusaryan.projects.airBnbApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
    List<Hotel> findByOwner(User user);
}
