/*
Short Description:  This class provides a method to convert a binary number contained in a string to a decimal number
                    If the string does not represent a binary number because the string contains numbers other than
                    1 or 0, or if the string contains non-numeric values, an error message is thrown in a custom
                    error message in such a way that the calling program knows why the string errored out.
Author:  Brian Wiatrek
Date:  August 27, 2024
*/
import java.lang.Math;

public class bin2decconversion {
    public static class BinaryFormatException extends Exception {
        public BinaryFormatException(String errorMessage) {
            super(errorMessage);
        }
    }
    public static int bin2dec(String binaryNumber) throws BinaryFormatException {

        final int baseConv = 2;

        String errorMessage;

        int tempDecimal;
        int decimalNumber = 0;
        for (int iter=1; iter<=binaryNumber.length(); iter++){
            try {
                tempDecimal = Integer.parseInt(String.valueOf(binaryNumber.charAt(binaryNumber.length() - iter)));
            }
            catch (NumberFormatException ex) {
                errorMessage = String.format("Non numeric value %c found in string", binaryNumber.charAt(binaryNumber.length() - iter));
                throw new BinaryFormatException(errorMessage);
            }
            if ((tempDecimal != 0) && (tempDecimal != 1)) {
                errorMessage = String.format("%d is not a binary number", tempDecimal);
                throw new BinaryFormatException(errorMessage);
            }
            decimalNumber += (int) (tempDecimal*Math.pow(baseConv,iter-1));
        }
        return decimalNumber;
    }
}
