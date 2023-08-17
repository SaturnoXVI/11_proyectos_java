import javax.swing.JOptionPane;

public class elevarnum {
    public static void main(String[] args) {
        
         String nom = JOptionPane.showInputDialog("Ingrese su nombre:");
        String numInput = JOptionPane.showInputDialog("Ingrese un número:");
        String potenciaInput = JOptionPane.showInputDialog("Ingrese la potencia a la que desea elevar el número:");

      
        double numero = Double.parseDouble(numInput);
        double potencia = Double.parseDouble(potenciaInput);

       
        double resultado = Math.pow(numero, potencia);

        
        String mensaje =
        "Hola :" + nom +"\n" + 
             "El numero: " + numero + "\n" 
                 + "Elevado a la potencia. " + potencia +"\n" 
                      +"Es: " + resultado;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
