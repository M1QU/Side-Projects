package Attributes;




import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class Constitution {
      int constitutionMod, constitution;
        public int getConstitutionScore(){
        Scanner kb = new Scanner(System.in);
        System.out.println("What is the constitution score?");
        int constitution = kb.nextInt();
        return constitution;
        }
        
        public final int getConMod() {    
        if (constitution > 29) 
            constitutionMod = 10;
        if (constitution >= 28 && constitution <= 29) 
            constitutionMod = 9;
        if (constitution >= 26 && constitution <= 27) 
            constitutionMod = 8;
        if (constitution >= 24 && constitution <= 25) 
            constitutionMod = 7;
        if (constitution >= 22 && constitution <= 23) 
            constitutionMod = 6;
        if (constitution >= 20 && constitution <= 21) 
            constitutionMod = 5;
        if (constitution >= 18 && constitution <= 19) 
            constitutionMod = 4;
        if (constitution >= 16 && constitution <= 17) 
            constitutionMod = 3;
        if (constitution >= 14 && constitution <= 15) 
            constitutionMod = 2;
        if (constitution >= 12 && constitution <= 13) 
            constitutionMod = 1;
        if (constitution >= 10 && constitution <= 11) 
            constitutionMod = 0;
        if (constitution >= 8 && constitution <= 9) 
            constitutionMod = -1;
        if (constitution >= 6 && constitution <= 7) 
            constitutionMod = -2;
        if (constitution >= 4 && constitution <= 5) 
            constitutionMod = -3;
        if (constitution >= 2 && constitution <= 3) 
            constitutionMod = -4;
        if (constitution == 1) 
            constitutionMod = -5;
        return constitutionMod;
        }
        public void writeOutput(){
                    if (constitution > 29) 
            constitutionMod = 10;
        if (constitution >= 28 && constitution <= 29) 
            constitutionMod = 9;
        if (constitution >= 26 && constitution <= 27) 
            constitutionMod = 8;
        if (constitution >= 24 && constitution <= 25) 
            constitutionMod = 7;
        if (constitution >= 22 && constitution <= 23) 
            constitutionMod = 6;
        if (constitution >= 20 && constitution <= 21) 
            constitutionMod = 5;
        if (constitution >= 18 && constitution <= 19) 
            constitutionMod = 4;
        if (constitution >= 16 && constitution <= 17) 
            constitutionMod = 3;
        if (constitution >= 14 && constitution <= 15) 
            constitutionMod = 2;
        if (constitution >= 12 && constitution <= 13) 
            constitutionMod = 1;
        if (constitution >= 10 && constitution <= 11) 
            constitutionMod = 0;
        if (constitution >= 8 && constitution <= 9) 
            constitutionMod = -1;
        if (constitution >= 6 && constitution <= 7) 
            constitutionMod = -2;
        if (constitution >= 4 && constitution <= 5) 
            constitutionMod = -3;
        if (constitution >= 2 && constitution <= 3) 
            constitutionMod = -4;
        if (constitution == 1) 
            constitutionMod = -5;
        System.out.println("Constitution: " + constitution);
        System.out.println("Constitution Mod: " + constitutionMod);
      
        }
    
}
