package practical_1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;

public class B3 {

    private Scanner userInput = new Scanner(System.in);
    private String input;
    private static boolean result = true;

    private Stack<Character> bracketList = new Stack<Character>();

    public void enterBracket() {
        System.out.print("Enter Bracket: ");
        input = userInput.nextLine();
    }

    public void checkBracket() {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '{' || input.charAt(i) == '(' || input.charAt(i) == '[') {
                bracketList.push(input.charAt(i));
            }

            else if (input.charAt(i) == '}' || input.charAt(i) == ')' || input.charAt(i) == ']') {
                switch (bracketList.pop()) {
                    case '{':
                        if (input.charAt(i) != '}') {
                            result = false;
                        }
                        break;
                        
                    case '(':
                        if (input.charAt(i) != ')') {
                            result = false;
                        }
                        break;
                        
                    case '[':
                        if (input.charAt(i) != ']') {
                            result = false;
                        }    
                        break;
                }

            }
        }
    }
    
    public static void main(String[] args) 
    {
        B3 scoreApp = new B3();
        scoreApp.enterBracket();
        scoreApp.checkBracket();
        if(result == true)
        {
            System.out.println("Result : True");
        }
        else
        {
            System.out.println("Result : False");
        }
    }
}
