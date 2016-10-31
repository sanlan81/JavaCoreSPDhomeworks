package hw4.Console;

import java.io.File;

public class DirectoryListingCommand extends AbstractDirectoryListingCommand {
    public boolean matches(String input) {
        return input.equals("ls");
    }

    @Override
    protected boolean doPrintFile(File file, String inputls) {
        return true;
    }
}
