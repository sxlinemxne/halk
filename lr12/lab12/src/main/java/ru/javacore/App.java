package ru.javacore;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //System.out.println( "Hello Artem!" );

        Tester tester1 = new Tester("Artem", "Artemchik", 10, "B1", 50000.0);
        tester1.printFullName();
        tester1.printExperience();
        tester1.printSalary(1000.0);

       Tester tester2 = new Tester("Andrei", "Bybchi",10, "A1");
       tester2.printFullName();
       tester2.printExperience();
       tester2.printEnglishLevel();
    }
}
