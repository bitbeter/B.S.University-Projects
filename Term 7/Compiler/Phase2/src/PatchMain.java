import grammer.XLexer;
import grammer.XParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import src.ErrorLogger;
import src.XParts.Global;
import src.myVisitors.ProgramVisitor;

/**
 * Created by hasan on 12/19/2016 AD.
 */
public class PatchMain {
    public static ErrorLogger errorLogger;

    public static void main(String[] args) throws Exception {
        CharStream in = new ANTLRInputStream(System.in);
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
