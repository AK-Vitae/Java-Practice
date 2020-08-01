package projects.littlesearchengine;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class LSEDriver {
    public static void main(String[] args) throws FileNotFoundException {
        LittleSearchEngine test = new LittleSearchEngine();
        Scanner sc = new Scanner(System.in);
        test.makeIndex("docs.txt", "noisewords.txt");
        System.out.print("First keyword: ");
        String keyword1 = sc.nextLine();
        System.out.print("Second keyword: ");
        String keyword2 = sc.nextLine();
        sc.close();
        System.out.println("Output: " + test.top5search(keyword1, keyword2));
    }
}
