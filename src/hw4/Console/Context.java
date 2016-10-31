package hw4.Console;

import java.io.PrintStream;

class Context {
    private boolean isRunning;
    private String currentDir;
    private PrintStream outputStream;

    Context(PrintStream outputStream, String currentDir) {
        isRunning = true;
        this.outputStream = outputStream;
        this.currentDir = currentDir;
    }

    boolean isRunning() {return isRunning;}

    void setRunning(boolean running) {
        isRunning = running;
    }

    String getCurrentDir() {
        return currentDir;
    }

    void setCurrentDir(String currentDir) {
        this.currentDir = currentDir;
    }

    PrintStream getOutputStream() {
        return outputStream;
    }
}
