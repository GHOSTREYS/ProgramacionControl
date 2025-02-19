import javax.swing.*;

public class Letra_De_Calificacion {
    public static void main(String[] args) {

        String salida="";
        char letra=' ';
        double calif=0.0;

        calif=Double.parseDouble(JOptionPane.showInputDialog("introduce tu calificacion"));
        if (calif>=0.0 && calif <=10) {
            salida=("tu calificacion no es valida");
            if(calif>=9){
                letra='A';
                salida=("tu calificacion es "+calif+"y tu letra es"+letra);
            } else if (calif>=8) {
                letra='B';
                salida=("tu calificacion es "+calif+"y tu letra es"+letra);
            } else if (calif>=7) {
                letra='C';
                salida=("tu calificacion es "+calif+"y tu letra es"+letra);
            } else if (calif>=6) {
                letra='D';
                salida=("tu calificacion es "+calif+"y tu letra es"+letra);
            } else if (calif<=5) {
                letra='f';
                salida=("tu calificacion es "+calif+"y tu letra es"+letra);


            }

        }else{
            JOptionPane.showMessageDialog(null,"salida");
        }
    }
}




