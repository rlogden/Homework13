package edu.dmacc.codedsm.hw13;

import java.util.Scanner;

public class User {
    public String name;
    public Scanner userInput = new Scanner(System.in);
    public String inputFromUser;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public User() {
        name = "No Name";
    }

    @Override
    public String toString() {
        return "User Name: " + name;
    }

    public String getInput(String inputNeeded) {
        System.out.println("Please enter " + inputNeeded);
        inputFromUser = userInput.nextLine();
        return inputFromUser;
    }

}
