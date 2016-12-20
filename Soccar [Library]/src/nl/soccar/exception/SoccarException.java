package nl.soccar.exception;

import java.io.Serializable;

/**
 * SoccarException is the super-class wich the individual SoccarException
 * classes extend.
 *
 * @author PTS34A
 */
public class SoccarException extends Exception implements Serializable {

    private final String title;

    /**
     * Initiates a new SoccarException object.
     *
     * @param title The title for the exception, it will be used to display an
     * alert. The title shouldn't be null or empty.
     * @param message The exception-message, it will be used to display an
     * alert. The title shouldn't be null or empty.
     */
    public SoccarException(String title, String message) {
        super(message);
        this.title = title;
    }

    /**
     * Gets the title of this exception. The title, in turn, will be used to
     * display on an alert.
     *
     * @return String The title of the message. The title will never be null.
     */
    public String getTitle() {
        return title;
    }

}
