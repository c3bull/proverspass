package service;

import codeGen.SpassLexer;
import codeGen.SpassParser;
import codeGen.SpassParserBaseVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {

    private static final String TEST_FILE_PATH = "src/example/spass/pelleter_57.spass";

    public static void main(String[] args) throws IOException {

        CharStream input = CharStreams.fromFileName(TEST_FILE_PATH);
        SpassLexer lexer = new SpassLexer(input);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        SpassParser parser = new SpassParser(commonTokenStream);

        ParseTree tree = parser.problem();

        SpassParserBaseVisitor spassParserBaseVisitor = new SpassParserBaseVisitor();
        System.out.println(spassParserBaseVisitor.visit(tree));

        System.out.println(spassParserBaseVisitor.getFinalText());
    }
}
