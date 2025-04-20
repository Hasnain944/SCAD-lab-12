package com.example.texteditorcommand.command;

import com.example.texteditorcommand.editor.TextEditor;

public class PasteCommand implements Command {
    private final TextEditor editor;
    private String backup;

    public PasteCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        backup = editor.getText();
        editor.paste();
    }

    @Override
    public void undo() {
        editor.setText(backup);
    }
}
