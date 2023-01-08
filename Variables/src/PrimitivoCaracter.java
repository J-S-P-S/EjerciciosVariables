public class PrimitivoCaracter {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;
        char simbolo = '@';
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("simbolo = " + simbolo);
        System.out.println();

        System.out.println("char equivalente en byte = " + Character.BYTES);
        System.out.println("char equivalente en bites = " + Character.SIZE);
        System.out.println("Mínimo valor para char = " + Character.MIN_VALUE);
        System.out.println("Máximo valor para char = " + Character.MAX_VALUE);
        System.out.println("System.lineSeparator() = " + System.lineSeparator() + "Sebas");

    }
}