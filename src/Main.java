import java.util.Scanner;
public class Main {
    public static void _2sComp(String bineValue)
    {
        String changeBine = "";
        for(int i=0; i<bineValue.length(); i++)
        {
            if(bineValue.charAt(i)=='0')
            {
                changeBine += 1;
            }
            else
            {
                changeBine += 0;
            }

        }
        System.out.println(changeBine + "  --> 1s complement");
        int length = changeBine.length();
        String afterPlus1 = "";
        char carry = '1';
        for(int j = length-1; j>=0; j--)
        {
            if(changeBine.charAt(j) == '1')
            {
                if(carry == '1')
                {
                    afterPlus1 += "0";
                    carry = '1';
                }
                else
                {
                    afterPlus1 += '1';
                    carry = '0';
                }
            }
            else
            {
                if(carry == '1')
                {
                    afterPlus1 += "1";
                    carry = '0';
                }
                else
                {
                    afterPlus1 += '0';
                    carry = '0';
                }
            }
        }
        String afterPluscorrect = "";
        for(int i=afterPlus1.length()-1; i>=0; i--)
        {
            afterPluscorrect += afterPlus1.charAt(i);
        }
        System.out.println(afterPluscorrect + "  --> 2s complement");
    }
    public static void toBin(int number , boolean isNegative, int numberOfBit) {
        int absNumber = Math.abs(number);
        String bitString = "";

        for(int i = numberOfBit-1; i>=0; i--)
        {
            if(absNumber>=Math.pow(2,i))
            {
                absNumber -= Math.pow(2,i);
                bitString += "1";
            }
            else
            {
                bitString += "0";
            }
        }
        System.out.println(bitString + "  --> binary number");

        if(isNegative)
        {
            _2sComp(bitString);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int number = scan.nextInt();
        System.out.print("How many digits in number that number system: ");
        int numberOfDigit = scan.nextInt();
        boolean isNegative = false;
        if (number<0)
        {
            isNegative = true;
        }
        toBin(number, isNegative, numberOfDigit);

    }
}