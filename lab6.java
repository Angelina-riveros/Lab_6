public class Lab6 {

    // Converts a roman numeral String to an arabic numeral integer using recursion
    public static int convertToArabic(String roman) {
        // TODO: implement this method
    	if(roman.isEmpty()) {
        return 0;
    	}
    	
    	int theVal = valOfRoman(roman.charAt(0));
    	if((roman.length()>1)&&(theVal<valOfRoman(roman.charAt(1)))) {
    		return convertToArabic(roman.substring(1)) - theVal;
    	}else {
    		return theVal + convertToArabic(roman.substring(1));
    	}
    }
    
    private static int valOfRoman(char romanLetter) {
    	if (romanLetter == 'I') {
    		return 1;
    	}else if(romanLetter == 'V') {
    		return 5;
    	}else if(romanLetter == 'X') {
    		return 10;
    	}else if(romanLetter == 'L') {
    		return 50;
    	}else if(romanLetter == 'C') {
    		return 100;
    	}else if(romanLetter == 'D') {
    		return 500;
    	}else {
    		return 1000;
    	}
    }
    
    
    public static void main(String[] args) {
        System.out.println("X --> " + convertToArabic("X"));
        System.out.println("IX --> " + convertToArabic("IX"));
        System.out.println("XIX --> " + convertToArabic("XIX"));
        System.out.println("MCMIX --> " + convertToArabic("MCMIX"));
        System.out.println("MDLXXV --> " + convertToArabic("MDLXXV"));
        System.out.println("MDCCLXXXVII --> " + convertToArabic("MDCCLXXXVII"));
    }
   
}
