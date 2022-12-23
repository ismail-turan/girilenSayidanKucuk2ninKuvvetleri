import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n, toplam=1;
        System.out.print("Sayi Giriniz :");
        n=scanner.nextInt();
        do {
            System.out.print(toplam+", ");
            toplam*=2;
        }while (toplam<n);

    }
}