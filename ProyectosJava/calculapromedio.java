import javax.swing.JOptionPane;

public class calculapromedio{
    public static void main(String[] args) { 

        String nom = JOptionPane.showInputDialog("Escriba el nombre del estudiante ");
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la primera nota:"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la segunda nota:"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tercera nota:"));
        double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cuarta nota:"));

        double promedio = (nota1 + nota2 + nota3 + nota4) / 4;

        String mensaje =  "El nombre del estudiante "+ " "+nom +"\n" + "El promedio es: " + promedio;

        if (promedio > 90) {
            mensaje += "\nEl estudiante pasa";
        } else {
            mensaje += "\nEl estudiante debe repetir";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
