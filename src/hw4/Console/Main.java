package hw4.Console;

public class Main {

    public static void main(String[] args) {
	    Console console = new Console(System.in, System.out, System.getProperty("user.dir"));

        CommandManager commandManager = console.getCommandManager();
        commandManager.addCommand(new ExitCommand());
        commandManager.addCommand(new CurrentWorkingDirCommand());
        commandManager.addCommand(new ChangeDirectoryCommand());
        commandManager.addCommand(new DirectoryListingCommand());
        commandManager.addCommand(new FindCommand());

        console.enterLoop();
    }
}
