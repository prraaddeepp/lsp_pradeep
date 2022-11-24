package org.howard.edu.lsp.assignment7;

public class EmptyListException extends Exception {
    public EmptyListException() {
            super("The list can not be empty.");
    }
}