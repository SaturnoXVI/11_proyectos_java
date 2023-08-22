import javax.swing.*;

public class numerodivi_8 {

    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("ingresa tu nombre");

        int numero = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es el número?"));

        int resultado = (numero / 8) + 12;

        JOptionPane.showMessageDialog(null, nombre +
                "\nel número que dividido entre 8 y el cual le sumas 12 sale 52 es:" + "\n" +
                resultado);
    }
}
