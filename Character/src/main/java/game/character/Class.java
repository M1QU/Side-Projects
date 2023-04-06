package game.character;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class Class {
    Scanner kb = new Scanner(System.in);
//    String paladin, cleric, wizard, druid, barbarian, rogue, fighter, ranger;
    int classOp;
    
   public String classChoice;
  
   //Array of classes
    public String classes[] = {"Paladin","Cleric","Wizard","Druid","Barbarian","Rogue","Fighter","Ranger"};
    
    
    public enum Classes {
        PALADIN, CLERIC, WIZARD, DRUID, BARBARIAN, ROGUE, FIGHTER, RANGER
    }
    
    
    public int getLevel() {
        System.out.println("what level are you?");
        int level = kb.nextInt();
        System.out.print("\n");
        return level;
    }

    
    public int getClassName()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("What is your class?(Select using the number value)");
        System.out.println("1. Paladin");
        System.out.println("2. Cleric");
        System.out.println("3. Wizard");
        System.out.println("4. Druid");
        System.out.println("5. Barbarian");
        System.out.println("6. Rogue");
        System.out.println("7. Fighter");
        System.out.println("8. Ranger");
       
        classOp = kb.nextInt();
        System.out.println("\n");
        return classOp;
    }
    public String writeOutput()
    {
        switch (classOp) {
            case 1:  classChoice = "Paladin";
                     break;
            case 2:  classChoice = "Cleric";
                     break;
            case 3:  classChoice = "Wizard";
                     break;
            case 4:  classChoice = "Druid";
                     break;
            case 5:  classChoice = "Barbarian";
                     break;
            case 6:  classChoice = "Rogue";
                     break;
            case 7:  classChoice = "Fighter";
                     break;
            case 8:  classChoice = "Ranger";
                     break;
 
        }
        return classChoice;
    }
    }
