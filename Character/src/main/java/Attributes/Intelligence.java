package Attributes;




import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class Intelligence {
      int intelligenceMod, intelligence;
        public int getIntelligenceScore(){
        Scanner kb = new Scanner(System.in);
        System.out.println("What is the intelligence score?");
        int intelligence = kb.nextInt();
        return intelligence;
        }
        
        public int getIntMod() {    
        if (intelligence > 29) 
            intelligenceMod = 10;
        if (intelligence >= 28 && intelligence <= 29) 
            intelligenceMod = 9;
        if (intelligence >= 26 && intelligence <= 27) 
            intelligenceMod = 8;
        if (intelligence >= 24 && intelligence <= 25) 
            intelligenceMod = 7;
        if (intelligence >= 22 && intelligence <= 23) 
            intelligenceMod = 6;
        if (intelligence >= 20 && intelligence <= 21) 
            intelligenceMod = 5;
        if (intelligence >= 18 && intelligence <= 19) 
            intelligenceMod = 4;
        if (intelligence >= 16 && intelligence <= 17) 
            intelligenceMod = 3;
        if (intelligence >= 14 && intelligence <= 15) 
            intelligenceMod = 2;
        if (intelligence >= 12 && intelligence <= 13) 
            intelligenceMod = 1;
        if (intelligence >= 10 && intelligence <= 11) 
            intelligenceMod = 0;
        if (intelligence >= 8 && intelligence <= 9) 
            intelligenceMod = -1;
        if (intelligence >= 6 && intelligence <= 7) 
            intelligenceMod = -2;
        if (intelligence >= 4 && intelligence <= 5) 
            intelligenceMod = -3;
        if (intelligence >= 2 && intelligence <= 3) 
            intelligenceMod = -4;
        if (intelligence == 1) 
            intelligenceMod = -5;
        return intelligenceMod;
        }
        
    public void writeOutput(){
        if (intelligence > 29) 
            intelligenceMod = 10;
        if (intelligence >= 28 && intelligence <= 29) 
            intelligenceMod = 9;
        if (intelligence >= 26 && intelligence <= 27) 
            intelligenceMod = 8;
        if (intelligence >= 24 && intelligence <= 25) 
            intelligenceMod = 7;
        if (intelligence >= 22 && intelligence <= 23) 
            intelligenceMod = 6;
        if (intelligence >= 20 && intelligence <= 21) 
            intelligenceMod = 5;
        if (intelligence >= 18 && intelligence <= 19) 
            intelligenceMod = 4;
        if (intelligence >= 16 && intelligence <= 17) 
            intelligenceMod = 3;
        if (intelligence >= 14 && intelligence <= 15) 
            intelligenceMod = 2;
        if (intelligence >= 12 && intelligence <= 13) 
            intelligenceMod = 1;
        if (intelligence >= 10 && intelligence <= 11) 
            intelligenceMod = 0;
        if (intelligence >= 8 && intelligence <= 9) 
            intelligenceMod = -1;
        if (intelligence >= 6 && intelligence <= 7) 
            intelligenceMod = -2;
        if (intelligence >= 4 && intelligence <= 5) 
            intelligenceMod = -3;
        if (intelligence >= 2 && intelligence <= 3) 
            intelligenceMod = -4;
        if (intelligence == 1) 
            intelligenceMod = -5;
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Intelligence Mod: " + intelligenceMod);
    }
}
