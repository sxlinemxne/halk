package ru.javacore;

public class Tester {
    private String name;
    private String surname;
    private int expirienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surname, int expirienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = expirienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public Tester(String name, String surname, int expirienceInYears, String englishLevel) {
        this(name, surname, expirienceInYears, englishLevel, 0.0);
    }

    public Tester(String name, String surname, int fullYear) {
        this(name, surname, fullYear, "Belarus");
    }

    public void printFullName() {
        System.out.println(name + " " + surname);
    }

    public void printExperience() {
        System.out.println("Year of birth: " + expirienceInYears + " year");
    }
    public void printEnglishLevel() {
        System.out.println("English level: " + englishLevel);
    }
    public void printSalary(double bonus) {
        System.out.println("Salary: " + (salary + bonus));
    }
}

    
