package org.launchcode.codingevents.models;


import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

public class Event {

    private int id;
    private static int nextId=1;

    @NotBlank
    @Size(min=3, max=50, message="name must be between 3 and 50 characters")
    private String name;

    @Size(max=500, message="description too long buddy")
    private String description;

    @NotBlank
    @Email(message="invalid email. Try again?")
    private String contactEmail;

    //event location - String
    @NotBlank(message="you need to tell us where its going to be!")
    private String eventLocation;

    //registration neededed? must be true -boolean
    @AssertTrue(message = "resgistration is required")
    private Boolean mustRegister;

    //attendees number
    @NotBlank
    @Size(min=1, message="you cant have an event with no attendees")
    private int numberOfAttendees;

    //one of my choosing

    public Event(){}


    public Event(String name, String description, String contactEmail, String eventLocation, Boolean mustRegister, int numberOfAttendees ) {
        this.name = name;
        this.description= description;
        this.contactEmail=contactEmail;
        this.eventLocation=eventLocation;
        this.numberOfAttendees=numberOfAttendees;
        this.id=nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getById() {
        return id;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }


    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public Boolean getMustRegister() {
        return mustRegister;
    }

    public void setMustRegister(Boolean mustRegister) {
        this.mustRegister = mustRegister;
    }

    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(int numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
