public class PrimitivoFlotante {

    public static void main(String[] args) {

        float realFloat = 1.5e-10f; //0.00000000015f
        float realFloat2 = 0.00000000015f; //1.5e-10f
        System.out.println("realFloat = " + realFloat);
        System.out.println("realFloat2 = " + realFloat2);

        System.out.println();
        realFloat = 3.4028235E38f;
        System.out.println("float corresponde en byte a = " + Float.BYTES);
        System.out.println("float equivalente en bites es = " + Float.SIZE);
        System.out.println("Mínimo valor para float = " + Float.MIN_VALUE);
        System.out.println("Máximo valor para float = " + Float.MAX_VALUE);

        System.out.println();

        double numeroDouble = 1.7976931348623157E308;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("double corresponde en byte a = " + Double.BYTES);
        System.out.println("double equivalente en bites es = " + Double.SIZE);
        System.out.println("Mínimo valor para double = " + Double.MIN_VALUE);
        System.out.println("Máximo valor para double = " + Double.MAX_VALUE);

        var varFlotante = 127d;
        System.out.println("varFlotante = " + varFlotante);


    }
}