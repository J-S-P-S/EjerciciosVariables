public class ConversionTipos2 {


    public static void main(String[] args) {


            int numeroInt = 100;
//            String numeroStr = Integer.toString(numeroInt);
            String numeroStr = String.valueOf(numeroInt+10);
            System.out.println("numeroStr = " + numeroStr);

            double real = 1.23456e2;
            String numeroRealStr = Double.toString(real + 1.1);
            System.out.println("numeroRealStr = " + numeroRealStr);

            numeroRealStr = String.valueOf(real + 1.2);
            System.out.println("numeroRealStr = " + numeroRealStr);






    }
}