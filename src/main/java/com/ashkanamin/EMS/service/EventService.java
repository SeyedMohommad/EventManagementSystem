package com.ashkanamin.EMS.service;

import com.ashkanamin.EMS.model.Event;
import com.ashkanamin.EMS.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Optional<Event> getEventById(Long id) {
        return eventRepository.findById(id);
    }

    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }

    public List<Event> getEventsByLocation(String location) {
        return eventRepository.findByLocation(location);
    }

    public List<Event> searchEventsByName(String name) {
        return eventRepository.findByNameContainingIgnoreCase(name);
    }
    public Event updateEvent(Long id, Event event) {
        Optional<Event> eventOptional = eventRepository.findById(id);
        if (eventOptional.isPresent()) {
            Event updatedEvent = eventOptional.get();
            updatedEvent.setName(event.getName());
            updatedEvent.setLocation(event.getLocation());
            updatedEvent.setDescription(event.getDescription());
            return eventRepository.save(updatedEvent);
        }else{
            return null;
        }
    }
}
