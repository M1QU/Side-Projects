package game.character;

import Classes.Barbarian;
import Classes.Bard;
import Classes.Cleric;
import Classes.Druid;
import Classes.Fighter;        
import Classes.Monk;
import Classes.Paladin;
import Classes.Ranger;
import Classes.Rogue;
import Classes.Scorcerer;
import Classes.Wizard;

import Races.Dragonborn;
import Races.Dwarf;
import Races.Elf;
import Races.Gnome;
import Races.Halfling;
import Races.Human;
import Races.Race;
import Races.Tiefling;
import Races.halfOrc;



import java.util.Scanner;

/**
 * CSCI 1010-03 Assignment 1
 * @author Mikel Steele
 */
public class Player {
    private String name;
    private int level;
    private int age;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private Race race;
    private CharacterClass characterClass;
    
    // Constructor and getter and setter methods...

  
  public Player(String name, Race race, int level,int age, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
    this.name = name;
    this.race = race;
    this.age = age;
    this.level = level;
    
    this.strength = strength;
    this.dexterity = dexterity;
    this.constitution = constitution;
    this.intelligence = intelligence;
    this.wisdom = wisdom;
    this.charisma = charisma;
  }
  
  public String getName() {
    return name;
  }
  
  public int getLevel() {
    return level;
  }
  
  public int getStrength() {
    return strength;
  }
  
  public int getDexterity() {
    return dexterity;
  }
 
  public void setDexterity(int dexterity){
      this.dexterity = dexterity;
                }
  public int getConstitution() {
    return constitution;
  }
  
  public int getIntelligence() {
    return intelligence;
  }
  
  public int getWisdom() {
    return wisdom;
  }
  
  public int getCharisma() {
    return charisma;
  }
  
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  
  System.out.print("Enter player name: ");
  String name = scanner.nextLine();
  
      System.out.println("Enter player age");
    int age = scanner.nextInt();
  
      System.out.print("Enter player level: ");
  int level = Integer.parseInt(scanner.nextLine());
  
  System.out.print("Enter player strength: ");
  int strength = Integer.parseInt(scanner.nextLine());
  
  System.out.print("Enter player dexterity: ");
  int dexterity = Integer.parseInt(scanner.nextLine());
  
  System.out.print("Enter player constitution: ");
  int constitution = Integer.parseInt(scanner.nextLine());
  
  System.out.print("Enter player intelligence: ");
  int intelligence = Integer.parseInt(scanner.nextLine());
  
  System.out.print("Enter player wisdom: ");
  int wisdom = Integer.parseInt(scanner.nextLine());
  
  System.out.print("Enter player charisma: ");
  int charisma = Integer.parseInt(scanner.nextLine());
    
  
  Player player = new Player(name,race, level, strength, dexterity, constitution, intelligence, wisdom, charisma);
  
  System.out.print("Choose your race:\n1. Human\n2. Elf\n3. Dwarf\n4. Halfling\n5. Dragonborn\n6. Gnome\n7. Half-Elf\n8. Half-Orc\n9. Tiefling\n");
  int raceChoice = Integer.parseInt(scanner.nextLine());
 switch(raceChoice) {
    case 1:
        String humanLanguage = getLanguageInput(scanner, "What human language do you want to know?");
        player.setRace(new Human(player.name, player.age,player.background ,humanLanguage));
        break;
    case 2:
        String elfLanguage = getLanguageInput(scanner, "What elvish language do you want to know?");
        player.setRace(new Elf(elfLanguage));
        break;
    case 3:
        String dwarfLanguage = getLanguageInput(scanner, "What dwarven language do you want to know?");
        player.setRace(new Dwarf(dwarfLanguage));
        break;
    case 4:
        player.setRace(new Halfling());
        break;
    case 5:
        String breathWeapon = getBreathWeaponInput(scanner, "What type of breath weapon do you want to have?");
        player.setRace(new Dragonborn(breathWeapon));
        break;
    case 6:
        player.setRace(new Gnome());
        break;
    case 7:
        player.setRace(new HalfElf());
        break;
    case 8:
        player.setRace(new HalfOrc());
        break;
    case 9:
        String infernalLanguage = getLanguageInput(scanner, "What infernal language do you want to know?");
        player.setRace(new Tiefling(player.name, player.age, infernalLanguage, player.getChar
  
  System.out.print("Choose your background:\n1. Acolyte\n2. Charlatan\n3. Criminal\n4. Entertainer\n5. Folk Hero\n6. Guild Artisan\n7. Hermit\n8. Noble\n9. Outlander\n10. Sage\n11. Sailor\n12. Soldier\n13. Urchin\n");
  int backgroundChoice = Integer.parseInt(scanner.nextLine());
  switch(backgroundChoice) {
    case 1:
      player.setBackground(new Acolyte());
      break;
    case 2:
      player.setBackground(new Charlatan());
      break;
    case 3:
      player.setBackground(new Criminal());
      break;
    case 4:
      player.setBackground(new Entertainer());
      break;
    case 5:
      player.setBackground(new FolkHero());
      break;
    case 6:
      player.setBackground(new GuildArtisan());
      break;
    case 7:
      player.setBackground(new Hermit());
      break;
    case 8:
      player.setBackground(new Noble());
      break;
    case 9:
      player.setBackground(new Outlander());
      break;
    case 10:
      player.setBackground(new Sage());
      break;
    case 11:
      player.setBackground(new Sailor());
      break;
    case 12:
      player.setBackground(new Soldier());
      break;
    case 13:
      player.setBackground(new Urchin());
      break;
    default:
      System.out.println("Invalid choice");
      break;
  }
  
  System.out.print("Choose your class:\n1. Fighter\n2. Rogue\n3. Wizard\n4. Cleric\n5. Paladin\n6. Barbarian\n7. Bard\n8. Ranger\n9. Sorcerer\n10. Monk\n11. Druid\n");
  
  int classChoice = Integer.parseInt(scanner.nextLine());
  
  switch(classChoice) {
    case 1:
      Fighter fighter = new Fighter(player);
      // Use fighter class methods
      break;
    case 2:
      Rogue rogue = new Rogue(player);
      // Use rogue class methods
      break;
    case 3:
      Wizard wizard = new Wizard(player);
      // Use wizard class methods
      break;
    case 4:
      Cleric cleric = new Cleric(player);
      // Use cleric class methods
      break;
    case 5:
      Paladin paladin = new Paladin(player);
      // Use paladin class methods
      break;
    case 6:
      Barbarian barbarian = new Barbarian(player);
      // Use barbarian class methods
      break;
    case 7:
      Bard bard = new Bard(player);
      // Use bard class methods
      break;
    case 8:
      Ranger ranger = new Ranger(player);
      // Use ranger class methods
      break;
    case 9:
      Sorcerer sorcerer = new Sorcerer(player);
      // Use sorcerer class methods
      break;
    case 10:
      Monk monk = new Monk(player);
      // Use monk class methods
      break;
    case 11:
      Druid druid = new Druid(player);
      // Use druid class methods
      break;
    default:
      System.out.println("Invalid choice");
      break;
  }
}

private static String getLanguageInput(Scanner scanner, String prompt) {
  System.out.print(prompt + " ");
  return scanner.nextLine();
}

private static String getBreathWeaponInput(Scanner scanner, String prompt) {
  System.out.print(prompt + " ");
  return scanner.nextLine();
}
}