import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        int L,JB;
        String alert = "program ini hanya bisa melipatkan bilangan 3 dan 5 saja";

        Scanner input = new Scanner(System.in);

        System.out.println("Bilangan kelipatan 3 dan 5");
        System.out.println("Masukkan bilangan yang ingin anda lipatkan: ");
        JB = input.nextInt();
        if (JB == 3) {
            System.out.println("Masukkan limit:");
            L = input.nextInt();
            System.out.println("Hasil: ");
            for (int a = 3; a <= L; a=a+3) {
               System.out.println(a);
            }
        }else if (JB == 5) {
            System.out.println("Masukkan limit:");
            L = input.nextInt();
            System.out.println("Hasil: ");
            for (int a = 5; a <= L; a=a+5) {
               System.out.println(a);
            }
        } else {
            System.out.println(alert);
            System.exit(0);
        }
    }
}
