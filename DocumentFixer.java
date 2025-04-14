/*
Student: Brayan Villanueva Garcia
ID: 50239170
I pledge that this submission is solely my work,
and that I have neither given, nor received help from anyone.
 */
import java.util.Scanner;
import java.io.*;

public class DocumentFixer {
    public static void main(String[] args)throws IOException{
        // call method fixDocument
        fixDocument("Employees.txt");
    }
    public static void fixDocument(String FileName)throws IOException{
        // create a file
        File myFile = new File(FileName);
        // create a scanner to read the file
        Scanner scan = new Scanner(myFile);

        // arrays to store names, ID's and salaries
        // the size of the array is 483 since we are working with 483 employees
        String[] employeeNames = new String[483];
        String[] emplyeeIDs = new String[483];
        int[] emplyeeSalaries = new int[483];

        // for loop to read line by line the document
        for (int i = 0; i < 483; i++){
            String line = scan.nextLine();
            String[] tokens = line.split(",");

            // store each value to their corresponding variable
            employeeNames[i] = tokens[0];
            emplyeeIDs[i] = tokens[1];
            int Salary = Integer.parseInt(tokens[2].substring(1));
            // multiply the salary for 1.03 to increase it 3%
            int newSalary = (int) (Salary * 1.03);
            emplyeeSalaries[i] = newSalary;
        }
        // create a writer to pass all the data to a new file
        PrintWriter writer = new PrintWriter("EmployeesUpdatedSalaries.txt");

        // for loop to write the data
        for (int i = 0; i < 483; i++){
            writer.write(employeeNames[i] + "," + "$" + emplyeeSalaries[i] + "," + emplyeeIDs[i] + "\n");
        }
        // close scanner and writer
        scan.close();
        writer.close();
    }
}
