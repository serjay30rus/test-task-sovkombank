import model.Electronic;
import model.Employee;
import model.Insataller;
import model.JavaDeveloper;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeesList = new ArrayList<>();
        Employee installer1 = new Insataller("Дмитрий", "Иванов", 0, 50000, 0);
        Employee installer2 = new Insataller("Игорь", "Петров", 0, 60000, 1);
        Employee electronic1 = new Electronic("Олег", "Светлов", 1, 55000, new Integer[] {1, 2});
        Employee electronic2 = new Electronic("Алексей", "Белов", 1, 70000, new Integer[] {1, 2, 3});
        Employee javaDeveloper1 = new JavaDeveloper("Александр", "Cидоров", 2, 80000, "Java", "МГУ", 5, "Idea");
        Employee javaDeveloper2 = new JavaDeveloper("Пётр", "Борисов", 2, 90000, "Java", "МГУ", 7, "Eclipse");

        // Вывести всю информацию по всем сотрудникам:
        System.out.println(installer1.toString() + "\n"
                            + installer2.toString() + "\n" + electronic1.toString() + "\n"
                            + electronic2.toString() + "\n" + javaDeveloper1.toString() + "\n"
                            + javaDeveloper2.toString());

        // Вывести список сотрудников: ФИО и ЗП по возрастанию ЗП.
        employeesList.add(installer1);
        employeesList.add(installer2);
        employeesList.add(electronic1);
        employeesList.add(electronic2);
        employeesList.add(javaDeveloper1);
        employeesList.add(javaDeveloper2);

        Collections.sort(employeesList);
        for (Employee e : employeesList) {
            System.out.println(e.getName() + " " + e.getSurname() + " - " + e.getSalary());
        }

    }
}
