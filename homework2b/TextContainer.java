package homeWork2b;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

@SaveToFile(path = "text.txt")
public class TextContainer {
    private String text="Hello world";

    @Saver
    public void save(String path){
        try(PrintWriter pw = new PrintWriter(path)){
            pw.write(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
