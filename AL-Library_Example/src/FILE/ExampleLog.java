package FILE;
// Make By Bình An || AnLaVN || KatoVN

import com.AnLa.FILE.Log;

public class ExampleLog {

    public static void main(String[] args) {
        Log.add("Your text");   //write text to log file, will auto create as Log folder.
        System.out.println("File path: " + Log.getFilePath());  //print path of log file.
        Log.closeFile();    //close file if your dont use anymore.
    }
    
}