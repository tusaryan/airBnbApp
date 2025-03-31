package com.tusaryan.projects.airBnbApp.repository;

import com.tusaryan.projects.airBnbApp.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
