package practical_1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Practical_1 {
    
    private Scanner userInput = new Scanner(System.in);
    
    private List<Integer> scoreList = new ArrayList<>();
    
    private int maxScore = 100;
    private int minScore = 0;
    
    public void enterScores()
    {
        int input = -1;
        do
        {
            System.out.print("Enter Score (negative value  for exit): ");
            
            input = userInput.nextInt();
            
            if(input > maxScore)
            {
                System.out.print("The Max Test Score is" + maxScore);
            }
            else if(input >= minScore)
            {
                scoreList.add(input);
            }
            
        }while(input >= minScore);
        
        System.out.print("Enter Score Complete\n");
    }
    
    public void displayScore()
    {
        for(int i = 0; i < scoreList.size(); i++)
        {
            System.out.printf("%3d. %6d\n",i+1,scoreList.get(i));
        }
    }
    
    public int findLower()
    {
        int lowerScore = scoreList.get(0);
        for (int i = 1; i < scoreList.size(); i++) 
        {
            if(scoreList.get(i) < lowerScore)
                lowerScore = scoreList.get(i);
        }
        
        return lowerScore;
    }
    
    public int findHighest()
    {
        int HighestScore = scoreList.get(0);
        for (int i = 1; i < scoreList.size(); i++) 
        {
            if(scoreList.get(i) > HighestScore)
                HighestScore = scoreList.get(i);
        }
        
        return HighestScore;
    }
    
    public double computeAvarage()
    {
        int total = 0;
        
        for (int i = 0; i < scoreList.size(); i++) 
        {
            total += scoreList.get(i);
        }
        
        return (double)total/scoreList.size();
    }
    
    public static void main(String[] args) 
    {
        Practical_1 scoreApp = new Practical_1();
        scoreApp.enterScores();
        scoreApp.displayScore();
        System.out.println("Lower   : " + scoreApp.findLower());
        System.out.println("Highest : " + scoreApp.findHighest());
        System.out.println("Avvarage: " + scoreApp.computeAvarage());
    }
    
}
