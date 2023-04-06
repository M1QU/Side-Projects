package Attributes;




import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class Dexterity {
            int dexterityMod, dexterity;
        public int getDexterityScore(){
        Scanner kb = new Scanner(System.in);
        System.out.println("What is the dexterity score?");
        int dexterity = kb.nextInt();
        return dexterity;
        }
        
        public int getDexMod() {    
        if (dexterity > 29) 
            dexterityMod = 10;
        if (dexterity >= 28 && dexterity <= 29) 
            dexterityMod = 9;
        if (dexterity >= 26 && dexterity <= 27) 
            dexterityMod = 8;
        if (dexterity >= 24 && dexterity <= 25) 
            dexterityMod = 7;
        if (dexterity >= 22 && dexterity <= 23) 
            dexterityMod = 6;
        if (dexterity >= 20 && dexterity <= 21) 
            dexterityMod = 5;
        if (dexterity >= 18 && dexterity <= 19) 
            dexterityMod = 4;
        if (dexterity >= 16 && dexterity <= 17) 
            dexterityMod = 3;
        if (dexterity >= 14 && dexterity <= 15) 
            dexterityMod = 2;
        if (dexterity >= 12 && dexterity <= 13) 
            dexterityMod = 1;
        if (dexterity >= 10 && dexterity <= 11) 
            dexterityMod = 0;
        if (dexterity >= 8 && dexterity <= 9) 
            dexterityMod = -1;
        if (dexterity >= 6 && dexterity <= 7) 
            dexterityMod = -2;
        if (dexterity >= 4 && dexterity <= 5) 
            dexterityMod = -3;
        if (dexterity >= 2 && dexterity <= 3) 
            dexterityMod = -4;
        if (dexterity == 1) 
            dexterityMod = -5;
        return dexterityMod;
        }
    public void writeOutput() {
        if (dexterity > 29) {
            dexterityMod = 10;
        }
        if (dexterity >= 28 && dexterity <= 29) {
            dexterityMod = 9;
        }
        if (dexterity >= 26 && dexterity <= 27) {
            dexterityMod = 8;
        }
        if (dexterity >= 24 && dexterity <= 25) {
            dexterityMod = 7;
        }
        if (dexterity >= 22 && dexterity <= 23) {
            dexterityMod = 6;
        }
        if (dexterity >= 20 && dexterity <= 21) {
            dexterityMod = 5;
        }
        if (dexterity >= 18 && dexterity <= 19) {
            dexterityMod = 4;
        }
        if (dexterity >= 16 && dexterity <= 17) {
            dexterityMod = 3;
        }
        if (dexterity >= 14 && dexterity <= 15) {
            dexterityMod = 2;
        }
        if (dexterity >= 12 && dexterity <= 13) {
            dexterityMod = 1;
        }
        if (dexterity >= 10 && dexterity <= 11) {
            dexterityMod = 0;
        }
        if (dexterity >= 8 && dexterity <= 9) {
            dexterityMod = -1;
        }
        if (dexterity >= 6 && dexterity <= 7) {
            dexterityMod = -2;
        }
        if (dexterity >= 4 && dexterity <= 5) {
            dexterityMod = -3;
        }
        if (dexterity >= 2 && dexterity <= 3) {
            dexterityMod = -4;
        }
        if (dexterity == 1) {
            dexterityMod = -5;
        }
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Dexterity Mod: " + dexterityMod);
    }


    
}
