package hw4.Console;

import java.util.ArrayList;
import java.util.List;

class CommandManager {
    private List<Command> commands = new ArrayList<Command>();

    void addCommand(Command command) {

        commands.add(command);
    }

    Command matchCommand(String input) throws CommandNotFoundException {
        for (Command command : commands) {
            if (command.matches(input)) {
                return command;
            }
        }

        throw new CommandNotFoundException();
    }
}
