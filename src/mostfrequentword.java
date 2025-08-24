import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mostfrequentword {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter a Paragraph");

        String paragraph = sc.nextLine();
        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[^a-zA-Z ]", "");

        String[] words = paragraph.split(" +");

        Map<String, Integer> freq = new HashMap<>();
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        String mostCommon = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostCommon = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println("Most common word: " + mostCommon + " (count: " + maxCount + ")");



    }
}
