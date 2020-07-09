package com.vertradt;

public class Teacher extends Person {

    private QualificationType qualificationTye;
    private int numberOfLesson;

    //jeszcze jakiś dziennik można dodać do którego ma hasło dany nauczyciel
//TODO: Fajnie byłoby gdybś mi pokazał jak sobie radzić z konstruktorami teleskopowymi
    public Teacher(String name, String surname, int age, QualificationType qualificationTye, int numberOfLesson) {
        super(name, surname, age);
        this.qualificationTye = qualificationTye;
        this.numberOfLesson = numberOfLesson;
    }
}
