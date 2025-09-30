import java.util.Stack;
import java.io.*;

public class TextEditor {
    private StringBuilder text;
    private Stack<String> undoStack;
    private Stack<String> redoStack;

    public TextEditor() {
        text = new StringBuilder();
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    // Insert text
    public void insert(String newText) {
        saveState();
        text.append(newText);
    }

    // Delete last n characters
    public void delete(int length) {
        if (length > 0 && length <= text.length()) {
            saveState();
            text.delete(text.length() - length, text.length());
        } else {
            System.out.println("Invalid delete length!");
        }
    }

    // Undo last change
    public void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(text.toString());
            text = new StringBuilder(undoStack.pop());
        } else {
            System.out.println("Nothing to undo!");
        }
    }

    // Redo last undone change
    public void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(text.toString());
            text = new StringBuilder(redoStack.pop());
        } else {
            System.out.println("Nothing to redo!");
        }
    }

    // Show current text
    public void showText() {
        System.out.println("Current Text: " + text.toString());
    }

    // Save state for undo
    private void saveState() {
        undoStack.push(text.toString());
        redoStack.clear();
    }

    // Get current text
    public String getText() {
        return text.toString();
    }

    // Replace current text
    public void setText(String newText) {
        text = new StringBuilder(newText);
        undoStack.clear();
        redoStack.clear();
    }

    // =================== UPDATED METHODS ===================

    // Save text to a file (auto-creates folder if missing)
    public void saveToFile(String filename) {
        try {
            File file = new File(filename);
            file.getParentFile().mkdirs(); // create folder if it doesn't exist

            try (FileWriter writer = new FileWriter(file)) {
                writer.write(text.toString());
            }

            System.out.println("File saved successfully as " + filename);
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }

    // Load text from a file (friendly error if file missing)
    public void loadFromFile(String filename) {
        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("File not found: " + filename);
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            StringBuilder fileContent = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                fileContent.append(line).append("\n");
            }
            setText(fileContent.toString().trim());
            System.out.println("File loaded successfully from " + filename);
        } catch (IOException e) {
            System.out.println("Error loading file: " + e.getMessage());
        }
    }
}
