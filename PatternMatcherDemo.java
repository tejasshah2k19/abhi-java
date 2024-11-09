import java.util.regex.Pattern;
import java.util.regex.Matcher;;

public class PatternMatcherDemo {
    public static void main(String[] args) {

        // Pattern
        // Matcher

        // String data = "ABABCCDBAABABACABBAACB";

        // Pattern p = Pattern.compile("ABA");
        // Matcher m = p.matcher(data);

        // System.out.println(m.find());//true
        // System.out.println(m.start());//0

        // System.out.println(m.find());//true
        // System.out.println(m.start());//7

        String data = "5647uwjsdbvgyt5d12345fgg123456dd8gyt7dd5f4g82ie223k";

        // Pattern p = Pattern.compile("[ABC]");//A or B or C
        // Pattern p = Pattern.compile("[A-F]");//A or B or C or D or E or F

        // Pattern p = Pattern.compile("[A-Fa-f]");//A or B or C or D or E or F or a or
        // b or c or d or e or f

        // Pattern p = Pattern.compile("[0-9]");//digit

        // Pattern p = Pattern.compile("[a-zA-Z0-9]");//alNum

        // Pattern p = Pattern.compile("\\d");// digit
        // Pattern p = Pattern.compile("[^a-f]");// all except a-f

        // Pattern p = Pattern.compile("a.c");// start with a then any character then c

        // Pattern p = Pattern.compile("a..c");// start with a then any character any
        // character then c

        // Pattern p = Pattern.compile("\\d+");// digit  123 1 2 3 123 
        // Pattern p = Pattern.compile("\\d{3}");// search digit with 3 length 
     
        

        //xxxx@xxxx.XXX 

        String emailRegEx = "[a-zA-Z0-9_]+@[a-zA-Z]+\\.[a-zA-Z]{2,3}";

        Pattern p = Pattern.compile("\\d{3,6}");// search digit with 3 length min and max 6  
        Matcher m = p.matcher(data);

        while (m.find()) {
            System.out.println(m.start() + " " + m.group());
        }
    }
}

// \d
// \s
// \w
// . -> any single character

// +  => min : 1 max : n 
// *  => min : 0 max : n 
// ?  => min : 0 max : 1 

// \d{3} 

