package hw4.Console;

public interface Command {
    boolean matches(String input);
    void execute(String input, Context context);
}
