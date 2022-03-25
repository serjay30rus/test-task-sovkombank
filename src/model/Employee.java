package model;

public class Employee implements Comparable<Employee> {
    private String name;
    private String surname;
    private int position;
    private int salary;


    public Employee(String name, String surname, int position, int salary) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.salary = salary;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public int compareTo(Employee employee)
    {
        return this.getSalary().compareTo(employee.getSalary());
    }
}
