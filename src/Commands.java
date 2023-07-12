import net.sf.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Commands {

    String word;
    String translation;

    File vocabJsonPath = new File(System.getenv(".env"));
    public void registerWord(String word, String translation) {

        this.word = word;
        this.translation = translation;

        //initializes the json object which will store all the values and keys
        JSONObject vocabJson = new JSONObject();

        //creates keys and values (according to user input)
        vocabJson.put("word", word);
        vocabJson.put("translation", translation);

        //writes to file path
        try {
            FileWriter vocabJsonFileWriter = new FileWriter(vocabJsonPath, false);
            vocabJsonFileWriter.write(vocabJson.toString());
            vocabJsonFileWriter.close();
            System.out.println("File created");
        }

        catch (IOException e) {
            System.out.println("Failed to write to " + vocabJson.toString());
            throw new RuntimeException(e);
        }


    }
}
