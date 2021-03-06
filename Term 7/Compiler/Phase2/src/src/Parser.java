package src;

import grammer.XLexer;
import grammer.XParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import src.XParts.Global;
import src.myVisitors.ProgramVisitor;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by hasan on 12/8/2016 AD.
 */
public class Parser {

    public static ErrorLogger errorLogger;

    public void parse(FileInputStream fileInputStream) throws IOException {
        CharStream in = new ANTLRInputStream(fileInputStream);
        XLexer lexer = new XLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        errorLogger = new ErrorLogger(tokens);
        XParser parser = new XParser(tokens);
        ProgramVisitor programVisitor = new ProgramVisitor();
        Global global = programVisitor.visitProgram(parser.program());
        if(errorLogger.isErrorOccurred()) {
            System.exit(1);
        } else {
            global.print();
            System.exit(0);
        }
    }

}
