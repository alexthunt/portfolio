package datastructuresproject1;

import java.util.Scanner;

public class EmployeeDemo {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Let's evaluate two employee's and decide which one is better.");
        System.out.println("Let's get the details of the first employee.");
        Employee firstEmployee = createEmployee();
        System.out.println("Let's get the details of the second employee");
        Employee secondEmployee = createEmployee();
        if (firstEmployee.equals(secondEmployee)) {
            System.out.println("These employees are equally valuable.");
        } else {
            if (firstEmployee.compareTo(secondEmployee) == -1) {
                System.out.println(secondEmployee.getFirstName() + " " + secondEmployee.getLastName() + " is worth more to the company.");
            } else if (firstEmployee.compareTo(secondEmployee) == 1) {
                System.out.println(firstEmployee.getFirstName() + " " + firstEmployee.getLastName() + " is worth more to the company.");
            }
        }
        System.out.println(firstEmployee.getFirstName() + " " + firstEmployee.getLastName() + " is worth " + firstEmployee.getValuePoints() + " points of value.");
        System.out.println(secondEmployee.getFirstName() + " " + secondEmployee.getLastName() + " is worth " + secondEmployee.getValuePoints() + " points of value.");
    }

    public static Employee createEmployee() {
        String firstName = "";
        String lastName = "";
        int yearsOfExperience = 0;
        Degree degree = Degree.NONE;
        Employee employee = new Employee();

        boolean getEmployeeDetailsSentinal = true;
        while (getEmployeeDetailsSentinal) {
            System.out.println("What is the first name of this employee?");
            firstName = keyboard.nextLine();
            System.out.println("What is the last name of this employee?");
            lastName = keyboard.nextLine();

            boolean experienceInputSentinal = true;
            while (experienceInputSentinal) {
                System.out.println("How many years of experience does this employee have?");
                try {
                    yearsOfExperience = Integer.parseInt(keyboard.nextLine());
                    experienceInputSentinal = false;
                } catch (NumberFormatException ex) {
                    System.out.println(ex);
                    System.out.println("Try again.");
                }
            }

            boolean degreeInputSentinal = true;
            while (degreeInputSentinal) {
                System.out.println("What degree does this employee have? /(None, Associates, Bachelors, Masters, or Doctorate/)");
                String stringDegree = keyboard.nextLine();
                if (stringDegree.equalsIgnoreCase("None")) {
                    degree = Degree.NONE;
                    degreeInputSentinal = false;
                } else if (stringDegree.equalsIgnoreCase("Associates")) {
                    degree = Degree.ASSOCIATE;
                    degreeInputSentinal = false;
                } else if (stringDegree.equalsIgnoreCase("Bachelors")) {
                    degree = Degree.BACHLORS;
                    degreeInputSentinal = false;
                } else if (stringDegree.equalsIgnoreCase("Masters")) {
                    degree = Degree.MASTERS;
                    degreeInputSentinal = false;
                } else if (stringDegree.equalsIgnoreCase("Doctorate")) {
                    degree = Degree.DOCTORATE;
                    degreeInputSentinal = false;
                } else {
                    System.out.println("Incompatible input, try again.");
                }
            }
            employee = new Employee(degree, firstName, lastName, yearsOfExperience);
            System.out.println(employee.toString());
            System.out.println("Does this employee look correct? (y/n)");
            String answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                getEmployeeDetailsSentinal = false;
            } else {
                System.out.println("Let's make sure we create the right employee.");
            }
        }
        return employee;
    }
}
