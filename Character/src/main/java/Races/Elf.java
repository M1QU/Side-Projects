
package Races;
import game.character.Player;

/**
 *
 * @author Owner
 */
// Elf race class that extends Race
public class Elf extends Race {
    private int dexterity;

    // Constructor
    public Elf(String name, int age, String language, int dexterity) {
        super(name, age, language);
        this.dexterity = dexterity;
    }

    // Implemented method from abstract class
    @Override
    public String getAbility() {
        return "Natural Stealth";
    }

    // Getter and Setter methods for dexterity
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getDexterity() {
        return dexterity;
    }
}
