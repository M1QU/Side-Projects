package Classes;
import game.character.Player;
import java.util.Scanner;
import Attributes.Attribute;

import game.character.Class;

/**
 *
 * @author Owner
 */
public class Paladin {
    Attribute at = new Attribute();
    Scanner kb = new Scanner(System.in);
    Player player = new Player("",0,0,0,0,0,0,0);
    Class Paladin = new Class();

    int  conMod, chaMod, strMod, str, intel, dex, wis, con, cha, intMod, dexMod, wisMod,
             meleeAtk, rangedAtk, speed, profBonus, proficiencyBonus, lOnHands,
            lv1SpellSlots, lv3SpellSlots, lv2SpellSlots, lv4SpellSlots, lv5SpellSlots,
            lv1SpellNum, lv3SpellNum, lv2SpellNum, lv4SpellNum, lv5SpellNum;

    //Plugins
    String features, selection, prof, description, classProf;
    String divineSense, layOnHands, fightingStyle, spellCasting, divineSmite;

//    //Fighting Styles
//    String blessedWarrior, blindFighting, defense, dueling;
//    String greatWpnFighting, interception, protection, closeQtrsShooter, MarinerUA;
//    String thrownWpnFighting, tunnelFighterUA, unarmedFightingUA;
    
    
        // Instance variables
    private String name;
    private int level;
    private int hitPoints;
    private int armorClass;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private String race;
    private String background;
    private String deity;
    private String oath;

    // Constructor
    public Paladin(String name, int level, int hitPoints, int armorClass,
                   int strength, int dexterity, int constitution,
                   int intelligence, int wisdom, int charisma,
                   String race, String background, String deity, String oath) {
       
        this.name = name;
        this.level = level;
        this.hitPoints = hitPoints;
        this.armorClass = armorClass;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
        this.race = race;
        this.background = background;
        this.deity = deity;
        this.oath = oath;
    }

    // Getters and Setters (omitted for brevity)

    // Method to print Paladin information
    public void printInfo() {
        System.out.println("-------------------------------------");
        System.out.println("Name: " + player.getName());
        System.out.println("Level: " + player.getLevel());
        System.out.println("Hit Points: " + at.getHitPoints());
        System.out.println("Armor Class: " + getArmorClass());
        System.out.println("Strength: " + at.readStr());
        System.out.println("Dexterity: " + at.readDex());
        System.out.println("Constitution: " + at.readCon());
        System.out.println("Intelligence: " + at.readInt());
        System.out.println("Wisdom: " + at.readWis());
        System.out.println("Charisma: " + at.readCha());
        System.out.println("Race: " + player.getRace());
        System.out.println("Background: " + getBackground());
        System.out.println("Deity: " + getDeity());
        System.out.println("Oath: " + getOath());
        System.out.println("-------------------------------------");
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


    //attempt 1
    public int getlv1SpellSlots() {
        if (level > 0 && level < 2) {
            lv1SpellSlots = 0;
        }
        if (level > 1 && level < 3) {
            lv1SpellSlots = 2;
        }
        if (level >= 3 && level <= 4) {
            lv1SpellSlots = 3;
        }
        if (level >= 5 && level <= 6) {
            lv1SpellSlots = 4;
        }
        if (level >= 7 && level <= 8) {
            lv1SpellSlots = 4;
        }
        if (level >= 9 && level <= 10) {
            lv1SpellSlots = 4;
        }
        if (level >= 11 && level <= 12) {
            lv1SpellSlots = 4;
        }
        if (level >= 13 && level <= 14) {
            lv1SpellSlots = 4;
        }
        if (level >= 15 && level <= 16) {
            lv1SpellSlots = 4;
        }
        if (level >= 17 && level <= 18) {
            lv1SpellSlots = 4;
        }
        if (level >= 19 && level <= 20) {
            lv1SpellSlots = 4;
        }
        return lv1SpellSlots;
    }

    public int getlv2SpellSlots() {
        if (level > 0 && level < 2) {
            lv2SpellSlots = 0;
        }
        if (level > 1 && level < 3) {
            lv2SpellSlots = 0;
        }
        if (level >= 3 && level <= 4) {
            lv2SpellSlots = 0;
        }
        if (level >= 5 && level <= 6) {
            lv2SpellSlots = 2;
        }
        if (level >= 7 && level <= 8) {
            lv2SpellSlots = 3;
        }
        if (level >= 9 && level <= 10) {
            lv2SpellSlots = 3;
        }
        if (level >= 11 && level <= 12) {
            lv2SpellSlots = 3;
        }
        if (level >= 13 && level <= 14) {
            lv2SpellSlots = 3;
        }
        if (level >= 15 && level <= 16) {
            lv2SpellSlots = 3;
        }
        if (level >= 17 && level <= 18) {
            lv2SpellSlots = 3;
        }
        if (level >= 19 && level <= 20) {
            lv2SpellSlots = 3;
        }
        return lv2SpellSlots;
    }

    public int getlv3SpellSlots() {
        if (level > 0 && level < 2) {
            lv3SpellSlots = 0;
        }
        if (level > 1 && level < 3) {
            lv3SpellSlots = 0;
        }
        if (level >= 3 && level <= 4) {
            lv3SpellSlots = 0;
        }
        if (level >= 5 && level <= 6) {
            lv3SpellSlots = 0;
        }
        if (level >= 7 && level <= 8) {
            lv3SpellSlots = 0;
        }
        if (level >= 9 && level <= 10) {
            lv3SpellSlots = 2;
        }
        if (level >= 11 && level <= 12) {
            lv3SpellSlots = 3;
        }
        if (level >= 13 && level <= 14) {
            lv3SpellSlots = 3;
        }
        if (level >= 15 && level <= 16) {
            lv3SpellSlots = 3;
        }
        if (level >= 17 && level <= 18) {
            lv3SpellSlots = 3;
        }
        if (level >= 19 && level <= 20) {
            lv3SpellSlots = 3;

        }
        return lv3SpellSlots;
    }

    public int getlv4SpellSlots() {
        if (level > 0 && level < 2) {
            lv4SpellSlots = 0;
        }
        if (level > 1 && level < 3) {
            lv4SpellSlots = 0;
        }
        if (level >= 3 && level <= 4) {
            lv4SpellSlots = 0;
        }
        if (level >= 5 && level <= 6) {
            lv4SpellSlots = 0;
        }
        if (level >= 7 && level <= 8) {
            lv4SpellSlots = 0;
        }
        if (level >= 9 && level <= 10) {
            lv4SpellSlots = 0;
        }
        if (level >= 11 && level <= 12) {
            lv4SpellSlots = 0;
        }
        if (level >= 13 && level <= 14) {
            lv4SpellSlots = 1;
        }
        if (level >= 15 && level <= 16) {
            lv4SpellSlots = 2;
        }
        if (level >= 17 && level <= 18) {
            lv4SpellSlots = 3;
        }
        if (level >= 19 && level <= 20) {
            lv4SpellSlots = 3;
        }
        return lv4SpellSlots;
    }

    public int getlv5SpellSlots() {
        if (level > 0 && level < 2) {
            lv5SpellSlots = 0;
        }
        if (level > 1 && level < 3) {
            lv5SpellSlots = 0;
        }
        if (level >= 3 && level <= 4) {
            lv5SpellSlots = 0;
        }
        if (level >= 5 && level <= 6) {
            lv5SpellSlots = 0;
        }
        if (level >= 7 && level <= 8) {
            lv5SpellSlots = 0;
        }
        if (level >= 9 && level <= 10) {
            lv5SpellSlots = 0;
        }
        if (level >= 11 && level <= 12) {
            lv5SpellSlots = 0;
        }
        if (level >= 13 && level <= 14) {
            lv5SpellSlots = 0;
        }
        if (level >= 15 && level <= 16) {
            lv5SpellSlots = 0;
        }
        if (level >= 17 && level <= 18) {
            lv5SpellSlots = 1;
        }
        if (level >= 19 && level <= 20) {
            lv5SpellSlots = 2;
        }
        return lv5SpellSlots;

    }
//    
//  int lv1SpellNum = getlv1SpellSlots();
//    lv2SpellNum = getlv2SpellSlots();
//    lv3SpellNum = getlv3SpellSlots();
//    lv4SpellNum = getlv4SpellSlots();
//    lv5SpellNum = getlv5SpellSlots();

    public void writeOutput() {
        if (level == 20) {

            System.out.println("Level 1 Spell Slots: " + lv1SpellSlots);
            System.out.println("Level 2 Spell Slots; " + lv2SpellSlots);
            System.out.println("Level 3 Spell Slots: " + lv3SpellSlots);
            System.out.println("Level 4 Spell Slots: " + lv4SpellSlots);
            System.out.println("Level 5 Spell Slots: " + lv5SpellSlots);

        }
        if (level == 19) {

            System.out.println("Level 1 Spell Slots: " + lv1SpellSlots);
            System.out.println("Level 2 Spell Slots; " + lv2SpellSlots);
            System.out.println("Level 3 Spell Slots: " + lv3SpellSlots);
            System.out.println("Level 4 Spell Slots: " + lv4SpellSlots);
            System.out.println("Level 5 Spell Slots: " + lv5SpellSlots);

        }
        if (level == 18) {

            System.out.println("Level 1 Spell Slots: " + lv1SpellSlots);
            System.out.println("Level 2 Spell Slots; " + lv2SpellSlots);
            System.out.println("Level 3 Spell Slots: " + lv3SpellSlots);
            System.out.println("Level 4 Spell Slots: " + lv4SpellSlots);
            System.out.println("Level 5 Spell Slots: " + lv5SpellSlots);

        }
        if (level == 17) {

            System.out.println("Level 1 Spell Slots: " + lv1SpellSlots);
            System.out.println("Level 2 Spell Slots; " + lv2SpellSlots);
            System.out.println("Level 3 Spell Slots: " + lv3SpellSlots);
            System.out.println("Level 4 Spell Slots: " + lv4SpellSlots);
            System.out.println("Level 5 Spell Slots: " + lv5SpellSlots);

        }
        if (level == 16) {

            System.out.println("Level 1 Spell Slots: " + lv1SpellSlots);
            System.out.println("Level 2 Spell Slots; " + lv2SpellSlots);
            System.out.println("Level 3 Spell Slots: " + lv3SpellSlots);
            System.out.println("Level 4 Spell Slots: " + lv4SpellSlots);
            System.out.println("Level 5 Spell Slots: " + lv5SpellSlots);

        }
        if (level == 15) {

            System.out.println("Level 1 Spell Slots: " + lv1SpellSlots);
            System.out.println("Level 2 Spell Slots; " + lv2SpellSlots);
            System.out.println("Level 3 Spell Slots: " + lv3SpellSlots);
            System.out.println("Level 4 Spell Slots: " + lv4SpellSlots);
            System.out.println("Level 5 Spell Slots: " + lv5SpellSlots);

        }
        if (level == 14) {

            System.out.println("Level 1 Spell Slots: " + lv1SpellSlots);
            System.out.println("Level 2 Spell Slots; " + lv2SpellSlots);
            System.out.println("Level 3 Spell Slots: " + lv3SpellSlots);
            System.out.println("Level 4 Spell Slots: " + lv4SpellSlots);
            System.out.println("Level 5 Spell Slots: " + lv5SpellSlots);

        }
        if (level == 13) {

            System.out.println("Level 1 Spell Slots: " + lv1SpellSlots);
            System.out.println("Level 2 Spell Slots; " + lv2SpellSlots);
            System.out.println("Level 3 Spell Slots: " + lv3SpellSlots);
            System.out.println("Level 4 Spell Slots: " + lv4SpellSlots);
            System.out.println("Level 5 Spell Slots: " + lv5SpellSlots);

        }
        if (level == 12) {

            System.out.println("Level 1 Spell Slots: " + lv1SpellSlots);
            System.out.println("Level 2 Spell Slots; " + lv2SpellSlots);
            System.out.println("Level 3 Spell Slots: " + lv3SpellSlots);
            System.out.println("Level 4 Spell Slots: " + lv4SpellSlots);
            System.out.println("Level 5 Spell Slots: " + lv5SpellSlots);

        }
        if (level == 11) {

            System.out.println("Level 1 Spell Slots: " + lv1SpellSlots);
            System.out.println("Level 2 Spell Slots; " + lv2SpellSlots);
            System.out.println("Level 3 Spell Slots: " + lv3SpellSlots);
            System.out.println("Level 4 Spell Slots: " + lv4SpellSlots);
            System.out.println("Level 5 Spell Slots: " + lv5SpellSlots);

        }
        if (level == 10) {

            System.out.println("Level 1 Spell Slots: " + lv1SpellSlots);
            System.out.println("Level 2 Spell Slots; " + lv2SpellSlots);
            System.out.println("Level 3 Spell Slots: " + lv3SpellSlots);
            System.out.println("Level 4 Spell Slots: " + lv4SpellSlots);
            System.out.println("Level 5 Spell Slots: " + lv5SpellSlots);

        }
        if (level == 9) {

            System.out.println("Level 1 Spell Slots: " + lv1SpellSlots);
            System.out.println("Level 2 Spell Slots; " + lv2SpellSlots);
            System.out.println("Level 3 Spell Slots: " + lv3SpellSlots);
            System.out.println("Level 4 Spell Slots: " + lv4SpellSlots);
            System.out.println("Level 5 Spell Slots: " + lv5SpellSlots);

        }
        if (level == 8) {
            System.out.println("Level 1 Spell Slots: " + lv1SpellSlots);
            System.out.println("Level 2 Spell Slots; " + lv2SpellSlots);
            System.out.println("Level 3 Spell Slots: " + lv3SpellSlots);
            System.out.println("Level 4 Spell Slots: " + lv4SpellSlots);
            System.out.println("Level 5 Spell Slots: " + lv5SpellSlots);

        }
        if (level == 7) {

            System.out.println("Level 1 Spell Slots: " + lv1SpellSlots);
            System.out.println("Level 2 Spell Slots; " + lv2SpellSlots);
            System.out.println("Level 3 Spell Slots: " + lv3SpellSlots);
            System.out.println("Level 4 Spell Slots: " + lv4SpellSlots);
            System.out.println("Level 5 Spell Slots: " + lv5SpellSlots);

        }
        if (level == 6) {

            System.out.println("Level 1 Spell Slots: " + lv1SpellSlots);
            System.out.println("Level 2 Spell Slots; " + lv2SpellSlots);
            System.out.println("Level 3 Spell Slots: " + lv3SpellSlots);
            System.out.println("Level 4 Spell Slots: " + lv4SpellSlots);
            System.out.println("Level 5 Spell Slots: " + lv5SpellSlots);

        }
        if (level == 5) {

            System.out.println("Level 1 Spell Slots: " + lv1SpellSlots);
            System.out.println("Level 2 Spell Slots; " + lv2SpellSlots);
            System.out.println("Level 3 Spell Slots: " + lv3SpellSlots);
            System.out.println("Level 4 Spell Slots: " + lv4SpellSlots);
            System.out.println("Level 5 Spell Slots: " + lv5SpellSlots);

        }
        if (level == 4) {

            System.out.println("Level 1 Spell Slots: " + lv1SpellSlots);
            System.out.println("Level 2 Spell Slots; " + lv2SpellSlots);
            System.out.println("Level 3 Spell Slots: " + lv3SpellSlots);
            System.out.println("Level 4 Spell Slots: " + lv4SpellSlots);
            System.out.println("Level 5 Spell Slots: " + lv5SpellSlots);

        }
        if (level == 3) {

            System.out.println("Level 1 Spell Slots: " + lv1SpellSlots);
            System.out.println("Level 2 Spell Slots; " + lv2SpellSlots);
            System.out.println("Level 3 Spell Slots: " + lv3SpellSlots);
            System.out.println("Level 4 Spell Slots: " + lv4SpellSlots);
            System.out.println("Level 5 Spell Slots: " + lv5SpellSlots);

        }
        if (level == 2) {

            System.out.println("Level 1 Spell Slots: " + lv1SpellSlots);
            System.out.println("Level 2 Spell Slots; " + lv2SpellSlots);
            System.out.println("Level 3 Spell Slots: " + lv3SpellSlots);
            System.out.println("Level 4 Spell Slots: " + lv4SpellSlots);
            System.out.println("Level 5 Spell Slots: " + lv5SpellSlots);

        }

        if (level == 1) {
            features = "Divine Sense, Lay On Hands";
            System.out.println("Level 1 Spell Slots: " + lv1SpellSlots);
            System.out.println("Level 2 Spell Slots; " + lv2SpellSlots);
            System.out.println("Level 3 Spell Slots: " + lv3SpellSlots);
            System.out.println("Level 4 Spell Slots: " + lv4SpellSlots);
            System.out.println("Level 5 Spell Slots: " + lv5SpellSlots);

        }
    }

    public int getLayOnHands(int level) {
        int healingPower = level * 5;
        return healingPower;
    }

    public void getMenu() {
        int pMenu;
        //Start of Do-While for Paladin menu
        do {
            //Defining local objects / Variables
            String menuChoice;

            //Local obj to generate random number from 1-10 "1 D 10"
            double doubleRandomNumber = Math.random() * 10;
            int randomNumber = (int) doubleRandomNumber;

            //Local Variables to define data that req other class data
            int totConBonus = conMod * level;
            int divineSenseCounter = 1 + chaMod;
            int healthPoints = (level * randomNumber) + totConBonus;
            int spellSaveDC = 8 + profBonus + chaMod;
            int spellAttkMod = profBonus + chaMod;

            System.out.println(divineSense);

            // Prints Misc Proficiencies
            classProf = """
                      Proficiencies: 
                      Armor: All armor, Shields
                      Weapons: Simple, Martial weapons
                      Tools: None
                      Saving Throws: Wisdom, Charisma
                      Skills (Pick 2): Athletics, Insight, intimidation, medicine, persuasion, and religion
                      """;

            System.out.println("\nPaladin Menu: ");
            System.out.println("1. Character Attributes");
            System.out.println("2. Spell Slots");
            System.out.println("3. Class Features");

            pMenu = kb.nextInt();
            switch (pMenu) {
                case 1 -> {
                    menuChoice = "Character Attributes";
                    System.out.println("Level " + level + " Paladin");
                    System.out.println("Health: " + healthPoints);
                    at.writeOutputStr();
                    at.writeOutputDex();
                    at.writeOutputCon();
                    at.writeOutputInt();
                    at.writeOutputWis();
                    at.writeOutputCha();
                    break;
                }
                case 2 -> {
                    menuChoice = "Spell Slots";
                    System.out.println("Spell Save DC: " + spellSaveDC);
                    System.out.println("Spell Attk Mod: " + spellAttkMod);
                    this.writeOutput();

                    System.out.print("\n");
                    System.out.println("Divine Sense total uses: " + divineSenseCounter);
                    System.out.println("Lay on hands will heal for: " + lOnHands + " points of damage \n");
                    break;
                }
                case 3 -> {
                    menuChoice = "Class Features";

                    System.out.println("Class Features / Skills");
                    do {
                        pSkill.selection = pSkill.getSkillSelection();
                        pSkill.fightingStyle = pSkill.writeOutput();
                    } while (pSkill.selection < 10);

                    break;
                }
                case 4 -> {
                    menuChoice = "";
                    System.out.println("You've chosen Druid!");
                    break;
                }
                case 5 -> {
                    menuChoice = "Barbarian";
                    System.out.println("You've chosen Barbarian!");
                    break;
                }
            }

        } while (pMenu < 6);
    }
}
