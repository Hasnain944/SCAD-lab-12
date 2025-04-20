package com.example.texteditorcommand.command;

import com.example.texteditorcommand.editor.TextEditor;

public class CutCommand implements Command {
    private final TextEditor editor;
    private String backup;

    public CutCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        backup = editor.getText();
        editor.cut();
    }

    @Override
    public void undo() {
        editor.setText(backup);
    }
}
