import java.io.*;
import java.util.*;
import java.net.*;

public class FileOperator {

    private File myfile;
    Scanner fileReader;

    public static void main(String[] args) throws IOException {
        FileOperator FO = new FileOperator("https://people.sc.fsu.edu/~jburkardt/data/csv/airtravel.csv");
        String line=FO.readLine()
        while(FO.readLine()!=null){
            System.out.println(line);
            line=FO.readLine();
        }

    public FileOperator(String f) throws IOException {
        setFile(f);
    }

    public FileOperator(String url, boolean isOnline) throws IOException{
        if (isOnline == true) {
           setUrl(url);
        }else {
            setFile(url);
        }
    }

    public void setFile(String f) throws IOException {
        myfile = new File(f);
        fileReader = new Scanner(myfile);
    }

    public void setUrl(String fileName) throws IOException {
        URL url = new URL(fileName);
        fileReader = new Scanner(url.openStream());
    }
    public String readLine(){
        return fileReader.nextLine();
    }
}
