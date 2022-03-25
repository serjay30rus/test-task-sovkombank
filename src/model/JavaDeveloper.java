package model;

public class JavaDeveloper extends Developer {
    private int experience;
    private String environment;

    public JavaDeveloper(String name, String surname, int position, int salary, String language, String institute, int experience, String environment) {
        super(name, surname, position, salary, language, institute);
        this.experience = experience;
        this.environment = environment;
    }

    public int getExperience() {
        return experience;
    }

    public String getEnvironment() {
        return environment;
    }

    @Override
    public String toString() {
        String strPosition;
        if (super.getPosition() == 0) {
            strPosition = "Монтажник";
        } else if (super.getPosition() == 1) {
            strPosition = "Электронщик";
        } else strPosition = "Разработчик";
        return "Java-разработчик {" +
                "name='" + super.getName() + '\'' +
                ", surname='" + super.getSurname() + '\'' +
                ", position=" + strPosition +
                ", salary=" + super.getSalary() +
                ", institute='" + super.getInstitute() + '\'' +
                ", language='" + super.getLanguage() + '\'' +
                ", environment='" + environment + '\'' +
                ", experience='" + experience + '\'' +
                '}';
    }
}
