public class PrimitivoEntero {
    public static void main(String[] args) {


        byte numeroByte = 127;

        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Byte = " + Byte.BYTES);
        System.out.println("Byte equivalente en bits es = " + Byte.SIZE);
        System.out.println("Valor mínimo de un byte = " + Byte.MIN_VALUE);
        System.out.println("Valor máximo de un byte= " + Byte.MAX_VALUE);

        System.out.println();

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Byte = " + Short.BYTES);
        System.out.println("Byte equivalente en bits es = " + Short.SIZE);
        System.out.println("Valor mínimo de un short = " + Short.MIN_VALUE);
        System.out.println("Valor máximo de un short= " + Short.MAX_VALUE);

        System.out.println();

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Byte = " + Integer.BYTES);
        System.out.println("Tipo int equivalente en bits es = " + Integer.SIZE);
        System.out.println("Valor mínimo de un int = " + Integer.MIN_VALUE);
        System.out.println("Valor máximo de un int= " + Integer.MAX_VALUE);

        System.out.println();

        long numeroLong = 9223372036854775807L; //Convertir el entero 2147483648 en long se pone al final L en mayúscula
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Byte = " + Long.BYTES);
        System.out.println("Tipo int equivalente en bits es = " + Long.SIZE);
        System.out.println("Valor mínimo de un int = " + Long.MIN_VALUE);
        System.out.println("Valor máximo de un int= " + Long.MAX_VALUE);
    }
}