import javax.swing.JOptionPane;

public class numeroaleatorio {
    public static void main(String[] args) {
        String nom = JOptionPane.showInputDialog("Ingrese su nombre:");
        String minStr = JOptionPane.showInputDialog("Ingrese el numero minimo");
        String maxStr = JOptionPane.showInputDialog("Ingrese el valor maximo ");
        
        try {
            
            int min = Integer.parseInt(minStr);
            int max = Integer.parseInt(maxStr);
            
            
            int numeroAleatorio = min + (int) (Math.random() * (max - min + 1));
            
           
            JOptionPane.showMessageDialog(null, "Hola. "+ nom +"\n"
            +"El numero aleatorio generado: " + numeroAleatorio);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error porfavor nngrese valores numericos válidos.");
        }
    }
}
