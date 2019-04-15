import java.util.*;

public class Application {
    private Scanner myScanner = new Scanner(System.in);

    //Create an empty list to hold employees
    private List<Employee> employees = new ArrayList<Employee>();
    //Store user full name
    private String user = null;
    private int ID;
    private String emp;

    private void employeeList() {
        //Add 3 users types to the list
        employees.add(new Employee(1, "Mrs.", "Anna", "Foreman", "23/05/1975", "16, Lakers Road", "Bristol", "Avon", "BS11623", "07896549875", "anna.foreman@gmail.com", "Analyst", "15/04/2018", "a01", "123", "employee"));
        employees.add(new Employee(2, "Mr.", "Brian", "Marvel", "03/11/1983", "180, Saint Paul Road", "Bristol", "Avon", "BS9169", "0735696975", "brian.marvel@gmail.com", " Senior Analyst", "01/01/2011", "b02", "123", "HR_team"));
        employees.add(new Employee(3, "Miss.", "Karen", "Smith", "18/10/1970", "51, Nelson Street", "Bristol", "Avon", "BS56329", "0781479875", "karen.smith@gmail.com", "Senior Manager", "01/11/2006", "k03", "123", "HR_manager"));
    }

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

       /* for (int i = 0; i < employees.size() ; i++) {
            if(employees.contains(uInput) && employees.contains(pInput)) {
                if (uInput.equals(employees[]))
            }   */
        //System.out.println(e.getForename());
        for (Employee employee : employees) {
            if (employee.getUsername().equalsIgnoreCase(uInput) && employee.getPassword().equals(pInput)) {
                //loggedInEmployee = true;
                System.out.println("You have successfully logged in.");
                user = employee.getForename() + " " + employee.getSurname() + "!";
                ID = employee.getEmployeeID();
                //System.out.println(employee.getRole());
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
                showEmployersList(ID);
                break;

            case 'b':
                editEmployee(ID);
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


    private void showEmployersList(int userID) {
        for (Employee employee : employees) {
            if (userID == employee.getEmployeeID()) {
                System.out.println("ID: " + employee.getEmployeeID() + " Name: " + employee.getTitle() + " " + employee.getForename() + " " + employee.getSurname() +
                        "Date of Birth: " + employee.getDOB() + "Address: " + employee.getAddress() + " " + employee.getCity() + " " + employee.getCounty() +
                        " email: " + employee.getEmail() + " contact number: " + employee.getContactNumber() + " position: " + employee.getPosition() +
                        " start date: " + employee.getStartDate() + " username: " + employee.getUsername());
            }
        }
    }

    private void editEmployee(int userID) {
        System.out.println("What information would you like to update?");
     /*   switch (userID compareTo Employee.Employee.compareID){
            case fullName:
                System.out.println("Forename and Surname");
                String fullName = myScanner.nextLine();

                break;
            case address:
                System.out.println("Address");
*/
        }
        ;
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
                //addEmployee(emp);
                break;
            case 'b':
                editEmployee(ID);
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

    //Method for adding a new Employee
    private void addEmployee(Employee newEmp) {
        this.employees.add(newEmp);

        //Method for adding a new employee from Employee input
        System.out.println("Please input employee ID");
        int employeeID = Integer.parseInt(myScanner.nextLine());
        System.out.println("Please input title");
        String title = myScanner.nextLine();
        System.out.println("Please input forename");
        String forename = myScanner.nextLine();
        System.out.println("Please input surname");
        String surname = myScanner.nextLine();
        System.out.println("Please input date of birth");
        String DOB = myScanner.nextLine();
        System.out.println("Please input address");
        String address = myScanner.nextLine();
        System.out.println("Please input city");
        String city = myScanner.nextLine();
        System.out.println("Please input county");
        String county = myScanner.nextLine();
        System.out.println("Please input Post Code");
        String postCode = myScanner.nextLine();
        System.out.println("Please input contact number");
        String contactNumber = myScanner.nextLine();
        System.out.println("Please input email address");
        String email = myScanner.nextLine();
        System.out.println("Please input position");
        String position = myScanner.nextLine();
        System.out.println("Please input start date");
        String startDate = myScanner.nextLine();
        System.out.println("Please input username");
        String username = myScanner.nextLine();
        System.out.println("Please add password");
        String password = myScanner.nextLine();
        System.out.println("Please type role");
        String role = myScanner.nextLine();

        new Employee(employeeID, title, forename, surname, DOB, address, city, county,
                postCode, contactNumber, email, position, startDate, username, password, role);

        System.out.println("You new employee was created");
    }

    private void managerAccess() {
        System.out.println("Welcome to the HR-Manager Access");
        System.out.println("Choose what you wish to do today:");
        System.out.println("a. Add a new employees");
        System.out.println("b. Edit an employee details ");
        System.out.println("c. Sort all information ascendent");
        System.out.println("d. Sort all information descendent");
        System.out.println("e. Logout");
        managerAction();
    }

    private void managerAction() {
        char input = myScanner.next().charAt(0);
        switch (input) {
            case 'a':
                addEmployee();
                break;
            case 'b':
                editEmployee(ID);
                break;
            case 'c':
                sortAscendent();
                break;
            case 'd':
               // sortDescendent();
                break;
            case 'e':
                System.out.println("You're now logged off.");
                System.out.println("Thanks for using the HR People's System");
                System.exit(4);
                break;
            default:
                System.err.println("Incorrect option type. Please try again");
                teamAccess();
        }

    }

    private void sortAscendent() {
        System.out.println("Please select what field to sort by : title, forename, surname, dob, address, town, county, post code, contact number, email, id, position, start date, role");
        String fieldToSort = myScanner.nextLine().toLowerCase();

        switch (fieldToSort) {
            case "title":
                Collections.sort(employees, Employee.compareTitle);
                for (Employee e : employees) {
                    System.out.println(e.getTitle());
                }
                break;

            case "surname":
                Collections.sort(employees, Employee.compareForename);
                for (Employee e : employees) {
                    System.out.println(e.getTitle());
                }
                break;


        }
    }


}


