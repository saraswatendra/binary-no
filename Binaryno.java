import java.util.Scanner;
public class Binaryno {
    static Scanner key = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the digit");
        int input = key.nextInt();
        for (int i = 0; i < Math.pow(2, input); i++) {
            String x1 = dtob(i);
            System.out.println(x1);
        }
    }
    public static String dtob(int decimal) {
        String binary = "";
        while (decimal != 0)

        {

            binary = (decimal % 2) + binary;

            decimal = decimal / 2;

        }

        return binary;

    }
}



