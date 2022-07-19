package JavaPractice;

public class Q03_PrimitiveDataType {
    public static void main(String[] args) { /*
         * Primitive data type
                byte: only takes whole numbers
                short: only takes whole numbers
                int(used more often): only takes whole numbers
                long: only takes whole numbers
                float: can take decimals (MUST have F or f at the end)
                double( used more often): can take decimals
                boolean: true or false boolean expressions
                char: character within single quote ''
                        also takes number
         * Range: double > float >long > int >short > byte
         */
        //byte, short, integer,long, double, float veri tiplerinin max ve min degerlerini yazdiralim.
        //long, double, float veri tiplerinin max ve min degerlerini yazdiralim.
        //Her veri turuyle bir tane olmak uzere 4 degisken olusturun (float, double, char, boolean)
        //Degiskenler icin anlamli isimler kullanip, yazdiralim


        int intMax= Integer.MAX_VALUE;
        int intMin= Integer.MIN_VALUE;
        System.out.println("int Max="+intMax);
        System.out.println(intMin);

        byte byteMax= Byte.MAX_VALUE;
        byte byteMin=Byte.MIN_VALUE;
        System.out.println("byteMax="+byteMax);
        System.out.println("byteMin="+byteMin);
        short shortMax=Short.MAX_VALUE;
        short shortMin=Short.MIN_VALUE;
        System.out.println("shortMax="+shortMax);
        System.out.println("shortMin"+shortMin);
        long longMax=Long.MAX_VALUE;
        long longMin=Long.MIN_VALUE;
        System.out.println("longmax="+longMax);
        System.out.println("longMin="+longMin);
        float floatMax=Float.MAX_VALUE;
        float floatMin=Float.MIN_VALUE;
        System.out.println("floatMax="+floatMax);
        System.out.println("floatMin="+floatMin);
        double doubleMax=Double.MAX_VALUE;
        double doubleMin=Double.MIN_VALUE;
        System.out.println("doubleMax="+doubleMax);
        System.out.println("doubleMin="+doubleMin);



    }
}
