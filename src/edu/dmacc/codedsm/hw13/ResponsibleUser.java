package edu.dmacc.codedsm.hw13;

import java.util.ArrayList;
import java.util.List;

public class ResponsibleUser {
    public String name;
    public List<String> abilities = new ArrayList<>();
    public List<String> availability = new ArrayList<>();
    public List<Object> assignedTasks = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<String> abilities) {
        this.abilities = abilities;
    }

    public List<String> getAvailability() {
        return availability;
    }

    public void setAvailability(List<String> availability) {
        this.availability = availability;
    }

    public List<Object> getAssignedTasks() {
        return assignedTasks;
    }

    public void setAssignedTasks(List<Object> assignedTasks) {
        this.assignedTasks = assignedTasks;
    }

    public ResponsibleUser(String name, List<String> abilities, List<String> availability, List<Object> assignedTasks) {
        this.name = name;
        this.abilities = abilities;
        this.availability = availability;
        this.assignedTasks = assignedTasks;
    }

    public ResponsibleUser() {
        name = "Unnamed User";
        abilities = new ArrayList<>();
        availability = new ArrayList<>();
        assignedTasks = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Responsible User: " +
                "Name: " + name +
                ", Abilities: " + abilities +
                ", Availability: " + availability +
                ", Assigned Tasks: " + assignedTasks;
    }

    public void assignTask(Object taskToAssign){
        assignedTasks.add(taskToAssign);
    }


}
