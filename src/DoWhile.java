import java.util.Arrays;
import java.util.Scanner;

public class DoWhile {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int[] numbersList = new int[5];
        System.out.println("Digite 5 números: ");

        do {
            System.out.println("Número na posição " + number + ":");
            numbersList[number] = scanner.nextInt();
            number += 1;
        } while(number < 5);

        System.out.println("A lista de 5 números é: " + Arrays.toString(numbersList));
        scanner.close();
    }
}
