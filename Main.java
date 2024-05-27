import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int km;
        double perKm= 2.20, total=10;

        Scanner inp= new Scanner(System.in);

        System.out.print("Gidilen mesafeyi(KM) giriniz :  ");
        km= inp.nextInt();

        total += km*perKm;

total= (total<20) ? 20.0 : total;

        System.out.print("Tutar :  " +total );

    }
}