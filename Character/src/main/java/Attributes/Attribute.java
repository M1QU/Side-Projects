
package Attributes;

/**
 *
 * @author Owner
 */
public class Attribute {
 
        StrengthScore stre = new StrengthScore();
        Dexterity dext = new Dexterity();
        Constitution cons = new Constitution();
        Intelligence intell = new Intelligence();
        Wisdom wisd = new Wisdom();
        Charisma chari = new Charisma();
        
        
        
        public enum AttributeTypes{
            Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma;
            
        }
        
        
        
        
        
        
        //Reads user input for Attribute score
        public int readStr(){
            stre.strength = stre.getStrengthScore();
            return stre.strength;
        }
        public int readDex(){
            dext.dexterity = dext.getDexterityScore();
            return dext.dexterity;
        }
        public int readCon(){
            cons.constitution = cons.getConstitutionScore();
            return cons.constitution;
        }
        public int readInt(){
            intell.intelligence = intell.getIntelligenceScore();
            return intell.intelligence;
        }
        public int readWis(){
            wisd.wisdom = wisd.getWisdomScore();
            return wisd.wisdom;
        }
        public int readCha(){
            chari.charisma = chari.getCharismaScore();
            return chari.charisma;
        }

        //returns Attribute Modifiers
        public int readStrMod(){
       return stre.getStrMod();
        }
        public int readDexMod(){
        
        return dext.getDexMod();
        }
         public int readConMod(){
        
       return cons.getConMod();
        }
        public int readIntMod(){
        
       return intell.getIntMod();
        }
         public int readWisMod(){
        
        return wisd.getWisMod();
        }
        public int readChaMod(){
        
       return chari.getChaMod();
        }
        
        //displays Attribute score and Attribute Modifiers
        public void writeOutputStr(){
            stre.writeOutput();
        }
          public void writeOutputDex(){
            dext.writeOutput();
        }
          public void writeOutputCon(){
            cons.writeOutput();
        }
         public void writeOutputInt(){
            intell.writeOutput();
        }
         public void writeOutputWis(){
            wisd.writeOutput();
        }
         public void writeOutputCha(){
                chari.writeOutput();     
        }

        
       
       
       
       
       
       
       
        


}

