package com.vertradt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserController {

    private Scanner scanner = new Scanner(System.in);

    void runMenu() {
        displayMenu();
        switchingMenu();
    }


    // inicjalizacja w polu List<String> lista = [.....];

    private List<String> createMenuOptions() {
        List<String> options = new ArrayList<>();

        options.add("Wyświetl ucznia");
        options.add("Dodaj ucznia");
        options.add("Usuń ucznia");
        options.add("Edytuj ucznia");

        return options;
    }

    private void displayMenu() {
        for (int i = 0; i < createMenuOptions().size(); i++) {
            System.out.println(i + 1 + ". " + createMenuOptions().get(i));
        }
    }

    private void switchingMenu() {
        switch (scanner.nextInt()) {
            case 1:
                System.out.println("uczeń");
                break;
            case 2:
                System.out.println("Dodaj ucznia");
                break;
            case 3:
                System.out.println("usuwanie");
                break;
            case 4:
                System.out.println("edytowanie");
                break;
            default:
                System.out.println("nie ma takiej opcji. Ucznia nie znaleziono :D ");
        }
    }


}
