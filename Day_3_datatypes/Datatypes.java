
public class Datatypes {

    public static void main(String[] args) {
        /* 
            premitive datatypes
            integer value --> byte short int long
            real values --> float double
                    
            binary number(2) , octal number(8) , Hexadecimal number(16) 
        
         */
        
        // integer values

        byte b = 5;
        // byte b = 0b101; (binary repersentation of)
        // byte b = 0116; (octal)  ( 0 - 7)
        // byte b = 0x5;  (Hexadecimal) ( 0 - 15 ) --> A,B,C,D,E,F

        short s = 10;
        int i = 4000;
        long l = 10_000;

        // real values
        float f = 10.f; // SINGLE PRECISION
        //double d = 23.0987; // DOUBLE PRECISION
        double d = 6.022e23; // scintific  6.02 * 10^23

        // character value  
        // use single quetes
        char c = 'c';


        // boolean
        boolean bool = false;
        System.out.println("Integer value -->" + b + " , " + s + " , " + i + " , " + l);
        System.out.println("Floating values -->" + f + " , " + d);
        System.out.println("Character value -->" + c);
        System.out.println("Boolean value --> " + bool);
    }
}
