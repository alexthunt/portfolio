package datastructuresproject1;

public class Employee implements Comparable<Employee> {

    private Degree degree;
    private String firstName;
    private String lastName;
    private int experience;

    public Employee() {
        this.degree = Degree.NONE;
        firstName = "Stan";
        lastName = "Dupp";
        experience = 0;
    }

    public Employee(Degree degree, String firstName, String lastName, int experience) {
        this.degree = degree;
        this.firstName = firstName;
        this.lastName = lastName;
        this.experience = experience;
    }

    final public int getValuePoints() {
        int degreeValue = 0;
        if (degree == Degree.ASSOCIATE) {
            degreeValue = 2;
        } else if (degree == Degree.BACHLORS) {
            degreeValue = 3;
        } else if (degree == Degree.MASTERS) {
            degreeValue = 4;
        } else if (degree == Degree.DOCTORATE) {
            degreeValue = 5;
        } else {
            degreeValue = 1;
        }
        return experience * degreeValue;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + "has been with the company for " + experience + " years. They have a degree level of " + degree + ".";
    }

    @Override
    public boolean equals(Object obj) {
        Employee passedEmployee = (Employee) obj;
        return getValuePoints() == passedEmployee.getValuePoints();
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        if (getValuePoints() < otherEmployee.getValuePoints()) {
            return -1;
        } else if (getValuePoints() > otherEmployee.getValuePoints()) {
            return 1;
        } else {
            return 0;
        }
    }
}
