package hw4.Console;

public class ExitCommand implements Command {
    public boolean matches(String input) {

        return input.equals("exit");
    }

    public void execute(String input, Context context) {

        context.setRunning(false);
    }
}
