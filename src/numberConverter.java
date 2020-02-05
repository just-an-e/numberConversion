import java.util.Scanner;

public class numberConverter {
    public numberConverter(){

    }
    public int toDec (int base, String number){
        Scanner theScanner = new Scanner(System.in);
        char thing;
        int length, multiplier, digit = 0, answer, sum = 0;
        double x = 0, place;

        length = number.length() - 1;

        for(int i = length; i >= 0; i--)
        {
            thing = number.charAt(i);
            switch(thing)
            {
                case('0'):
                {
                    digit = 0;
                    break;
                }
                case('1'):
                {
                    digit = 1;
                    break;
                }
                case('2'):
                {
                    digit = 2;
                    break;
                }
                case('3'):
                {
                    digit = 3;
                    break;
                }
                case('4'):
                {
                    digit = 4;
                    break;
                }
                case('5'):
                {
                    digit = 5;
                    break;
                }
                case('6'):
                {
                    digit = 6;
                    break;
                }
                case('7'):
                {
                    digit = 7;
                    break;
                }
                case('8'):
                {
                    digit = 8;
                    break;
                }
                case('9'):
                {
                    digit = 9;
                    break;
                }
                case('A'):
                {
                    digit = 10;
                    break;
                }
                case('B'):
                {
                    digit = 11;
                    break;
                }
                case('C'):
                {
                    digit = 12;
                    break;
                }
                case('D'):
                {
                    digit = 13;
                    break;
                }
                case('E'):
                {
                    digit = 14;
                    break;
                }
                case('F'):
                {
                    digit = 15;
                    break;
                }
                default:
                {
                    digit = 0;
                    break;
                }
            }

            if(x == 0)
            {
                multiplier = 1;
            }
            else
            {
                place = Math.pow(base, x);
                multiplier = (int)place;
            }
            answer = digit * multiplier;

            System.out.println("The digit is " + digit);
            System.out.println("The multiplier is " + multiplier);
            System.out.println("The answer is " + answer);
            System.out.println("");

            sum = sum + answer;

            x++;
        }

        System.out.println("The final conversion is " + sum);

        return sum;
    }
    public String decTo(int base, int num) {
        int answer, remander, x, y;
        String result = "";
        Scanner theScanner = new Scanner(System.in);


        y = base; //base you are converting to

        x = num; //number you are converting

        do
        {
            answer = x / y;
            remander = x % y;
            System.out.println("Remainder is " + remander);
            x = answer;
            switch(remander)
            {
                case(10):
                {
                    result = result + "A";
                    break;
                }
                case(11):
                {
                    result = result + "B";
                    break;
                }
                case(12):
                {
                    result = result + "C";
                    break;
                }
                case(13):
                {
                    result = result + "D";
                    break;
                }
                case(14):
                {
                    result = result + "E";
                    break;
                }
                case(15):
                {
                    result = result + "F";
                    break;
                }
                default:{
                    result = result + remander;
                    break;
                }
            }
        }
        while(answer != 0);


        return result;
    }
}
