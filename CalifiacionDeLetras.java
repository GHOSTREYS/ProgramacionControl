
//importamos librerias
import javax.swing.JOptionPane;

public class CalifiacionDeLetras {
    public static void main(String[] args) {
        //declaracion de variables
        double calif;
        char letra = ' ';

        //solicitar datos
        calif = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa tu calificacion"));

        //Proceso
        if(calif < 0 || calif > 10) {
            JOptionPane.showMessageDialog(null, "La calificacion no es valida");
        } else if(calif >= 9) {
            letra = 'A';
        } else if(calif >= 8) {
            letra = 'B';
        } else if(calif >= 7) {
            letra = 'C';
        } else if(calif >= 6) {
            letra = 'D';
        } else {
            letra = 'F';
    
        //salida
        JOptionPane.showMessageDialog(null, "Tu calificacion es: " + letra);
    }
}
