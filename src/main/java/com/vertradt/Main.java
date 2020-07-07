package com.vertradt;

public class Main {


    public static void main(String[] args) {
        DBConnector connector = new DBConnector();

        if (connector.getDbConnection() != null) {
            new Launcher().launchProgram();
        }
    }


//    co może mieć uczen lekcje, ocen, dyżur, uwagi, kółka zainteresowań, lekcje dodatkowe, przynależność do klasy

//    Id - primary key, auto increment

//
//    Id, Imie, Nazwisko, Klasa


}
