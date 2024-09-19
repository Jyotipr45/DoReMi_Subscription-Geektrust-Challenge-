package com.geektrust.backend.commands;

import java.util.List;

public interface ICommand {

    /**
     * Executes the command with the given tokens.
     *
     * @param tokens a list of tokens representing command parameters
     */
    void execute(List<String> tokens);
}
