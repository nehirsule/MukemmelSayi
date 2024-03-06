import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan sayıyı iste ve kaydet
        System.out.println("Bir Sayı Giriniz : ");
        int n = input.nextInt();
        int total = 0;


        //1 den sayıya kadar olan tüm bölenleri belirle ve topla
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                total += i;
            }
        }

        // belirlenip toplanan sayının tam bölenleri n sayısına eşit ise mükemmel; değilse değildir yazdır .
        if (total == n) {
            System.out.println(n + " Sayısı Mükemmel Sayıdır.");
        } else {
            System.out.println(n + "Sayısı Mükemmel Sayı Değildir .");
        }
    }
}