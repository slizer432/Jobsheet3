public class ContohOperator23 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("x++ = " + x++);
        System.out.println("setelah evaluasi, x = " + x);
        
        x = 10;
        System.out.println("++x = " + ++x);
        System.out.println("setelah evaluasi x = " + x);

        int y = 12;
        System.out.println(x > y || y == x && y <= x);

        int z = x ^ y;
        System.out.println("hasil x^y adalah " + z);

        z %= 2;
        System.out.println("Hasil akhir " + z);
        

    }
    
}
