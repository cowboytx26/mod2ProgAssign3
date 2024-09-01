/*
Short Description:  This program will take three strings and attempt to convert them from binary numbers to decimal.
                    The first string is a real binary number; however, the second two strings are not binary numbers.
                    The program catches the custom error thrown displaying appropriate information to the console as
                    to the reason why the strings could not be converted to decimal.
Author:  Brian Wiatrek
Date:  August 31, 2024
*/
public class Main {
    public static void main(String[] args) throws bin2decconversion.BinaryFormatException {
        String binaryString = "101";
        try {
            System.out.printf("%s converted: %d\n", binaryString, bin2decconversion.bin2dec(binaryString));
        }
        catch (bin2decconversion.BinaryFormatException binException) {
            System.out.printf("%s is not a binary number. ", binaryString);
            System.out.println(binException.getMessage());
        }

        binaryString = "1B1";
        try {
            System.out.printf("%s converted: %d\n", binaryString, bin2decconversion.bin2dec(binaryString));
        }
        catch (bin2decconversion.BinaryFormatException binException) {
            System.out.printf("%s is not a binary number. ", binaryString);
            System.out.println(binException.getMessage());
        }

        binaryString = "151";
        try {
            System.out.printf("%s converted: %d\n", binaryString, bin2decconversion.bin2dec(binaryString));
        }
        catch (bin2decconversion.BinaryFormatException binException) {
            System.out.printf("%s is not a binary number. ", binaryString);
            System.out.println(binException.getMessage());
        }
    }
}