/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Races;

/**
 *
 * @author Owner
 */

    
// Gnome race class that extends Race
public class Gnome extends Race {
    private int intelligence;

    // Constructor
    public Gnome(String name, int age, String language, int intelligence) {
        super(name, age, language);
        this.intelligence = intelligence;
    }

    // Implemented method from abstract class
    @Override
    public String getAbility() {
        return "Gnome Cunning";
    }

    // Getter and Setter methods for intelligence
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getIntelligence() {
        return intelligence;
    }
}
