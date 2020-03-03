import com.sun.prism.shader.Solid_ImagePattern_Loader;
import sun.awt.geom.AreaOp;

import java.util.Scanner;

public class numberConversionMain {
    //Justin Ecarma
    //2/5/2020
    //Number Conversion Lab
    //No Extra e
    public static void main(String[] args) {
        Scanner theScanner = new Scanner(System.in);
        numberConverter theConverter = new numberConverter();


        String sbase, cbase, number = "";

        do {
            do {
                System.out.println("Enter what base you are starting with. (b/h/d/bcd) ");
                sbase = theScanner.next();
            }
            while (!sbase.equalsIgnoreCase("b") && !sbase.equalsIgnoreCase("bcd") && !sbase.equalsIgnoreCase("d") && !sbase.equalsIgnoreCase("h"));

            do {
                System.out.println("Enter what base you are converting to. (b/h/d/bcd) ");
                cbase = theScanner.next();
            }
            while ((!cbase.equalsIgnoreCase("b") && !cbase.equalsIgnoreCase("bcd") && !cbase.equalsIgnoreCase("d") && !cbase.equalsIgnoreCase("h") && !sbase.equals(cbase)));

            if (sbase.equalsIgnoreCase("b")) {
                do {
                    System.out.println("Enter a binary number");
                    number = theScanner.next();
                }
                while(binaryCheck(number));

                if (cbase.equalsIgnoreCase("h")) {

                    number = theConverter.decTo(cbase, theConverter.toDec(sbase, number));

                } else if (cbase.equalsIgnoreCase("d")) {

                    number = theConverter.toDec(sbase, number);


                } else {

                }

            } else if (sbase.equalsIgnoreCase("h")) {

            } else if (sbase.equalsIgnoreCase("d")) {

            } else {

            }

            System.out.println(number);
        }
        while(!sbase.equals("q"));
    }
    public static boolean binaryCheck(String number){

        boolean isBinary = false;

        for(int i = 0; i < number.length(); i++){
            if(!((number.charAt(i) == '1') || (number.charAt(i) == '0')|| (number.charAt(i) == '.'))){
                isBinary = true;
            }
        }

        return isBinary;
    }
    public static boolean decCheck(String number){

        boolean isBinary = false;

        for(int i = 0; i < number.length(); i++){
            if (!((number.charAt(i) != '1') || (number.charAt(i) != '0') || (number.charAt(i) != '2') || (number.charAt(i) != '3') || (number.charAt(i) != '4') || (number.charAt(i) != '6') || (number.charAt(i) != '7') || (number.charAt(i) != '8') || (number.charAt(i) != '9'))) {
                isBinary = true;
            }
        }

        return isBinary;
    }
    public static boolean hexCheck(String number){

        boolean isHex = false;

        for(int i = 0; i < number.length(); i++){
            if(!((number.charAt(i) != '1') || (number.charAt(i) != '0') || (number.charAt(i) != '2') || (number.charAt(i) != '3') || (number.charAt(i) != '4') || (number.charAt(i) != '6') || (number.charAt(i) != '7') || (number.charAt(i) != '8') || (number.charAt(i) != '9') || (number.charAt(i) != 'A') || (number.charAt(i) != 'B') || (number.charAt(i) != 'C') || (number.charAt(i) != 'D') || (number.charAt(i) != 'E') || (number.charAt(i) != 'F'))){
                isHex = true;
            }
        }

        return isHex;
    }
}

