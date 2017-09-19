package com.example.problem5set0;

/**
 * Created by T00194823 on 14/09/2017.
 */
//This program will ask a user to input an operation to work out a maths problem by choosing from 4 options
//The answer will be calculated and displayed. JOptionPane will be the interface used for this.
//A while loop will be used to keep typing more operations until
//the user quits the program by typing q.

import javax.swing.JOptionPane;  //Actually Problem6Set0

public class Problem5Set0 {
    public static void main(String[] args) {

        String choice,noasString,no2AsString;
        float number, number2, total = 0;
        char letter;
        boolean valid = false;

        choice = JOptionPane.showInputDialog("Please select the operation of Addition (A),Subtraction (S),Division (D) and Multiplication (M): ");
        choice = choice.toUpperCase();

        while (!choice.equals("Q"))
        {
        switch (letter = choice.charAt(0)) {
            case 'A': {
                noasString = JOptionPane.showInputDialog("Please select the number: ");
                number = Float.parseFloat(noasString);

                no2AsString = JOptionPane.showInputDialog("Please select another number: ");
                number2 = Float.parseFloat(no2AsString);

                total = number + number2;

                valid = true;

                break;
            }


            case 'S': {
                noasString = JOptionPane.showInputDialog("Please select the number: ");
                number = Float.parseFloat(noasString);

                no2AsString = JOptionPane.showInputDialog("Please select another number: ");
                number2 = Float.parseFloat(no2AsString);

                total = number - number2;

                valid = true;

                break;
            }


            case 'M': {
                noasString = JOptionPane.showInputDialog("Please select the number: ");
                number = Float.parseFloat(noasString);

                no2AsString = JOptionPane.showInputDialog("Please select another number: ");
                number2 = Float.parseFloat(no2AsString);

                total = number * number2;

                valid = true;

                break;
            }

            case 'D': {
                noasString = JOptionPane.showInputDialog("Please select the number: ");
                number = Float.parseFloat(noasString);

                no2AsString = JOptionPane.showInputDialog("Please select another number: ");
                number2 = Float.parseFloat(no2AsString);

                total = number / number2;

                valid = true;

                break;
            }

            case 'Q':
                {
                break;
            }

            default:
            {
                choice = JOptionPane.showInputDialog("You have not entered the right letter - Must be A,S,M,D! Please re-enter:");
                choice = choice.toUpperCase();
             }

         }//End of switch statement

            if (valid)
            {
                JOptionPane.showMessageDialog(null,"The answer is " + total,"Answer",
                        JOptionPane.INFORMATION_MESSAGE);

                valid = false;
            }

            choice = JOptionPane.showInputDialog("Please select the operation of Addition (A),Subtraction (S),Division (D) and Multiplication (M): ");
            choice = choice.toUpperCase();
        }//End of while loop
          JOptionPane.showMessageDialog(null,"Thanks for using the program! Goodbye","Number Operations",
                JOptionPane.INFORMATION_MESSAGE);
    }//End of Main
}//End of Class