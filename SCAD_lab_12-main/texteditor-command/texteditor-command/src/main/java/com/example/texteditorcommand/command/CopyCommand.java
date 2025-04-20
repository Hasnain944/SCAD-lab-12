package com.example.texteditorcommand.command;
import com.example.texteditorcommand.editor.TextEditor;
public class CopyCommand implements Command {
    private final TextEditor editor;
    public CopyCommand(TextEditor editor) {
        this.editor = editor;
    }
    @Override
    public void execute() {
        editor.copy();
    }
    @Override
    public void undo() {
        // Copy has no undo
    }
}
