public class Presenter {

    public Presenter() {
    }

    public static void start() throws IllegalAccessException {


        UI input = new UI();
        String flag = "y";
        while (flag.equals("y")) {
            if (input.chooseTypeNumber() == "r") {
                String readText = View.getArithmeticReal();
                Parser parserReal = new Parser(readText);
                CalcRealExpression rationalReal = new CalcRealExpression(parserReal);
                View.printResultRealExpression(rationalReal.solveReal());

            } else {
                String[] complexOperand = View.getArithmeticComplex();


                Parser parserComplex = new Parser(complexOperand);

                CalcComplexExpression rationalComplex = new CalcComplexExpression(parserComplex.getNumber1().getReal(), parserComplex.getOperation1(), parserComplex.getNumber1().getImage(),
                        parserComplex.getOperation(), parserComplex.getNumber2().getReal(), parserComplex.getOperation2(), parserComplex.getNumber2().getImage());

                System.out.println("\n Rezult:");
                System.out.println(rationalComplex.solveComplex());
            }
            flag = input.chooseExitContue();

        }
    }
}