import javax.swing.JOptionPane;

import org.graalvm.compiler.lir.CompositeValue.Component;

import java.lang.Math;
public class Guess_Game 
{
    
	public static void main(String[] args) 
	{
            //declare variables
            String input;
            int myGuess;
            final int NUMBER_TO_GUESS = (int)((Math.random() * 10) + 1);
            
        //show introductory message
        int i = JOptionPane.showConfirmDialog(null,"\nGuess my number\n Press [Ok] to start\n\n", "Guessing Game", JOptionPane.OK_CANCEL_OPTION);
        
        if(i != 2)
        {
        //prompt to enter guess 
        input = JOptionPane.showInputDialog("Enter a number between 1 and 10:");
            myGuess = Integer.parseInt(input);
            
        while( myGuess != NUMBER_TO_GUESS)
            {  
                //good or bad guess?
                if(myGuess < NUMBER_TO_GUESS){ 
                //too low 
                    input = JOptionPane.showInputDialog("Your guess "+myGuess+ " is too low... Try Again!");
                }
                //too high
                else{
                    input = JOptionPane.showInputDialog("Your guess "+ myGuess+" is too high... Try Again!");
                }

                myGuess = Integer.parseInt(input);
            }//end while
        //good guess
        JOptionPane.showConfirmDialog(null,"Your guess "+myGuess+" is the number...\nCongratulations!\n", "Guessing Game", JOptionPane.OK_CANCEL_OPTION);
        }
        else 
        {
            System.exit(0);
        }
    }//end main()

}//end Guess2