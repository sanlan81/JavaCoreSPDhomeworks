package hw4.Console;

import java.io.File;

class ChangeDirectoryCommand implements Command {
    public boolean matches(String input) {
        return input.startsWith("cd ");
    }

    public void execute(String input, Context context) {
        String gotoDir = input.substring(3);

        if (gotoDir.startsWith(File.separator)) {
            gotoDir = gotoDir.substring(1);
        }
        if (gotoDir.endsWith(File.separator)) {
            gotoDir = gotoDir.substring(0, gotoDir.length() - 1);
        }

        String newDir = context.getCurrentDir() + File.separator + gotoDir;

        context.setCurrentDir(newDir);
    }
}
