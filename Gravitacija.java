import java.util.*;

public class Gravitacija {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double C = Double.parseDouble("6.674E-11");
        double M = Double.parseDouble("5.972E24");
        double r = Double.parseDouble("6.371E6");
        double v = sc.nextDouble(); // visina
        
        double a = (C*M)/((r+v)*(r+v));

        //System.out.println(a);

        System.out.println("OIS je zakon!");

    }
}