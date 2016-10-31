package hw4.Console;

import java.io.File;

 abstract class AbstractDirectoryListingCommand implements Command {
    protected abstract boolean doPrintFile(File file, String input);

    public void execute(String input, Context context) {
        File dir = new File(context.getCurrentDir());
        File[] dir2 = dir.listFiles();

        // Оставил специально try catch что бы показать что там было Exeption
        // если  убрать if(dir2 != null) то будет NullPointerException
        if (dir2 != null) {
            try {
                for (File file : dir2) {
                    if (doPrintFile(file, input)) {
                        context.getOutputStream().println(file.getName());
                    }
                }
            } catch (NullPointerException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
