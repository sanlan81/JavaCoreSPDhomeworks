package hw4.Console;

 class CurrentWorkingDirCommand implements Command {
    public boolean matches(String input) {

        return input.equals("pwd");
    }

    public void execute(String input, Context context) {

        context.getOutputStream().println(context.getCurrentDir());
    }
}
