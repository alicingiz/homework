import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("olcu sayini qeyd edin");
        int olcu = scanner.nextInt();
        System.out.println("olcu: " + olcu);
        int[] array = new int[olcu];


        int sum = 0;
        int i = 0;


        int digit = 0;
        while (i < olcu) {
            System.out.println("eded daxil edin");

            int eded = scanner.nextInt();
            int number = eded;
            while (number > 0) {
                digit = number % 10;
                sum = sum + digit;
                number = number / 10;

            }

            if (sum % 2 == 1) {
                array[i] = eded;
                i++;

            }
            sum = 0;


        }

        for (int a = 0; a < array.length; a++) {
            System.out.print(array[a]+" ");
        }

    }

}



