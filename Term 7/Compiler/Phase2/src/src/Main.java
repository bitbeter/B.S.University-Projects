package src;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.File;
import java.io.FileInputStream;

public class Main {

    public static FileHandler fileHandler = new FileHandler("../Examples/Phase2 examples");
    public static Parser parser = new Parser();

    public static void main(String[] args) throws Exception {
        File xFile;
//        while((xFile = fileHandler.getNextXFile())!=null){
            xFile = fileHandler.getNextXFile();
//            System.out.println(String.format("Compiling File : %s" ,xFile.getName()));
            parser.parse(new FileInputStream(xFile));
//        }
    }


}