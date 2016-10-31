package hw4.Console;

import java.io.File;

 abstract class AbstractDirectoryListingCommand implements Command {
    protected abstract boolean doPrintFile(File file, String input);

    public void execute(String input, Context context) {
        File dir = new File(context.getCurrentDir());
        File[] dir2 = dir.listFiles();

        // ��⠢�� ᯥ樠�쭮 try catch �� �� �������� �� ⠬ �뫮 Exeption
        // �᫨  ���� if(dir2 != null) � �㤥� NullPointerException
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
