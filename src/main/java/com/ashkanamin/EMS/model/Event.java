package com.ashkanamin.EMS.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-generate the ID for each event
    private Long id;

    @Column(name = "event_name", nullable = false)  // The event name should not be null
    private String name;

    @Column(name = "event_location")
    private String location;

    @Temporal(TemporalType.TIMESTAMP)  // Specifies that this should be stored as a timestamp
    @Column(name = "event_date", nullable = false)
    private Date date;

    public Long getId() {
        return id;
    }

    public Event setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Event setName(String name) {
        this.name = name;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public Event setLocation(String location) {
        this.location = location;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public Event setDate(Date date) {
        this.date = date;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Event setDescription(String description) {
        this.description = description;
        return this;
    }

    public Event() {
    }

    public Event(Long id, String name, String location, Date date, String description) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.date = date;
        this.description = description;
    }

    @Column(name = "event_description")
    private String description;
}
