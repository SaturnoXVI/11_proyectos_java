import javax.swing.*;

public class sueldoBanco {

    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("¿Cuál es tu nombre?");

        int sueldo = Integer.parseInt(JOptionPane.showInputDialog("¿Cuánto es tu sueldo?"));

        int gasto1 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuánto gastaste en el primer gasto?"));
        int gasto2 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuánto gastaste en el segundo gasto?"));
        int gasto3 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuánto gastaste en el tercer gasto?"));

        int saldo = sueldo - gasto1 - gasto2 - gasto3;

        JOptionPane.showMessageDialog(null, nombre + "\ntu saldo final es " + saldo);
    }
}
