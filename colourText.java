
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class colourText
{
    // instance variables - replace the example below with your own
    public static final String Black = "\u001B[30m";
    public static final String Red= "\u001b[31m";
    public static final String Green= "\u001b[32m";
    public static final String Yellow= "\u001b[33m";
    public static final String Blue="\u001b[34m";
    public static final String Magenta="\u001B[35m";
    public static final String Cyan="\u001b[36m";
    public static final String White="\u001b[37m";
    public static final String Reset="\u001b[0m";

    /**
     * Constructor for objects of class main
     */
    public static void main(String[] args)
    {

        // initialise instance variables
        System.out.println(Magenta+"Hello world"+Reset);
    }

    public colourText(){}


}