/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poepart2;
import javax.swing.JOptionPane;
/**
 *
 * @author RC_Student_lab
 */
public class POEPart2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      Menu();
     
      
    }
    
    public static void Menu()
    {
      String[] options = {"Option 1)"+ "Add Task", "Option 2)"+"Show Report", "Quit"};
        
        while (true) {
            String input = (String) JOptionPane.showInputDialog(null, 
                "Choose an option:", 
                "Numeric Menu", 
                JOptionPane.PLAIN_MESSAGE, 
                null, 
                options, 
                options[0]);
            
            if (input == null || input.equals("Quit")) {
                JOptionPane.showMessageDialog(null, "Exiting program.");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "You selected: " + input);
            }
        }
    } 
    
    }

