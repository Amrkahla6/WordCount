import java.io.File;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("pg98.txt");
        Scanner scanner = new Scanner(file);

        int word = 0;

        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            word += line.split(" ").length;
        }

        System.out.println("The file content "+word+" words");
    }
}