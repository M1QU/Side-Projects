
package Races;

/**
 *
 * @author Owner
 */

// Half-Orc race class that extends Race
public class halfOrc extends Race {
    private int strength;

    // Constructor
    public halfOrc(String name, int age, String language, int strength) {
        super(name, age, language);
        this.strength = strength;
    }

    // Implemented method from abstract class
    @Override
    public String getAbility() {
        return "Savage Attacks";
    }

    // Getter and Setter methods for strength
    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }
}