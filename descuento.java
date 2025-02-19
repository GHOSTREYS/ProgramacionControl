import javax.swing.*;

public class descuento {
    public static void main(String[] args) {
        double precio=0.0;
        double descuento=0.0;
        double total= 0.0;
        String salida="";




        precio=Integer.parseInt(JOptionPane.showInputDialog("introduce el precio"));

        if (precio >=100){
            descuento=precio*0.10;
            total=precio-descuento;

        }else{
            descuento=precio*0.05;
            total=precio-descuento;

            JOptionPane.showMessageDialog(null,"el precio total a pagar "+ total);
        }
    }
}
