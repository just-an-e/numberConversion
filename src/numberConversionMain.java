import java.util.Scanner;

public class numberConversionMain {
    //Justin Ecarma
    //2/5/2020
    //Number Conversion Lab
    //No Extra
    public static void main(String[] args) {
        Scanner theScanner = new Scanner(System.in);

        String sbase, cbase, number;

        do {
            do {
                System.out.println("Enter what base you are starting with. (b/h/d/bcd) ");
                sbase = theScanner.next();
            }
            while (!sbase.equalsIgnoreCase("b") && !sbase.equalsIgnoreCase("bcd") && !sbase.equalsIgnoreCase("d") && !sbase.equalsIgnoreCase("h"));

            do {
                System.out.println("Enter what base you are starting with. (b/h/d/bcd) ");
                cbase = theScanner.next();
            }
            while (!sbase.equalsIgnoreCase("b") && !sbase.equalsIgnoreCase("bcd") && !sbase.equalsIgnoreCase("d") && !sbase.equalsIgnoreCase("h"));

            if (sbase.equalsIgnoreCase("b")) {
                do {
                    System.out.println("Enter a binary number");
                    number = theScanner.next();
                }
                while(binaryCheck(number));

                if (sbase.equalsIgnoreCase("h")) {
                    do {
                        System.out.println("Enter a hexadecimal number");
                        number = theScanner.next();
                    }
                    while(binaryCheck(number));
                } else if (sbase.equalsIgnoreCase("d")) {

                } else {

                }

            } else if (sbase.equalsIgnoreCase("h")) {

            } else if (sbase.equalsIgnoreCase("d")) {

            } else {

            }
        }
        while(!sbase.equals("q"));
    }
    public static boolean binaryCheck(String number){

        boolean isBinary = true;

        for(int i = 0; i < number.length(); i++){
            if(number.charAt(i) != '1' || number.charAt(i) != '0'){
                isBinary = false;
            }
        }

        return isBinary;
    }
    public static boolean hexCheck(String number){

        boolean isHex = true;

        for(int i = 0; i < number.length(); i++){
            if(number.charAt(i) != '1' || number.charAt(i) != '0'){
                isHex = false;
            }
        }

        return isHex;
    }
}

