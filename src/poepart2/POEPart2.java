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
                   String taskName = JOptionPane.showInputDialog("Enter task name:");
                    int taskNumber = i + 1;
                    String taskDescription = JOptionPane.showInputDialog("Enter task description:");
                    String developerDetails = JOptionPane.showInputDialog("Enter developer details:");
                    String taskDurationStr = JOptionPane.showInputDialog("Enter task duration (in hours):");
                    int taskDuration = Integer.parseInt(taskDurationStr);
                    String taskID = JOptionPane.showInputDialog("Enter task ID:");
                    String taskStatus = JOptionPane.showInputDialog("Enter task status:");
                    Tasks Obj = new Tasks(taskName, taskNumber, taskDescription, developerDetails, taskDuration, taskID, taskStatus);
                    Tasks tasks = new Tasks(taskName, taskNumber, taskDescription, developerDetails, taskDuration, taskID, taskStatus);
                    Tasks.add(tasks);
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
            for (String Task : tasks) {
                report.append(Task.toString()).append("\n");
            }
            JOptionPane.showMessageDialog(null, report.toString());
        }
    }
    public POEPart2(String taskName, int taskNumber, String taskDescription, String developerDetails, int taskDuration, String taskID, String taskStatus) 
    {
        this.taskName = taskName;
        this.taskNumber = taskNumber;
        this.taskDescription = taskDescription;
        this.developerDetails = developerDetails;
        this.taskDuration = taskDuration;
        this.taskID = taskID;
        this.taskStatus = taskStatus; 

    }
    
    public String toString() 
    {
        return "Task Number: " + taskNumber + "\n" +
               "Task Name: " + taskName + "\n" +
               "Task Description: " + taskDescription + "\n" +
               "Developer Details: " + developerDetails + "\n" +
               "Task Duration: " + taskDuration + " hours\n" +
               "Task ID: " + taskID + "\n" +
               "Task Status: " + taskStatus + "\n";
    }
    
    public String createTaskID() {
        String taskNameInitials = getInitials(taskName);
        String developerInitials = getInitials(developerDetails);
        return taskNumber + taskNameInitials + developerInitials;
    }

    private String getInitials(String input) {
        StringBuilder initials = new StringBuilder();
        for (String part : input.split(" ")) {
            if (!part.isEmpty()) {
                initials.append(part.charAt(0));
            }
        }
        return initials.toString().toUpperCase();
    }
    
    

    
}
    

