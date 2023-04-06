/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Races;

/**
 *
 * @author Owner
 */

    
// Dwarf race class that extends Race
public class Dwarf extends Race {
    private int constitution;

    // Constructor
    public Dwarf(String name, int age, String language, int constitution) {
        super(name, age, language);
        this.constitution = constitution;
    }

    // Implemented method from abstract class
    @Override
    public String getAbility() {
        return "Dwarven Resilience";
    }

    // Getter and Setter methods for constitution
    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getConstitution() {
        return constitution;
    }
}

    