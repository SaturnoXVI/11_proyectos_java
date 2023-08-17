import javax.swing.JOptionPane;

public class redondiarnum {

    public static void main(String[] args) {
        String nom = JOptionPane.showInputDialog("Ingrese su nombre:");
        String input = JOptionPane.showInputDialog("ingrese el numero : ");
        double numero = Double.parseDouble(input);

       
        int numeronredo= (int) Math.round(numero);

        
        JOptionPane.showMessageDialog(null,"Hola "+nom + "\n" +
         "El numero redondiado es: " + numeronredo);
    }
}
