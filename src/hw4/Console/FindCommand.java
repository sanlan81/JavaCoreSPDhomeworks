package hw4.Console;

import java.io.File;

public class FindCommand extends AbstractDirectoryListingCommand {
    public boolean matches(String input) {
        return input.startsWith("find ");
    }

    @Override
    protected boolean doPrintFile(File file, String input) {
        String pattern = input.substring(input.indexOf(" ") + 1);

        return file.getName().contains(pattern);
    }
}
