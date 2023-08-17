/**
 *
 * @author Juan
 */


    
import javax.swing.JOptionPane;

public class agosto17 {

    public static void main(String[] args) {
        String nom1;
        String nom2;

       
        nom1 = JOptionPane.showInputDialog("Escriba su nombre");
        nom2 = JOptionPane.showInputDialog("Escriba su apellido");

     
        String numeroStr1 = JOptionPane.showInputDialog("Hola " + nom1 + " " + nom2 + ". Ingresa el primer número:");
        double numero1 = Double.parseDouble(numeroStr1);

        String numeroStr2 = JOptionPane.showInputDialog("Ingresa el segundo número:");
        double numero2 = Double.parseDouble(numeroStr2);

    

        String[] opciones = {"Sumar", "Restar", "Multiplicar", "Dividir"};
        int seleccion = JOptionPane.showOptionDialog(null, "Selecciona una operación:", "Calculadora", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

      
        double resultado = 0;
        String operacion = "";

        switch (seleccion) {
            case 0:
                resultado = numero1 + numero2;
                operacion = "Suma";
                break;
            case 1:
                resultado = numero1 - numero2;
                operacion = "Resta";
                break;
            case 2:
                resultado = numero1 * numero2;
                operacion = "Multiplicación";
                break;
            case 3:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    operacion = "División";
                } 
                
           
        }

        JOptionPane.showMessageDialog(null, "Hola " + nom1 + " " + nom2 +"\n" +" El resultado de la " + operacion + " es: "+"\n" + resultado);
    }
}
