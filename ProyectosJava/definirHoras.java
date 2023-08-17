import javax.swing.JOptionPane;

public class definirHoras {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Ingrese el numero de horas que quiere calcular:");
        int totalHours = Integer.parseInt(input);
        
        int semanas = totalHours / 168;  
        int horasRestantes = totalHours % 168;
        
        int dias = horasRestantes / 24; 
        int horas = horasRestantes % 24;
        
        String resultado = "las horas a cacular son :\n" + "Semanas: " + semanas + "\n"+ "Días: " + dias + "\n" 
                          + "Horas: " + horas;
        
        JOptionPane.showMessageDialog(null, resultado);
    }
}
