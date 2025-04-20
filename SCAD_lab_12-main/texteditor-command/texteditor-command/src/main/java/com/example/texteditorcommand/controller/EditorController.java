package com.example.texteditorcommand.controller;

import com.example.texteditorcommand.command.*;
import com.example.texteditorcommand.editor.CommandInvoker;
import com.example.texteditorcommand.editor.TextEditor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/editor")
public class EditorController {

    @Autowired private TextEditor editor;
    @Autowired private CommandInvoker invoker;

    @PostMapping("/cut")
    public String cut() {
        invoker.executeCommand(new CutCommand(editor));
        return "Cut executed";
    }

    @PostMapping("/copy")
    public String copy() {
        invoker.executeCommand(new CopyCommand(editor));
        return "Copy executed";
    }

    @PostMapping("/paste")
    public String paste() {
        invoker.executeCommand(new PasteCommand(editor));
        return "Paste executed";
    }

    @PostMapping("/undo")
    public String undo() {
        invoker.undoLastCommand();
        return "Undo executed";
    }
}
