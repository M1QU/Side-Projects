/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Races;

/**
 *
 * @author Owner
 */

    // Halfling race class that extends Race
public class Halfling extends Race {
    private int charisma;

    // Constructor
    public Halfling(String name, int age, String language, int charisma) {
        super(name, age, language);
        this.charisma = charisma;
    }

    // Implemented method from abstract class
    @Override
    public String getAbility() {
        return "Lucky";
    }

    // Getter and Setter methods for charisma
    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getCharisma() {
        return charisma;
    }
}
