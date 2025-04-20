package com.example.texteditorcommand.editor;

import org.springframework.stereotype.Component;

@Component
public class TextEditor {
    private String text = "Hello World";
    private String clipboard = "";

    public void cut() {
        clipboard = text;
        text = "";
        System.out.println("Cut: " + clipboard);
    }

    public void copy() {
        clipboard = text;
        System.out.println("Copied: " + clipboard);
    }

    public void paste() {
        text += clipboard;
        System.out.println("Pasted: " + clipboard);
    }

    public void setText(String text) {
        this.text = text;
        System.out.println("Text restored: " + text);
    }

    public String getText() {
        return text;
    }

}
