import java.io.*;
import java.util.*;

public class FileOperator {

    private File myfile;
    Scanner fileReader;

    public FileOperator(String f) throws IOException {
        setFile(f);
    }
    public void setFile(String f) throws IOException {
        myfile = new File(f);
        fileReader = new Scanner(myfile);
    }
    public String readLine(){
        return fileReader.nextLine();
    }
}
