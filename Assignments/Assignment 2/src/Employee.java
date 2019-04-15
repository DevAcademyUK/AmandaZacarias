import java.util.Comparator;

public class Employee {
    private int employeeID;
    private String title;
    private String forename;
    private String surname;
    private String DOB;
    private String address;
    private String city;
    private String county;
    private String postCode;
    private String contactNumber;
    private String email;
    private String position;
    private String startDate;
    private String username;
    private String password;
    private String role;


    //Getters and setters for all variables
    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getAddress() {
        return address;
    }

     void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    private void setCounty(String county) {
        this.county = county;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // This is the constructor of the Employee class, instance of the class(object).
    Employee(int employeeID, String title, String forename, String surname, String DOB, String address, String city, String county, String postCode, String contactNumber, String email, String position, String startDate, String userName, String password, String role) {
        this.employeeID = employeeID;
        this.title = title;
        this.forename = forename;
        this.surname = surname;
        this.DOB = DOB;
        this.address = address;
        this.city = city;
        this.county = county;
        this.postCode = postCode;
        this.contactNumber = contactNumber;
        this.email = email;
        this.position = position;
        this.startDate = startDate;
        this.username = userName;
        this.password = password;
        this.role = role;
    }

    //Comparators
    static Comparator<Employee> compareTitle = new Comparator<Employee>() {
        @Override
        public int compare(Employee a, Employee b) {
            String employeeA = a.title.toLowerCase();
            String employeeB = b.title.toUpperCase();

            return employeeA.compareTo(employeeB);
        }
    };

    static Comparator<Employee> compareForename = new Comparator<Employee>() {
        @Override
        public int compare(Employee a, Employee b) {
            String employeeA = a.forename.toUpperCase();
            String employeeB = b.forename.toUpperCase();

            return employeeA.compareTo(employeeB);
        }
    };

    static Comparator<Employee> compareSurname = new Comparator<Employee>() {
        @Override
        public int compare(Employee a, Employee b) {
            String employeeA = a.surname.toUpperCase();
            String employeeB = b.surname.toUpperCase();

            return employeeA.compareTo(employeeB);
        }
    };


    static Comparator<Employee> compareAddress = new Comparator<Employee>() {
        @Override
        public int compare(Employee a, Employee b) {
            String employeeA = a.address.toUpperCase();
            String employeeB = b.address.toUpperCase();

            return employeeA.compareTo(employeeB);
        }
    };

    static Comparator<Employee> compareCity = new Comparator<Employee>() {
        @Override
        public int compare(Employee a, Employee b) {
            String employeeA = a.city.toLowerCase();
            String employeeB = b.city.toLowerCase();

            return employeeA.compareTo(employeeB);
        }
    };

    static Comparator<Employee> compareCounty = new Comparator<Employee>() {
        @Override
        public int compare(Employee a, Employee b) {
            String employeeA = a.county.toLowerCase();
            String employeeB = b.county.toLowerCase();

            return employeeA.compareTo(employeeB);
        }
    };

    static Comparator<Employee> comparePostcode = new Comparator<Employee>() {
        @Override
        public int compare(Employee a, Employee b) {
            String employeeA = a.postCode.toLowerCase();
            String employeeB = b.postCode.toLowerCase();

            return employeeA.compareTo(employeeB);
        }
    };

    static Comparator<Employee> compareNumber = new Comparator<Employee>() {
        @Override
        public int compare(Employee a, Employee b) {
            String employeeA = a.contactNumber.toLowerCase();
            String employeeB = b.contactNumber.toLowerCase();

            return employeeA.compareTo(employeeB);
        }
    };

    static Comparator<Employee> compareEmail = new Comparator<Employee>() {
        @Override
        public int compare(Employee a, Employee b) {
            String employeeA = a.email.toLowerCase();
            String employeeB = b.email.toLowerCase();

            return employeeA.compareTo(employeeB);
        }
    };

    static Comparator<Employee> compareID = new Comparator<Employee>() {
        @Override
        public int compare(Employee a, Employee b) {
            int employeeA = a.employeeID;
            int employeeB = b.employeeID;

            return Integer.compare(employeeA, employeeB);
        }
    };

    static Comparator<Employee> comparePosition = new Comparator<Employee>() {
        @Override
        public int compare(Employee a, Employee b) {
            String employeeA = a.position.toLowerCase();
            String employeeB = b.position.toLowerCase();

            return employeeA.compareTo(employeeB);
        }
    };
}
