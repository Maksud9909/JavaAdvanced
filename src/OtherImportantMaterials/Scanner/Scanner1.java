package OtherImportantMaterials.Scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("Maksud \n" +
                "Rustamov");
        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
    }
}
