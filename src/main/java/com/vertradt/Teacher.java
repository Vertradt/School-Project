package com.vertradt;

public class Teacher extends Person {

    private LessonType lessonType;
    private QualificationTye qualificationTye;
    private EmploymentForm employmentForm;
    private int numberOfLesson;
//jeszcze jakiś dziennik można dodać do którego ma hasło dany nauczyciel
//TODO: Fajnie byłoby gdybś mi pokazał jak sobie radzić z konstruktorami teleskopowymi
    public Teacher(String name, String surname, int age, LessonType lessonType, QualificationTye qualificationTye, EmploymentForm employmentForm, int numberOfLesson) {
        super(name, surname, age);
        this.lessonType = lessonType;
        this.qualificationTye = qualificationTye;
        this.employmentForm = employmentForm;
        this.numberOfLesson = numberOfLesson;
    }
}
