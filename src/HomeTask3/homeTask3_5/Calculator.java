package HomeTask3.homeTask3_5;

public class Calculator {
    private int result;

    public int calculate(int operand1, int operand2, char symbol) {
        switch (symbol) {
            case '+': {
                result = operand1 + operand2;
                return result;
            }
            case '-': {
                result = operand1 - operand2;
                return result;
            }
            case '*': {
                result = operand1 * operand2;
                return result;
            }
            case '/': {
                result = operand1 / operand2;
                return result;
            }
            case '%': {
                result = operand1 % operand2;
                return result;
            }
            default: {
                System.out.println("Данная операция не поддерживается");
                return result;
            }
        }
    }
}
