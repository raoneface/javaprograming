
public class typeconversion {

    public static void main(String[] args) {
        // Implicit conversion
        // (byte to int)
        byte b = 24;
        int i;

        i = b;
        System.out.println(i); // 24

        // character to int
        char c = 'a';
        int i1;

        i1 = c;
        System.out.println(i1); // 97

        // Explicit conversion
        int i2 = 300;
        byte b1;  //(-128 to 127)

        b1 = (byte) i2;
        System.out.println(b1);  // 300 % 256 = 44

        // Truncating conversion
        float f = 15.678f;
        int i3;
        i3 = (int) f;
        System.out.println(i3);

        // boolean to any data type
        // these conversions are not possible

        /*    boolean bool = false;
        int i4 ;
        i4 = (int)bool;
        System.out.println(i4); */
        // automatic type promotions
        byte b4 = 50;
        b4 = (byte) (50 * 2);
        System.out.println(b4);

    }
}
