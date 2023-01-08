import javax.swing.*;

public class SistemasNumericos2 {


    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un número entero");
        int numeroDecimal = Integer.parseInt(numeroStr);
        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("numero binario de  = " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println("numero octal de  = " + Integer.toOctalString(numeroDecimal));

        int numeroOctal = 0764;
        System.out.println("numero octal = " + numeroOctal);

        System.out.println("numero hexadecimal de  = " + Integer.toHexString(numeroDecimal));
        int numeroHex = 0x1f4;

        System.out.println("numeroHex = " + numeroHex);

        String mensaje = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        mensaje += " \n numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        mensaje += " \n numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        JOptionPane.showMessageDialog(null, mensaje);
    }
}