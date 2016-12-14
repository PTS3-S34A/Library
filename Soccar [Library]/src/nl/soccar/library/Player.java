package nl.soccar.library;

import nl.soccar.library.enumeration.Privilege;
import nl.soccar.library.enumeration.CarType;

/**
 * A Player is an object which contains information about the user that is
 * playing the game.
 *
 * @author PTS34A
 */
public class Player {

    private final String username;
    private final Privilege privilege;
    private final CarType carType;


    private Statistics statistics;

    private int playerId;
    private Session currentSession;

    /**
     * Constructor used for instantiation of a Player object.
     *
     * @param username The username of this player that will visible for all
     * other players of the game.
     * @param privilege The Privilege of this player that is used to maintain
     * system rights.
     * @param carType The CarType of this player that determines the aesthetics
     * of the car.
     */
    public Player(String username, Privilege privilege, CarType carType) {
        this.username = username;
        this.privilege = privilege;
        this.carType = carType;
    }

    /**
     * Gets the username of this player.
     *
     * @return The username of this player, not null.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Gets the privilege of this player.
     *
     * @return The Privilege of this player that is used to maintain system
     * rights, not null.
     */
    public Privilege getPrivilege() {
        return privilege;
    }

    /**
     * Gets the CarType of this Player.
     *
     * @return Car type of this player, not null.
     */
    public CarType getCarType() {
        return carType;
    }

    /**
     * Gets the Game Statistics of this Player.
     *
     * @return Game Statistics of this Player, not null.
     */
    public Statistics getStatistics() {
        return statistics;
    }

    /**
     * Sets the Game Statistics of this player.
     *
     * @param statistics The new Game Statistics of this Player.
     */
    public void setStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    /**
     * Gets the Session that is currently joined by the Player that launched the
     * application.
     *
     * @return The Session, may be null to indicate that there's no current
     * Session., that is currently joined.
     */
    public Session getCurrentSession() {
        return currentSession;
    }

    /**
     * Sets the current Session that is joined by the player that launched the
     * application.
     *
     * @param currentSession The current session, may be null to indicate
     * there's no joined Session, the current player is in.
     */
    public void setCurrentSession(Session currentSession) {
        this.currentSession = currentSession;
    }

    /**
     * Gets the id of the Player, relative to the Session that he/she joined.
     *
     * @return The id of the Player.
     */
    public int getPlayerId() {
        return playerId;
    }

    /**
     * Sets the id of the Player. Be warned that this method may break communication between components.
     *
     * @param playerId The new id of the Player.
     */
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    @Override
    public int hashCode() {
        int result = 31;
        result = 17 * result + username.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Player)) {
            return false;
        }

        Player other = (Player) o;
        return other.username.equals(username);
    }

    @Override
    public String toString() {
        return username;
    }
}
