import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {
    private Scanner myScanner = new Scanner(System.in);
    //Used to hold the instance of a user who successfully logged in.
    //boolean loggedInEmployee = false;
    //Create an empty list to hold employees
    private List<Employee> employees = new ArrayList<Employee>();
    //Store user forename
    String user = null;

    private void employeeList() {
        //Add 3 users to the list
        employees.add(new Employee(1, "Mrs.", "Anna", "Foreman", "23/05/1975", "16, Lakers Road", "Bristol", "Avon", "BS11623", "07896549875", "anna.foreman@gmail.com", "Analyst", "15/04/2018", "a01", "123", "employee"));
        employees.add(new Employee(2, "Mr.", "Brian", "Marvel", "03/11/1983", "180, Saint Paul Road", "Bristol", "Avon", "BS9169", "0735696975", "brian.marvel@gmail.com", " Senior Analyst", "01/01/2011", "b02", "123", "HR_team"));
        employees.add(new Employee(3, "Miss.", "Karen", "Smith", "18/10/1970", "51, Nelson Street", "Bristol", "Avon", "BS56329", "0781479875", "karen.smith@gmail.com", "Senior Manager", "01/11/2006", "k03", "123", "HR_manager"));
    }
    //User[] users = new User[3];

    public static void main(String[] args) {
        Application hr = new Application();
        hr.employeeList();
        hr.verifyUser();
    }

    private void verifyUser() {
        System.out.println();
        System.out.println("*** Welcome to your HR People's System ***\n");
        System.out.println("Let's verify your login details.");
        System.out.println("Please type your username: ");
        String uInput = myScanner.nextLine();
        System.out.println("Please type your password");
        String pInput = myScanner.nextLine();

        //System.out.println(e.getForename());
        // for (Employee e : employees)
        //     if (e.getUsername().equalsIgnoreCase(uInput) && e.getPassword().equals(pInput)) {
        for (Employee employee : employees) {
            if (employee.getUsername().equalsIgnoreCase(uInput) && employee.getPassword().equals(pInput)) {
                //loggedInEmployee = true;
                System.out.println("You have successfully logged in.");
                user = employee.getForename() + " " + employee.getSurname() + "!";
                System.out.println(employee.getRole());
                switch (employee.getRole()) {
                    case "employee":
                        employeeAccess();
                        break;
                    case "HR_team":
                        teamAccess();
                        break;
                    case "HR_manager":
                        managerAccess();
                        break;
                    default:
                        System.err.println("You don't have the right access. Please try again.");
                        System.out.println();
                        verifyUser();
                }
            } else {
                System.err.println("Incorrect login details. Please try again.");
                System.out.println();
            }
        }
                verifyUser();
    }
       /* for (int i = 0; i < employees.size() ; i++) {
            if(employees.contains(uInput) && employees.contains(pInput)) {
                if (uInput.equals(employees[]))
            }   */

    private void employeeAccess() {
        System.out.println();
        System.out.println("Welcome to your personal HR " + user);
        System.out.println("Please type an option:");
        System.out.println("a. See personal details");
        System.out.println("b. Edit personal details");
        System.out.println("c. Logout");
        employeeAction();
    }

    private void employeeAction() {
        char input = myScanner.next().charAt(0);
        switch (input) {
            case 'a':
                showEmployersList();
                break;

            case 'b':
                break;

            case 'c':
                System.out.println("You're now logged off.");
                System.out.println("Thanks for using the HR People's System");
                System.exit(4);
                break;

            default:
                System.err.println("Incorrect option type. Please try again");
                employeeAccess();
        }
    }


    private void showEmployersList() {
        for (Employee employee : employees) {
            System.out.println("ID: " + employee.getEmployeeID() + " Name: " + employee.getTitle() + " " + employee.getForename() + " " + employee.getSurname() +
                    "Date of Birth: " + employee.getDOB() + "Address: " + employee.getAddress() + " " + employee.getCity() + " " + employee.getCounty() +
                    " email: " + employee.getEmail() + " contact number: " + employee.getContactNumber() + " position: " + employee.getPosition() +
                    " start date: " + employee.getStartDate() + " username: " + employee.getUsername());
        }
    }

    private void teamAccess() {
        System.out.println("Welcome to the HR-Team Access");
        System.out.println("Choose what you wish to do today:");
        System.out.println("a. Add a new employees");
        System.out.println("b. Edit an employee details ");
        System.out.println("c. Logout");
        teamAction();
    }

    private void teamAction() {
        char input = myScanner.next().charAt(0);
        switch (input) {
            case 'a':
             //   addEmployee();
                break;
            case 'b':
                //editEmployee();
                break;
            case 'c':
                System.out.println("You're now logged off.");
                System.out.println("Thanks for using the HR People's System");
                System.exit(4);
                break;
            default:
                System.err.println("Incorrect option type. Please try again");
                teamAccess();
        }
    }
    private void addEmployee() {
        String[] values = new String[16];
        this.employees.add(new Employee(values[0] ));
       /*

               employees.add(new Employee(1, "Mrs.", "Anna", "Foreman", "23/05/1975", "16, Lakers Road", "Bristol", "Avon", "BS11623", "07896549875", "anna.foreman@gmail.com", "Analyst", "15/04/2018", "a01", "123", "employee"));
Employee = new Employee() = null;
        this.employees.add(newEmployee);
        //this returns a list of employees


        Method  below adds a new employee based on user input
        System.out.println("Please input title");
        String values[0]= myScanner.nextLine();
        System.out.println("Please input forename");
        String forename = myScanner.nextLine();
        System.out.println("Please input surname");
        String surname = myScanner.nextLine();
        System.out.println("Please input date of birth");
        String DOB = myScanner.nextLine();
        System.out.println("Please input address");
        String address = myScanner.nextLine();
        System.out.println("Please input town");
        String town = myScanner.nextLine();
        System.out.println("Please input county");
        String county = myScanner.nextLine();
        System.out.println("Please input Post Code");
        String postCode = myScanner.nextLine();
        System.out.println("Please input contact number");
        String contactNumber = myScanner.nextLine();
        System.out.println("Please input email address");
        String emailAddress = myScanner.nextLine();
        System.out.println("Please input employee ID");
        int ID = Integer.parseInt(myScanner.nextLine());
        System.out.println("Please input position");
        String position = myScanner.nextLine();
        System.out.println("Please input start date");
        String startDate = myScanner.nextLine();
        newEmployee = new Employee(ID, title, forename, surname, DOB, address, town, county,
                postCode, contactNumber, emailAddress, position, startDate);
        this.employees.add(newEmployee);
        //below returns you to the menu so that the program still runs.

        System.out.println("You will now be returned to the Main Menu.");
        menu();

         }

        private void managerAccess () {

        }
    }


