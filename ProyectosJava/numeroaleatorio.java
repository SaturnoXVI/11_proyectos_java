import javax.swing.JOptionPane;

public class numeroaleatorio {
    public static void main(String[] args) {
        
        String nom = JOptionPane.showInputDialog("Ingrese su nombre  ");
        String minStr = JOptionPane.showInputDialog("Ingrese un numero minimo: ");
        
        String maxStr = JOptionPane.showInputDialog("Ingrese un numero maximo: ");
        
        try {
            
            int min = Integer.parseInt(minStr);
            int max = Integer.parseInt(maxStr);
            
            
            int numeroAleatorio = min + (int) (Math.random() * (max - min + 1));
            
            
            JOptionPane.showMessageDialog(null,"Hola " +nom +"\n"+ "Número aleatorio generado: " + numeroAleatorio);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Ingrese valores numéricos válidos.");
        }
    }
}