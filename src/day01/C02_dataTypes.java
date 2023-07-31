package day01;

public class C02_dataTypes {

    public static void main(String[] args) {

        byte by1 = Byte.MAX_VALUE;
        byte by2 = Byte.MIN_VALUE;
        System.out.println("Byte  Max. Değer = " + by1); // 127
        System.out.println("Byte  Min. Değer = " + by2); // -128

        short sh1 = Short.MAX_VALUE;
        short sh2 = Short.MIN_VALUE;
        System.out.println("Short  Max. Değer = " + sh1); // 32767
        System.out.println("Short  Min. Değer= " + sh2); // -32768

        int in1 = Integer.MAX_VALUE;
        int in2 = Integer.MIN_VALUE;
        System.out.println("Integer  Max. Değer  = " + in1); // 2147483647
        System.out.println("Integer  Min. Değer  = " + in2); // -2147483648

        long l1 = Long.MAX_VALUE;
        long l2 = Long.MIN_VALUE;
        System.out.println("Long  Max. Değer  = " + l1); // 9223372036854775807
        System.out.println("Long  Min. Değer  = " + l2); // -9223372036854775808

        float fl1 = Float.MAX_VALUE;
        float fl2 = Float.MIN_VALUE;
        System.out.println("Float  Max. Değer  = " + fl1); // 3.4028235E38
        System.out.println("Float  Min. Değer  = " + fl2); // 1.4E-45

        double dbl1 = Double.MAX_VALUE;
        double dbl2 = Double.MIN_VALUE;
        System.out.println("Double  Max. Değer  = " + dbl1); // 1.7976931348623157E308
        System.out.println("Double  Min. Değer = " + dbl2); // 4.9E-324

        String isim="Omer Karahan";
        System.out.println("isim: " + isim); // isim: Omer Karahan

        char karakter='b';
        System.out.println("karakter : " + karakter); // karakter : b





    }
}
