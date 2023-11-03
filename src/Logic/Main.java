package Logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        String[] stringArray = new String[82];
        Tree tree = new Tree();
        try {
            String filename = "KataKunci.txt";
            String absoluteFilePath = "";
            String workingDir = System.getProperty("user.dir") + "\\src\\Source";

            absoluteFilePath = workingDir + File.separator + filename;
            // System.out.println(absoluteFilePath);
            // System.out.println(new File(".").getAbsoluteFile());

            FileReader fileReader = new FileReader(absoluteFilePath);
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                int i = 0 ;
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    stringArray[i] =  line.replaceAll("\\s", "");
                    i++;
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        for (int i = 0; i < stringArray.length; i +=2) {
            if (i + 1 < stringArray.length) {
                tree.add(stringArray[i], stringArray[i+1]);
            }
        }
       tree.inorderTraversal(tree.getRoot());

    }
}
