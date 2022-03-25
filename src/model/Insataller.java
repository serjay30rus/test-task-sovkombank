package model;

public class Insataller extends Employee {
    private int department;

    public Insataller(String name, String surname, int position, int salary, int department) {
        super(name, surname, position, salary);
        this.department = department;
    }

    public int getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        String strDept;
        String strPosition;

        if (department == 0) {
            strDept = "Цех";
        } else strDept = "Склад";

        if (super.getPosition() == 0) {
            strPosition = "Монтажник";
        } else if (super.getPosition() == 1) {
            strPosition = "Электронщик";
        } else strPosition = "Разработчик";
        return "Монтажник {" +
                "name='" + super.getName() + '\'' +
                ", surname='" + super.getSurname() + '\'' +
                ", position=" + strPosition +
                ", salary=" + super.getSalary() +
                ", department=" + strDept +
                '}';
    }
}
