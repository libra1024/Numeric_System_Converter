import java.util.*;

public class MainBinary {
    /**
     * It takes a binary string and returns the decimal equivalent of it
     * 
     * @param binary The binary number to be converted to decimal.
     * @param len    The length of the binary number.
     * @return The decimal value of the binary number.
     */
    static double binaryToDecimal(String binary, int len) {

        // Finding the index of the decimal point in the binary number.
        int point = binary.indexOf('.');

        // If the binary number does not have a decimal point, then the index of the
        // decimal point is
        // set to the length of the binary number.
        if (point == -1)
            point = len;

        double intDecimal = 0,
                fracDecimal = 0,
                twos = 1;

        // Converting the integer part of the binary number to decimal.
        for (int i = point - 1; i >= 0; i--) {
            if (binary.indexOf(i) != '-') {
                intDecimal += (binary.charAt(i) - '0') * twos;
                twos *= 2;
            }
        }

        // Converting the fractional part of the binary number to decimal.
        twos = 2;
        for (int i = point + 1; i < len; i++) {
            fracDecimal += (binary.charAt(i) - '0') / twos;
            // fracDecimal += Math.pow(twos, -1 * (binary.charAt(i)-'0'));
            twos *= 2.0;
        }

        return intDecimal + fracDecimal;
    }

    public static void main(String[] args) {
        String n = "110.101";
        System.out.println(binaryToDecimal(n, n.length()));

    }

}
