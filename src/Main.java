import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        Commands commands = new Commands();

        String word;
        String translation;

        System.out.println("Enter a word and translation");

        word = sc.next();
        translation = sc.next();

        commands.registerWord(word, translation);

    }

    /*public void checkVocabJson() {

        if (!jsonVocabFile.exists()) {
            try {
                jsonVocabFile.createNewFile();

            } catch (IOException e) {
                System.out.println("File cannot be created");
                throw new RuntimeException(e);
            }
        }

    }
    public boolean isVocabJsonExists(){

        return true;
    }*/
}



