import java.util.Scanner;

public class Chatbot {

    String word;

    Chatbot (String word){
        this.word = word;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word");
      String  paragraph = sc.nextLine();

        Chatbot w = new Chatbot(paragraph);


        if (paragraph.equals("Hello")){
            System.out.println("HI How are you");
        }

        if (paragraph.equals("Who are you")){
            System.out.println("i am automated chatbot made by muneeb");
        }

        if (paragraph.equals("AI")){
            System.out.println("AI aims to enable computers to perform tasks that " +
                    "usually require human intelligence, like understanding" +
                    " language, recognizing objects, making decisions, and learning" +
                    " from experience");
        }
    }
}
