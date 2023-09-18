import java.util.Scanner;
public class Segitiga23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan alas :");
        int alas = sc.nextInt();
        System.out.println("Masukkan tinggi : ");
        int tinggi = sc.nextInt();
        float luas = alas * tinggi;
        System.out.println("Luas segitiga : " + luas);
    }    
}
