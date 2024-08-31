public class bin2decconversion {
    public int bin2dec(String binaryNumber){

        int tempDecimal = 0;
        int decimalNumber = 0;
        for (int iter=1; iter<binaryNumber.length(); iter++){
            tempDecimal = (int) binaryNumber.charAt(binaryNumber.length() - iter);
            decimalNumber += tempDecimal;

        }
        return decimalNumber;
    }
}
