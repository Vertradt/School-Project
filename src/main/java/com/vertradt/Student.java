package com.vertradt;

public class Student extends Person {

    private boolean classPresident; // czy przewodniczący, albo zamiast tego jakiś enum z funkcjami - przewodniczący
//    skarbinik, zastępca lub regularny jakiś uczeń
    private boolean classDuty;//dyżur znaczy
//    mogę jeszcze dodać listę ocen, ucznia, liste prac domowych


    public Student(String name, String surname, int age, boolean classPresident, boolean classDuty) {
        super(name, surname, age);
        this.classPresident = classPresident;
        this.classDuty = classDuty;
    }
}
