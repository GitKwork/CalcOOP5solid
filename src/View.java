import java.util.Objects;
import java.util.Scanner;

public class View {
    public static String getArithmeticReal() {
        String input;
        do {
            System.out.println("Enter MathAritmetics  for example:  5 + 4   using + -  / * ");
            input = new Scanner(System.in).nextLine();
        } while (checkRealExpression(input));
    }

    public static String[] getArithmeticComplex() {
        String[] complexOperand = new String[3];

        do {
            System.out.println("Enter first complex number, as 'x + yi': ");
            complexOperand[0] = new Scanner(System.in).nextLine();
        } while (checkComplexExpression(complexOperand[0]));
        complexOperand[0] = complexOperand[0].replaceAll("i", "");

        do {
            System.out.println("Enter operation: '+' '-' '*' '/' ");
            complexOperand[1] = new Scanner(System.in).nextLine();
        } while (!(complexOperand[1].equals("+") || complexOperand[1].equals("-") || complexOperand[1].equals("*") || complexOperand[1].equals("/")));


        do {
            System.out.println("Enter second complex number, as 'x + yi': ");
            complexOperand[2] = new Scanner(System.in).nextLine();
        } while (checkComplexExpression(complexOperand[2]));
        complexOperand[2] = complexOperand[2].replaceAll("i", "");

        System.out.println("\n Èñõîäíîå àðèôìåòè÷åñêîå âûðàæåíèå:");


        System.out.println("(" + complexOperand[0] + "i) " + complexOperand[1] + " (" + complexOperand[2] + "i)");
        return complexOperand;
    }

    public static void printResultRealExpression(double str) {
        System.out.println("\n Rezult: ");
        System.out.println((str));
    }


    public static boolean checkComplexExpression(String expressionComolex) {

        String[] str = expressionComolex.split(" ");
        if (str.length != 3) {
            System.out.println(" incorrect expression");
//            System.out.println(str.length);
            return true;
        }
        if (Objects.equals(str[1], "+") || Objects.equals(str[1], "-")) {
//                System.out.println(Arrays.toString(str));
            if (str[2].endsWith("i")) return false;
            else {
                System.out.println(" incorrect:  at the end there should be 'i");
                return true;
            }
        } else {
            System.out.println(" incorrect arithmetic operation, input + or - ");
            return true;
        }
    }


    public static boolean checkRealExpression(String expressionReal) {
        String[] str = expressionReal.split(" ");

        if (str.length != 3) {
            System.out.println(" incorrect expression");
//            System.out.println(str.length);
            return true;
        }

        switch (str[1]) {
            case "+":
                return false;
            case "-":
                return false;
            case "/":
                return false;
            case "*":
                return false;
            default:
                System.out.println(" incorrect arithmetic operation");
                return true;
        }

    }


}