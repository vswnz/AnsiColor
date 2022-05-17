
/**
 * Code with sample ANSI colour for text
 *
 * @author  Bill Viggers
 * @version 17-May-2022
 */
public class colourText
{
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

        System.out.println(Magenta+"Hello world"+Reset);
    }

    public colourText(){}


}