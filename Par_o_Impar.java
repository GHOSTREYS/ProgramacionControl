import javax.swing.*;

public class Par_o_Impar {
    public static void main(String[] args) {
        int num1=0;
        String salida="";
        num1=Integer.parseInt(JOptionPane.showInputDialog(null,"introduce un numero"));

        if (num1%2==0){
            salida=(" el numero es par");

        }else
            salida=("El numero es impar");

        JOptionPane.showMessageDialog(null,salida);




    }
}
