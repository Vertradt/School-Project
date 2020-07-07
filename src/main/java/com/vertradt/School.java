package com.vertradt;

import java.util.ArrayList;
import java.util.List;

public class School {
//    chyba za bardzo rozbudowałem ten projekt, choć można by jeszcze wiele różnych zależności dodać
//    na razie propozycja tego co klasy będą agregować,
    private String schoolName;
    private SchoolDirector schoolDirector;
    private List<Teacher> teachers = new ArrayList<>();
    private List<SchoolClass> classes = new ArrayList<>();

    public School(String schoolName, SchoolDirector schoolDirector, List<Teacher> teachers, List<SchoolClass> classes) {
        this.schoolName = schoolName;
        this.schoolDirector = schoolDirector;
        this.teachers = teachers;
        this.classes = classes;
    }
}
