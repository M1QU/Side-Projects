/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Races;

/**
 *
 * @author Owner
 */

    // Dragonborn race class that extends Race
public class Dragonborn extends Race {
    private int strength;
    private String breathWeapon;

    // Constructor
    public Dragonborn(String name, int age, String language, int strength, String breathWeapon) {
        super(name, age, language);
        this.strength = strength;
        this.breathWeapon = breathWeapon;
    }

    // Implemented method from abstract class
    @Override
    public String getAbility() {
        return "Draconic Ancestry";
    }

    // Getter and Setter methods for strength
    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    // Getter and Setter methods for breath weapon
    public void setBreathWeapon(String breathWeapon) {
        this.breathWeapon = breathWeapon;
    }

    public String getBreathWeapon() {
        return breathWeapon;
    }
}


