import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpress {
    public static void main(String[] args) throws IOException {
        Pattern pattern;
        Matcher matcher;
        String text = "Corporations have the need to raise capital for a number of reasons? " +
                " Smaller firms need capital to start up operations." +
                "Larger firms need capital to expand operations and to finance inventory. " +
                "The SEC made it easier for small businesses to raise capital through public stock offerings." +
                "There are various ways in which a firm can raise capital through the financial system and numerous " +
                "individuals and entities that can assist a corporation in this crucial venture!" +
                "Start-up firms and small businesses petition investors for what is known as venture capital.";

        System.out.println("Step 0: " + text);
        pattern = Pattern.compile("[A-Z][^?!]+\\.");

        matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Step 1: " + matcher.group(0));

            pattern = Pattern.compile("(?i:[aeiouy])");
            matcher = pattern.matcher(matcher.group(0));
            System.out.println("Step 2: " + matcher.replaceAll("_"));

        }

    }
}
