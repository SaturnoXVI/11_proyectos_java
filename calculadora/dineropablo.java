import java.util.Scanner;


public class dineropablo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el monto: ");
        int dineroPablo = scanner.nextInt();
 

        
        double dineroJose = 2 * dineroPablo;
        double dineroMiguel = (dineroPablo + dineroJose) / 2;
        
        System.out.println("Pablo tiene: $" + dineroPablo);
        System.out.println("Jose tiene: $" + dineroJose);
        System.out.println("Miguel tiene: $" + dineroMiguel);
    }
}
