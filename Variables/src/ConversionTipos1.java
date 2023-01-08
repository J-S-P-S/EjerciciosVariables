public class ConversionTipos1 {

    public static void main(String[] args) {

            String numeroStr = "50";

            int numeroInt = Integer.parseInt(numeroStr);
            System.out.println("numeroInt = " + numeroInt);

            String realStr = "98765.43e-3";
            double realDoble = Double.parseDouble(realStr);
            System.out.println("realDoble = " + realDoble);

            String logicoStr = "TrUe";
            boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
            System.out.println("logicoBoolean = " + logicoBoolean);

            Byte.parseByte(logicoStr);
            Long.parseLong(logicoStr);
            Float.parseFloat(logicoStr);


    }
}