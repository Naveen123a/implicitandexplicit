import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Filesopns {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "example.txt";

        // Create a new file
        createFile(filePath);

        // Write content to the file
        String content = "Hello, World!";
        writeFile(filePath, content);

        // Read content from the file
        String fileContent = readFile(filePath);
        System.out.println("File Content: " + fileContent);

        // Update content in the file
        String updatedContent = "Hello, Java!";
        updateFile(filePath, updatedContent);

        // Read the updated content
        String updatedFileContent = readFile(filePath);
        System.out.println("Updated File Content: " + updatedFileContent);

        // Delete the file
        deleteFile(filePath);
    }

    public static void createFile(String filePath) {
        try {
            File file = new File(filePath);
            if (file.createNewFile()) {
                System.out.println("File created: " + filePath);
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
        }
    }

    public static void writeFile(String filePath, String content) {
        try {
            Files.write(Paths.get(filePath), content.getBytes(), StandardOpenOption.CREATE);
            System.out.println("Content written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    public static String readFile(String filePath) {
        try {
            byte[] bytes = Files.readAllBytes(Paths.get(filePath));
            return new String(bytes);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
        return "";
    }

    public static void updateFile(String filePath, String updatedContent) {
        try {
            Files.write(Paths.get(filePath), updatedContent.getBytes(), StandardOpenOption.CREATE);
            System.out.println("Content updated in the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while updating the file: " + e.getMessage());
        }
    }

    public static void deleteFile(String filePath) {
        try {
            Files.deleteIfExists(Paths.get(filePath));
            System.out.println("File deleted: " + filePath);
        } catch (IOException e) {
            System.out.println("An error occurred while deleting the file: " + e.getMessage());
        }
    }
}
