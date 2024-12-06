import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersList = new int[5];
        System.out.println("Digite 5 números: ");

        for (int i = 0; i < 5; i++){
            System.out.printf("Número na posição " + i + ":");
            numbersList[i] = scanner.nextInt();
        }

        System.out.println("A lista de 5 números é: " + Arrays.toString(numbersList));
        scanner.close();
    }
}