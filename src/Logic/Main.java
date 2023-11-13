package Logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        String[] stringArray = new String[156];
        Tree IdEnTree = new Tree(); // Indonesia -> English
        Tree EnIdTree = new Tree(); // English -> Indonesia
        try {
            String filename = "KataKunci.txt";
            String absoluteFilePath = "";
            String workingDir = System.getProperty("user.dir") + "\\src\\Source";

            absoluteFilePath = workingDir + File.separator + filename;
            FileReader fileReader = new FileReader(absoluteFilePath);
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                int i = 0;
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    stringArray[i] = line.replaceAll("\\s", " ");
                    i++;
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        for (int i = 0; i < stringArray.length; i += 4) {
            if (i + 1 < stringArray.length) {
                IdEnTree.add(stringArray[i], stringArray[i + 1], stringArray[i + 2], stringArray[i + 3]);
            }
        }
        for (int i = 0; i < stringArray.length; i += 4) {
            if (i + 1 < stringArray.length) {
                EnIdTree.add(stringArray[i + 1], stringArray[i], stringArray[i + 2], stringArray[i + 3]);
            }
        }
        // IdEnTree.inorderTraversal(IdEnTree.getRoot());
        System.out.println(IdEnTree.getRoot().getValue().get(0));
        System.out.println(EnIdTree.getRoot().getValue());
    }
}
