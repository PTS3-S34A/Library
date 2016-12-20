package nl.soccar.exception;

/**
 * An RogueGameServerException is an Exception that is thrown when a connected
 * Game Server does not return the correct result of the predefined ping
 * formula.
 *
 * @author PTS34A
 */
public class RogueGameServerException extends SoccarException {

    /**
     * Initiates a new RogueGameServerException object.
     *
     * @param title The title of the exception, it will be used to display an
     * alert. The title shouldn't be null or empty.
     * @param message The exception-message, it will be used to display an
     * alert. The message shouldn't be null or empty.
     */
    public RogueGameServerException(String title, String message) {
        super(title, message);
    }

}
