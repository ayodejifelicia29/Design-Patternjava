package model;


import java.util.Scanner;

public class TextView {
    private TextController controller;

    public void setController(TextController controller) {
        this.controller = controller;
    }

    public void showMenu() {
        System.out.println("Menu:");
        System.out.println("1. Append text");
        System.out.println("2. Delete text");
        System.out.println("3. Replace text");
        System.out.println("4. View document");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        // Ne pas fermer le scanner ici pour éviter de fermer System.in
        return input;
    }

    public void displayDocument(String document) {
        System.out.println("Document:");
        System.out.println(document);
    }
}