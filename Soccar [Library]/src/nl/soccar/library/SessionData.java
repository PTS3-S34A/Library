package nl.soccar.library;

import java.io.Serializable;

/**
 * A SessionData is a container object that keeps track of all info of a running
 * session.
 *
 * @author PTS34A
 */
public class SessionData implements Serializable {

    private static final int DEFAULT_OCCUPATION = 0;
    private static final int DEFAULT_CAPACITY = 6;

    private final String address;
    private final String roomName;
    private String hostName;
    private final boolean hasPassword;
    private int occupation;
    private int capacity;

    /**
     * Constructor used for instantiation of a new SessionData object. A
     * SessionData object serves as a container object of of all info of a
     * running session.
     *
     * @param address The address of the game server on which this session is
     * hosted.
     * @param roomName The name of the room.
     * @param hostName the name of the player that hosts the session.
     * @param hasPassword Indicates if the room is password protected.
     */
    public SessionData(String address, String roomName, String hostName, boolean hasPassword) {
        this.address = address;
        this.roomName = roomName;
        this.hostName = hostName;
        this.hasPassword = hasPassword;
        occupation = DEFAULT_OCCUPATION;
        capacity = DEFAULT_CAPACITY;
    }

    /**
     * Gets the IP-address of the game server.
     *
     * @return The IP-address of the game server.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Gets the name of the room.
     *
     * @return The name of the room.
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * Gets the name of the player that hosts the session.
     *
     * @return The name of the player that hosts the session.
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * Gets the boolean value indicating if the session is password protected.
     *
     * @return The boolean value indicating if the session is password
     * protected.
     */
    public boolean hasPassword() {
        return hasPassword;
    }

    /**
     * Gets the occupation of the session.
     *
     * @return The occupation of the session.
     */
    public int getOccupation() {
        return occupation;
    }

    /**
     * Gets the capacity of the session.
     *
     * @return The capacity of the session.
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Sets the hostname of the session.
     *
     * @param hostName The hostname that needs to be set for the session.
     */
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    /**
     * Sets the capacity of the session.
     *
     * @param occupation The occupation that needs to be set for the session.
     */
    public void setOccupation(int occupation) {
        this.occupation = occupation;
    }

    /**
     * Sets the capacity of the session.
     *
     * @param capacity The capacity that needs to be set for the session.
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}
