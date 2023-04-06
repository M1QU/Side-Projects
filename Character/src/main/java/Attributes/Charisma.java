package Attributes;




import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class Charisma {
      int charismaMod, charisma;
        public int getCharismaScore(){
        Scanner kb = new Scanner(System.in);
        System.out.println("What is the charisma score?");
        int charisma = kb.nextInt();
        return charisma;
        }
        
        public int getChaMod() {    
        if (charisma > 29) 
            charismaMod = 10;
        if (charisma >= 28 && charisma <= 29) 
            charismaMod = 9;
        if (charisma >= 26 && charisma <= 27) 
            charismaMod = 8;
        if (charisma >= 24 && charisma <= 25) 
            charismaMod = 7;
        if (charisma >= 22 && charisma <= 23) 
            charismaMod = 6;
        if (charisma >= 20 && charisma <= 21) 
            charismaMod = 5;
        if (charisma >= 18 && charisma <= 19) 
            charismaMod = 4;
        if (charisma >= 16 && charisma <= 17) 
            charismaMod = 3;
        if (charisma >= 14 && charisma <= 15) 
            charismaMod = 2;
        if (charisma >= 12 && charisma <= 13) 
            charismaMod = 1;
        if (charisma >= 10 && charisma <= 11) 
            charismaMod = 0;
        if (charisma >= 8 && charisma <= 9) 
            charismaMod = -1;
        if (charisma >= 6 && charisma <= 7) 
            charismaMod = -2;
        if (charisma >= 4 && charisma <= 5) 
            charismaMod = -3;
        if (charisma >= 2 && charisma <= 3) 
            charismaMod = -4;
        if (charisma == 1) 
            charismaMod = -5;
        return charismaMod;
        }
        public void writeOutput(){
                    if (charisma > 29) 
            charismaMod = 10;
        if (charisma >= 28 && charisma <= 29) 
            charismaMod = 9;
        if (charisma >= 26 && charisma <= 27) 
            charismaMod = 8;
        if (charisma >= 24 && charisma <= 25) 
            charismaMod = 7;
        if (charisma >= 22 && charisma <= 23) 
            charismaMod = 6;
        if (charisma >= 20 && charisma <= 21) 
            charismaMod = 5;
        if (charisma >= 18 && charisma <= 19) 
            charismaMod = 4;
        if (charisma >= 16 && charisma <= 17) 
            charismaMod = 3;
        if (charisma >= 14 && charisma <= 15) 
            charismaMod = 2;
        if (charisma >= 12 && charisma <= 13) 
            charismaMod = 1;
        if (charisma >= 10 && charisma <= 11) 
            charismaMod = 0;
        if (charisma >= 8 && charisma <= 9) 
            charismaMod = -1;
        if (charisma >= 6 && charisma <= 7) 
            charismaMod = -2;
        if (charisma >= 4 && charisma <= 5) 
            charismaMod = -3;
        if (charisma >= 2 && charisma <= 3) 
            charismaMod = -4;
        if (charisma == 1) 
            charismaMod = -5;
        System.out.println("Charisma: " + charisma);
        System.out.println("Charisma Mod: " + charismaMod);
        }
    
}
