import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k, n1 = 0, n2 = 1, n3;

        System.out.print("Kaç Elemanlı Olacağını Girin: ");
        k = input.nextInt();
        System.out.print(n1 + " " + n2);
        for (int i = 2; i <= k; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;

        }


    }
}
