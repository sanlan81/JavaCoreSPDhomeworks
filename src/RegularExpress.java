import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpress {
    public static void main(String[] args) throws IOException {
        Pattern pattern;
        Matcher matcher;
        File file = new File("C:\\Users\\Sasha\\IdeaProjects\\SPD\\homework2\\src\\simpletext.txt");

        BufferedReader reader = new BufferedReader(new FileReader(file));

        String text = reader.readLine();
        System.out.println("Step 0: " + text);
        pattern = Pattern.compile("[A-Z][^?!]+\\.");

        matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Step 1: " + matcher.group(0));

            pattern = Pattern.compile("(?i:[aeiouy])");
            matcher = pattern.matcher(matcher.group(0));
            System.out.println("Step 2: " + matcher.replaceAll("_"));

        }
        reader.close();
    }
}
