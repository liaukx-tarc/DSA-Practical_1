package practical_1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;

public class B4 {

    private Scanner userInput = new Scanner(System.in);
    private String input;

    private static Stack<Float> operandList = new Stack<Float>();

    public void enterFormula() {
        System.out.print("Enter Formula: ");
        input = userInput.nextLine();
    }

    public void calculate() {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 48 && input.charAt(i) <= 57) {
                float num = input.charAt(i) - 48;
                operandList.push(num);
            } else if (input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*' || input.charAt(i) == '/') {
                float num1 = operandList.pop();
                float num2 = operandList.pop();

                switch (input.charAt(i)) {
                    case '+':
                        operandList.push(num2 + num1);
                        break;

                    case '-':
                        operandList.push(num2 - num1);
                        break;
                    case '*':
                        operandList.push(num2 * num1);
                        break;
                    case '/':
                        operandList.push(num2 / num1);
                        break;
                }
            }
        }
    }
    
    public static void main(String[] args)
    {
        B4 scoreApp = new B4();
        scoreApp.enterFormula();
        scoreApp.calculate();
        System.out.println("Result : " + operandList.pop());
    }
}
