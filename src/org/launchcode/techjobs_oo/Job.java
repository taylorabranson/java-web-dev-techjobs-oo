package org.launchcode.techjobs_oo;

import java.lang.reflect.Array;
import java.util.*;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {

        String stringName = name;
        String stringEmployer = employer.getValue();
        String stringLocation = location.getValue();
        String stringPositionType = positionType.getValue();
        String stringCoreCompetency = coreCompetency.getValue();

        HashMap<String, String> strings = new HashMap<>();
        strings.put("name", name);
        strings.put("employer", employer.getValue());
        strings.put("location", location.getValue());
        strings.put("positionType", positionType.getValue());
        strings.put("coreCompetency", coreCompetency.getValue());

        int fieldsWithData = 0;
        for (Map.Entry<String, String> entry: strings.entrySet()) {
            if (entry.getValue() == "") {
                entry.setValue("Data not available");
            } else {
                fieldsWithData += 1;
            }
        }

        if (fieldsWithData > 0) {
            return  "\nID: " + id +
                    "\nName: " + strings.get("name") +
                    "\nEmployer: " + strings.get("employer") +
                    "\nLocation: " + strings.get("location") +
                    "\nPosition Type: " + strings.get("positionType") +
                    "\nCore Competency: " + strings.get("coreCompetency") +
                    '\n';
        } else {
            return "OOPS! This job does not seem to exist.";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
