/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poepart2;
import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 *
 * @author RC_Student_lab
 */
public class POEPart2 {

private static ArrayList<String> tasks = new ArrayList<>();
private String taskName;
private int taskNumber;
private String taskDescription;
private String developerDetails;
private int taskDuration;
private String taskID;
private String taskStatus;


    public static void main(String[] args) 
    {
      Menu();
      //Tasks obj = new Tasks();
     
      
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
            } else if (input.equals(options[0])) {
                addTasks();
            } else if (input.equals(options[1])) {
               showReport();
            } else {
                JOptionPane.showMessageDialog(null, "Invalid selection. Please try again.");
            }
        }
    }
    
    public static void addTasks() {
        String numTasksStr = JOptionPane.showInputDialog("How many tasks do you wish to enter?");
        if (numTasksStr != null && !numTasksStr.isEmpty()) {
            try {
                int numTasks = Integer.parseInt(numTasksStr);
                for (int i = 0; i < numTasks; i++) {
                    String task = JOptionPane.showInputDialog("Enter task " + (i + 1) + ":");
                    if (task != null && !task.isEmpty()) {
                        tasks.add(task);
                    } else {
                        JOptionPane.showMessageDialog(null, "Task cannot be empty. Try again.");
                        i--; // Decrement to retry entering this task
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid number. Please enter a valid integer.");
            }
        }
    }
    
    public static void showReport() {
        if (tasks.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No tasks entered yet.");
        } else {
            StringBuilder report = new StringBuilder("Tasks Report:\n");
            for (int i = 0; i < tasks.size(); i++) {
                report.append((i + 1)).append(". ").append(tasks.get(i)).append("\n");
            }
            JOptionPane.showMessageDialog(null, report.toString());
        }
    }
    
    
}
    

