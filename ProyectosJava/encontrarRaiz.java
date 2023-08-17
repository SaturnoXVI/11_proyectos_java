import javax.swing.JOptionPane;

public class encontrarRaiz {
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Ingrese el numero a calcular:");
    
        double numero = Double.parseDouble(input);
        double raizCuadrada = Math.sqrt(numero);
        
        
        String mensaje = "La raiz de  " + numero + "\n"
        +" s: " + raizCuadrada;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
