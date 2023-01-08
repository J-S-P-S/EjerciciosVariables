public class SistemasNumericos {

    public static void main(String[] args) {

            int numeroDecimal = 500;
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



    }
}