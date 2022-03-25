package model;

public class Developer extends Employee {
    private String language;
    private String institute;

    public Developer(String name, String surname, int position, int salary, String language, String institute) {
        super(name, surname, position, salary);
        this.language = language;
        this.institute = institute;
    }

    public String getLanguage() {
        return language;
    }

    public String getInstitute() {
        return institute;
    }

}
