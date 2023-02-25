import java.util.Scanner;

public class Gravitacija {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble(); // visina

        double a = 9.81;
        izpis(v, a);

        System.out.println("OIS je zakon!");
        
    }

    public static void izpis(double v, double a) {
        System.out.println("Nadmorska višina: " + v);
        System.out.println("Gravitacijski pospešek: " + a);
    }

}