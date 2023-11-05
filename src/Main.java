import java.io.File;

public class Main {
    /* Global definitions */
    
    //Variables
    int charClass;
    char[] lexeme = new char[100];
    char nextChar;
    int lexLen;
    int nextToken;
    File file;

    //Character classes
    private static final int LETTER = 0;
    private static final int DIGIT = 1;
    private static final int UNKNOWN = 99;

    //Initialize tokens
    private static final int INT_LIT = 10;
    private static final int IDENT = 11;
    private static final int ASSIGN_OP = 20;
    private static final int ADD_OP = 21;
    private static final int SUB_OP = 22;
    private static final int MULT_OP = 23;
    private static final int DIV_OP = 24;
    private static final int LEFT_PAREN = 25;
    private static final int RIGHT_PAREN = 26;

    public static void main(String[] args) {
    }

    //Functions

    void addChar() {
        //TODO: Add nextChar to lexeme
    }

    void getChar() {
        //TODO: Get next character of input and determine its character class
    }

    void getNonBlank() {
        while (Character.isWhitespace(nextChar)) getChar();
    }

    int lex() {
        //TODO: Lexical analyzer for arithmetic expressions
        
        return 0;
    }
}