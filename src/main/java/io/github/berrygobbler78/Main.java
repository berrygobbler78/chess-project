package io.github.berrygobbler78;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.ArrayList;
import java.util.logging.*;

public class Main {

    /* 
    
     * Logging is another way to print information to the user that is more intuitive and 
     * useful than System.out.println(); Logging can have multiple levels, such as:
     * SEVERE, WARNING, INFO, CONFIG, FINE, FINER, FINEST as well as: OFF and ALL
     * You can filter between the different levels of logging and choose what levels to show
     * certain messages
    */
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    private static Handler consoleHandler = new ConsoleHandler();

    public static void main(String[] args) {
        consoleHandler.setLevel(Level.ALL);

        LOGGER.addHandler(consoleHandler);
        LOGGER.setLevel(Level.ALL);
        LOGGER.setUseParentHandlers(false);

        ChessBoard chessBoard = new ChessBoard(consoleHandler);
    }
}