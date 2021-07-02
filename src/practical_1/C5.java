package practical_1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class C5 {

    private Scanner userInput = new Scanner(System.in);

    static boolean result = true;
    String input;
    private static Queue<Character> charQueue = new LinkedList<>();
    private static Stack<Character> charStack = new Stack<Character>();

    public void enterString() {
        System.out.print("Enter String: ");
        input = userInput.nextLine();
    }

    public void checkPalindrome() {
        for (int i = 0; i < input.length(); i++) {
            charStack.push(input.charAt(i));
            charQueue.add(input.charAt(i));
        }

        do {
            if (charStack.pop() != charQueue.poll()) {
                result = false;
            }

        } while (charQueue.isEmpty() || charStack.empty());

    }
    
     public static void main(String[] args) 
    {
        C5 scoreApp = new C5();
        scoreApp.enterString();
        scoreApp.checkPalindrome();
        if(result == true)
        {
            System.out.println("It was Palindrome");
        }
        else
        {
            System.out.println("It not Palindrome");
        }
    }
}
