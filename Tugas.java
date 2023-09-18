import java.util.Scanner;
public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tipe barang :");
        String tipeBarang = sc.nextLine();
        System.out.println("Jumlah barang : ");
        int jumlahBarang = sc.nextInt();

        System.out.println("Barang dalam gudang");
        System.out.println("Tipe barang\t\tJumlah");
        System.out.println(tipeBarang+"\t\t\t"+jumlahBarang);
}
}