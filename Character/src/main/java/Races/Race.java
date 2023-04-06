/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Races;
import game.character.Player;


/**
 * CSCI 1010-03 Assignment 1
 * @author Mikel Steele
 */
// Abstract class Race
public abstract class Race {
    private String name;
    private int age;
    private String language;

    // Constructor
    public Race(String name, int age, String language) {
        this.name = name;
        this.age = age;
        this.language = language;
    }

    // Abstract method for each race to implement
    public abstract String getAbility();

    // Getter and Setter methods for name
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    // Getter and Setter methods for age
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    // Getter and Setter methods for language
    public void setLanguage(String language) {
        this.language = language;
    }
    public String getLanguage() {
        return language;
    }
}

