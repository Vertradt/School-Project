package com.vertradt;

public class Main {


    public static void main(String[] args) {
        DBConnector connector = new DBConnector();

        if (connector.getDbConnection() != null) {
            new Launcher().launchProgram();
        }
    }


//    co może mieć uczen lekcje, ocen..

//    Id - primary key, auto increment

//
//    Id, Imie, Nazwisko, Klasa


}
