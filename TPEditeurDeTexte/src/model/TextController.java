package model;

public class TextController {
    private Document document;
    private TextView view;

    public TextController(Document document, TextView view) {
        this.document = document;
        this.view = view;
        this.view.setController(this);
    }

    public void processChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.print("Enter text to append: ");
                String textToAppend = view.getInput();
                document.appendText(textToAppend);
                break;
            case 2:
                System.out.print("Enter start index: ");
                int startIndex = Integer.parseInt(view.getInput());
                System.out.print("Enter end index: ");
                int endIndex = Integer.parseInt(view.getInput());
                document.deleteText(startIndex, endIndex);
                break;
            case 3:
                System.out.print("Enter start index: ");
                startIndex = Integer.parseInt(view.getInput());
                System.out.print("Enter end index: ");
                endIndex = Integer.parseInt(view.getInput());
                System.out.print("Enter new text: ");
                String newText = view.getInput();
                document.replaceText(startIndex, endIndex, newText);
                break;
            case 4:
                view.displayDocument(document.getContent().toString());
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }
}
