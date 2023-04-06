package Attributes;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class StrengthScore {

    int strengthMod, strength;

    public int getStrengthScore() {
        Scanner kb = new Scanner(System.in);
        System.out.println("What is the Strength score?");
        int strength = kb.nextInt();
        return strength;
    }

    public int getStrMod() {
        if (strength > 29) {
            strengthMod = 10;
        }
        if (strength >= 28 && strength <= 29) {
            strengthMod = 9;
        }
        if (strength >= 26 && strength <= 27) {
            strengthMod = 8;
        }
        if (strength >= 24 && strength <= 25) {
            strengthMod = 7;
        }
        if (strength >= 22 && strength <= 23) {
            strengthMod = 6;
        }
        if (strength >= 20 && strength <= 21) {
            strengthMod = 5;
        }
        if (strength >= 18 && strength <= 19) {
            strengthMod = 4;
        }
        if (strength >= 16 && strength <= 17) {
            strengthMod = 3;
        }
        if (strength >= 14 && strength <= 15) {
            strengthMod = 2;
        }
        if (strength >= 12 && strength <= 13) {
            strengthMod = 1;
        }
        if (strength >= 10 && strength <= 11) {
            strengthMod = 0;
        }
        if (strength >= 8 && strength <= 9) {
            strengthMod = -1;
        }
        if (strength >= 6 && strength <= 7) {
            strengthMod = -2;
        }
        if (strength >= 4 && strength <= 5) {
            strengthMod = -3;
        }
        if (strength >= 2 && strength <= 3) {
            strengthMod = -4;
        }
        if (strength == 1) {
            strengthMod = -5;
        }
        return strengthMod;
    }

    public void writeOutput() {
        if (strength > 29) {
            strengthMod = 10;
        }
        if (strength >= 28 && strength <= 29) {
            strengthMod = 9;
        }
        if (strength >= 26 && strength <= 27) {
            strengthMod = 8;
        }
        if (strength >= 24 && strength <= 25) {
            strengthMod = 7;
        }
        if (strength >= 22 && strength <= 23) {
            strengthMod = 6;
        }
        if (strength >= 20 && strength <= 21) {
            strengthMod = 5;
        }
        if (strength >= 18 && strength <= 19) {
            strengthMod = 4;
        }
        if (strength >= 16 && strength <= 17) {
            strengthMod = 3;
        }
        if (strength >= 14 && strength <= 15) {
            strengthMod = 2;
        }
        if (strength >= 12 && strength <= 13) {
            strengthMod = 1;
        }
        if (strength >= 10 && strength <= 11) {
            strengthMod = 0;
        }
        if (strength >= 8 && strength <= 9) {
            strengthMod = -1;
        }
        if (strength >= 6 && strength <= 7) {
            strengthMod = -2;
        }
        if (strength >= 4 && strength <= 5) {
            strengthMod = -3;
        }
        if (strength >= 2 && strength <= 3) {
            strengthMod = -4;
        }
        if (strength == 1) {
            strengthMod = -5;
            
            System.out.println("Strength: " + strength);
            System.out.println("Strength Mod: " + strengthMod);
        }

    }
    
    }
    
    