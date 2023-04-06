package Attributes;



import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class Wisdom {
      int wisdomMod, wisdom;
        public int getWisdomScore(){
        Scanner kb = new Scanner(System.in);
        System.out.println("What is the wisdom score?");
        int wisdom = kb.nextInt();
        return wisdom;
        }
        
        public int getWisMod() {    
        if (wisdom > 29) 
            wisdomMod = 10;
        if (wisdom >= 28 && wisdom <= 29) 
            wisdomMod = 9;
        if (wisdom >= 26 && wisdom <= 27) 
            wisdomMod = 8;
        if (wisdom >= 24 && wisdom <= 25) 
            wisdomMod = 7;
        if (wisdom >= 22 && wisdom <= 23) 
            wisdomMod = 6;
        if (wisdom >= 20 && wisdom <= 21) 
            wisdomMod = 5;
        if (wisdom >= 18 && wisdom <= 19) 
            wisdomMod = 4;
        if (wisdom >= 16 && wisdom <= 17) 
            wisdomMod = 3;
        if (wisdom >= 14 && wisdom <= 15) 
            wisdomMod = 2;
        if (wisdom >= 12 && wisdom <= 13) 
            wisdomMod = 1;
        if (wisdom >= 10 && wisdom <= 11) 
            wisdomMod = 0;
        if (wisdom >= 8 && wisdom <= 9) 
            wisdomMod = -1;
        if (wisdom >= 6 && wisdom <= 7) 
            wisdomMod = -2;
        if (wisdom >= 4 && wisdom <= 5) 
            wisdomMod = -3;
        if (wisdom >= 2 && wisdom <= 3) 
            wisdomMod = -4;
        if (wisdom == 1) 
            wisdomMod = -5;
        return wisdomMod;
        }
    public void writeOutput(){
        if (wisdom > 29) 
            wisdomMod = 10;
        if (wisdom >= 28 && wisdom <= 29) 
            wisdomMod = 9;
        if (wisdom >= 26 && wisdom <= 27) 
            wisdomMod = 8;
        if (wisdom >= 24 && wisdom <= 25) 
            wisdomMod = 7;
        if (wisdom >= 22 && wisdom <= 23) 
            wisdomMod = 6;
        if (wisdom >= 20 && wisdom <= 21) 
            wisdomMod = 5;
        if (wisdom >= 18 && wisdom <= 19) 
            wisdomMod = 4;
        if (wisdom >= 16 && wisdom <= 17) 
            wisdomMod = 3;
        if (wisdom >= 14 && wisdom <= 15) 
            wisdomMod = 2;
        if (wisdom >= 12 && wisdom <= 13) 
            wisdomMod = 1;
        if (wisdom >= 10 && wisdom <= 11) 
            wisdomMod = 0;
        if (wisdom >= 8 && wisdom <= 9) 
            wisdomMod = -1;
        if (wisdom >= 6 && wisdom <= 7) 
            wisdomMod = -2;
        if (wisdom >= 4 && wisdom <= 5) 
            wisdomMod = -3;
        if (wisdom >= 2 && wisdom <= 3) 
            wisdomMod = -4;
        if (wisdom == 1) 
            wisdomMod = -5;
        System.out.println("Wisdom: " + wisdom);
        System.out.println("Wisdom Mod: " + wisdomMod);
    }
}
