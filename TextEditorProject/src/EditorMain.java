import java.util.Scanner;

public class EditorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TextEditor editor = new TextEditor();
        int choice;

        do {
            System.out.println("\n===== TEXT EDITOR =====");
            System.out.println("1. Insert Text");
            System.out.println("2. Delete Text");
            System.out.println("3. Undo");
            System.out.println("4. Redo");
            System.out.println("5. Show Text");
            System.out.println("6. Save to File");
            System.out.println("7. Load from File");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter text to insert: ");
                    String input = sc.nextLine();
                    editor.insert(input);
                    break;

                case 2:
                    System.out.print("Enter number of characters to delete: ");
                    int n = sc.nextInt();
                    editor.delete(n);
                    break;

                case 3:
                    editor.undo();
                    break;

                case 4:
                    editor.redo();
                    break;

                case 5:
                    editor.showText();
                    break;

                case 6:
                    System.out.print("Enter filename to save (e.g., project_files/text.txt): ");
                    String saveFile = sc.nextLine();
                    editor.saveToFile(saveFile);
                    break;

                case 7:
                    System.out.print("Enter filename to load (e.g., project_files/text.txt): ");
                    String loadFile = sc.nextLine();
                    editor.loadFromFile(loadFile);
                    break;

                case 8:
                    System.out.println("Exiting editor...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 8);

        sc.close();
    }
}
