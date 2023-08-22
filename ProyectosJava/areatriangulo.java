import javax.swing.JOptionPane;

public class areatriangulo {
    public static void main(String[] args) {
        
        String baseStr = JOptionPane.showInputDialog("Ingrese la base del triángulo:");
        
       
        String alturaStr = JOptionPane.showInputDialog("Ingrese la altura del triángulo:");
        
        try {
           
            double base = Double.parseDouble(baseStr);
            double altura = Double.parseDouble(alturaStr);
            
           
            double area = (base * altura) / 2;
            
           
            JOptionPane.showMessageDialog(null, "El área del triángulo es: " + area);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Ingrese valores numéricos válidos.");
        }
    }
}
