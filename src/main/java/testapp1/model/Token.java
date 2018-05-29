package testapp1.model;


public abstract class Token {

    public static final Token EOF = new Token(-1) {
    };

    public static final String EOL = "\\n";

    private int lineNumber;

    protected Token(int line){
        lineNumber = line;
    }


    public int getLineNumber(){
        return lineNumber;
    }































}
