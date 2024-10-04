package com.ashkanamin.EMS.repository;

import com.ashkanamin.EMS.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<Event,Long> {
    List<Event> findByLocation(String location);  // Find events by location

    List<Event> findByNameContainingIgnoreCase(String name);

}
