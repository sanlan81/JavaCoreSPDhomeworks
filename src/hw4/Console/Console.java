package hw4.Console;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Console {
    private PrintStream outputStream;
    private Context context;
    private Scanner scanner;
    private CommandManager commandManager;

    Console(InputStream inputStream, PrintStream outputStream, String currentDir) {
        this.outputStream = outputStream;
        context = new Context(outputStream, currentDir);
        scanner = new Scanner(inputStream);
        commandManager = new CommandManager();
    }

    CommandManager getCommandManager() {
        return commandManager;
    }

     void enterLoop() {
        String input;
        Command command;

        while (context.isRunning()) {
            outputStream.print("Enter command ");
            input = scanner.nextLine();
            if (!input.isEmpty()) {
                try {
                    command = commandManager.matchCommand(input);
                    command.execute(input, context);
                } catch (CommandNotFoundException e) {
                    outputStream.println("Error: command not found");
                }
            }
        }
    }
}
