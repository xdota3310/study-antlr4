import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

/**
 * @author xu.shijie
 * @since 2022/7/31
 */
public class Test {
    public static void main(String[] args) throws IOException {
        ANTLRInputStream inputStream = new ANTLRInputStream(System.in);

        ArrayInitLexer arrayInitLexer = new ArrayInitLexer(inputStream);

        CommonTokenStream tokens = new CommonTokenStream(arrayInitLexer);

        ArrayInitParser parser = new ArrayInitParser(tokens);

        ParseTree tree = parser.init();

        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(new ShortToUnicodeString(), tree);
        System.out.println();

        System.out.println(tree.toStringTree(parser));
    }
}
