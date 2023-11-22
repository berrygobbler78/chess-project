package io.github.berrygobbler78.exceptions;

public class InvalidMoveException extends Exception {
    public InvalidMoveException(String move, String cause) {
        super(move + " is not a valid move \nCause: " + cause);
    }
}
