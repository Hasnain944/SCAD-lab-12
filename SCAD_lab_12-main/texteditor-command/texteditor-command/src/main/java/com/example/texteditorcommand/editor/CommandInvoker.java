package com.example.texteditorcommand.editor;

import com.example.texteditorcommand.command.Command;
import org.springframework.stereotype.Component;

import java.util.Stack;

@Component
public class CommandInvoker {
    private final Stack<Command> history = new Stack<>();

    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
    }

    public void undoLastCommand() {
        if (!history.isEmpty()) {
            Command lastCommand = history.pop();
            lastCommand.undo();
        }
    }
}
