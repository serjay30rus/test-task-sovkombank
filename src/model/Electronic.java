package model;

import java.util.ArrayList;
import java.util.List;

public class Electronic extends Employee {
    private Integer[] laws;
    private String[] lawsNames = {"First law", "Second law", "Third law"};

    public Electronic(String name, String surname, int position, int salary, Integer[] laws) {
        super(name, surname, position, salary);
        this.laws = laws;
    }

    public Integer[] getLaws() {
        return laws;
    }

    public String[] getLawsNames() {
        return lawsNames;
    }

    @Override
    public String toString() {
        String strPosition;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < laws.length; i++) {
            list.add(lawsNames[i]);
        }
        if (super.getPosition() == 0) {
            strPosition = "Монтажник";
        } else if (super.getPosition() == 1) {
            strPosition = "Электронщик";
        } else strPosition = "Разработчик";

        return "Электронщик {" +
                "name='" + super.getName() + '\'' +
                ", surname='" + super.getSurname() + '\'' +
                ", position=" + strPosition +
                ", salary=" + super.getSalary() +
                ", laws=" + list.toString() +
                '}';
    }
}
