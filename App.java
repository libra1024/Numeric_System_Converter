import java.util.*;

/*
 * AUTHOR: libra1024
 * DATE: 2022/09/27
 * NAME: NUMERIC SYSTEM CONVERTER
 * VERSION: 000
 */

public class App {

    /**
     * It checks if a character is a hexadecimal digit
     * 
     * @param character The character to be checked.
     * @return The method returns true if the character is a hexadecimal digit, and
     *         false otherwise.
     */
    public static boolean itsHexa(char character) {
        // Converting the character to uppercase.
        char aux = Character.toUpperCase(character);
        // Checking if the character is a hexadecimal digit.
        if ((aux >= '0' && aux <= '9') || (aux >= 'A' && aux <= 'F'))
            return true;
        else
            return false;
    }

    /**
     * It returns the decimal value of a hexadecimal character
     * 
     * @param character The character to be converted to a hexadecimal value.
     * @return The value of the hexadecimal character.
     */
    public static double getHexaToDecimalValue(char character) {
        double value = 0;
        // Checking if the character is a hexadecimal digit.
        if (itsHexa(Character.toTitleCase(character)) == true) {
            // A switch statement that is used to assign a value to the variable value.
            switch (Character.toTitleCase(character)) {
                case '0':
                    value = 0;
                    break;
                case '1':
                    value = 1;
                    break;
                case '2':
                    value = 2;
                    break;
                case '3':
                    value = 3;
                    break;
                case '4':
                    value = 4;
                    break;
                case '5':
                    value = 5;
                    break;
                case '6':
                    value = 6;
                    break;
                case '7':
                    value = 7;
                    break;
                case '8':
                    value = 8;
                    break;
                case '9':
                    value = 9;
                    break;
                case 'A':
                    value = 10;
                    break;
                case 'B':
                    value = 11;
                    break;
                case 'C':
                    value = 12;
                    break;
                case 'D':
                    value = 13;
                    break;
                case 'E':
                    value = 14;
                    break;
                case 'F':
                    value = 15;
                    break;
            }
        }
        return value;
    }

    /**
     * It takes a hexadecimal string and converts it to a decimal number
     * 
     * @param hexaStr The hexadecimal number as a string.
     * @param len     the length of the hexadecimal string
     * @return The decimal value of the hexadecimal number.
     */
    public static double hexaToDecimal(String hexaStr, int len) {

        String aux = hexaStr;
        // Finding the index of the decimal point in the string.
        int point = aux.indexOf('.');

        double hexaBase = 1;
        double intDecimal = 0;
        double fracDecimal = 0;

        // Converting the integer part of the hexadecimal number to decimal.
        for (int i = point - 1; i >= 0; i--) {
            intDecimal += getHexaToDecimalValue(aux.charAt(i)) * hexaBase;
            hexaBase *= 16;
        }

        // The base of the hexadecimal number system.
        hexaBase = 16;

        // Converting the fractional part of the hexadecimal number to decimal.
        for (int i = point + 1; i < len; i++) {
            fracDecimal += getHexaToDecimalValue(aux.charAt(i)) / hexaBase;
            hexaBase *= 16;
        }

        // Returning the sum of the integer part and the fractional part of the
        // hexadecimal number.
        return intDecimal + fracDecimal;
    }

    
  /**
   * If the character is between 0 and 7, return true, otherwise return false
   * 
   * @param character The character to check.
   * @return A boolean value.
   */
    public static boolean itsOctal(char character) {
       // Checking if the character is between 0 and 7.
        if (character >= '0' && character <= '7')
            return true;
        else
            return false;
    }

   /**
    * This function takes a character as an argument and returns the decimal value of the character
    * 
    * @param character The character that is being checked.
    * @return The value of the character.
    */
    public static double getOctalToDecimalValue(char character) {
        double value = 0;
      // Checking if the character is between 0 and 7.
        if (itsOctal(character) == true) {
            // Assigning a value to the variable value.
            switch (character) {

                case '0':
                    value = 0;
                    break;
                case '1':
                    value = 1;
                    break;
                case '2':
                    value = 2;
                    break;
                case '3':
                    value = 3;
                    break;
                case '4':
                    value = 4;
                    break;
                case '5':
                    value = 5;
                    break;
                case '6':
                    value = 6;
                    break;
                case '7':
                    value = 7;
                    break;
            }
        }
        return value;
    }

   /**
    * It takes the octal string and converts it to decimal by first converting the integer part of the
    * octal string to decimal and then converting the fractional part of the octal string to decimal
    * 
    * @param octalStr The octal number in string format.
    * @param len The length of the string.
    * @return The decimal value of the octal number.
    */
    public static double octalToDecimal(String octalStr, int len) {

        String aux = octalStr;
        // Finding the index of the decimal point in the string.
        int point = aux.indexOf('.');

        double octalBase = 1;
        double intDecimal = 0;
        double fracDecimal = 0;

       // Converting the integer part of the octal number to decimal.
        for (int i = point - 1; i >= 0; i--) {
            intDecimal += getOctalToDecimalValue(aux.charAt(i)) * octalBase;
            octalBase *= 8;
        }

       // The base of the octal number system.
        octalBase = 8;

       // Converting the fractional part of the octal number to decimal.
        for (int i = point + 1; i < len; i++) {
            fracDecimal += getOctalToDecimalValue(aux.charAt(i)) / octalBase;
            octalBase *= 8;
        }

       // Returning the sum of the integer part and the fractional part of the octal number.
        return intDecimal + fracDecimal;
    }

   /**
    * It converts a hexadecimal character to its binary equivalent
    * 
    * @param character The character to be converted.
    * @return A string with the binary value of the hexadecimal character.
    */
    public static String getHexaToBinary(char character){

        String value = "";

        if(itsHexa(Character.toUpperCase(character))){
            switch(Character.toUpperCase(character)){
                case '0':
                value = "0000";
                break;
            case '1':
                value = "0001";
                break;
            case '2':
                value = "0010";
                break;
            case '3':
                value = "0011";
                break;
            case '4':
                value = "0100";
                break;
            case '5':
                value = "0101";
                break;
            case '6':
                value = "0110";
                break;
            case '7':
                value = "0111";
                break;
            case '8':
                value = "1000";
                break;
            case '9':
                value = "1001";
                break;
            case 'A':
                value = "1010";
                break;
            case 'B':
                value = "1011";
                break;
            case 'C':
                value = "1100";
                break;
            case 'D':
                value = "1101";
                break;
            case 'E':
                value = "1110";
                break;
            case 'F':
                value = "1111";
                break;   
            }
        }

        return value;
    }

    public static void main(String[] args) {
        String num = "12.a";
        System.out.println(hexaToDecimal(num, num.length()));
        num = "12.1";
        System.out.println(octalToDecimal(num, num.length()));
        System.out.println(getHexaToBinary('a'));

    }
}