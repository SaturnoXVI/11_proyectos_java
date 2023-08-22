import javax.swing.*;

public class calificaciones {

    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("¿Cual es tu nombre?");

        double calificacion1 = Double
                .parseDouble(JOptionPane.showInputDialog("¿Cual es tu calificación en el primer examen?"));
        double calificacion2 = Double
                .parseDouble(JOptionPane.showInputDialog("¿Cual es tu calificación en el segundo examen?"));
        double calificacion3 = Double
                .parseDouble(JOptionPane.showInputDialog("¿Cual es tu calificación en el tercer examen?"));

        double promedio = (calificacion1 + calificacion2 + calificacion3) / 3;

        promedio += 1;

        JOptionPane.showMessageDialog(null, nombre +
                "\ntu calificación final es " + promedio);
    }
}
