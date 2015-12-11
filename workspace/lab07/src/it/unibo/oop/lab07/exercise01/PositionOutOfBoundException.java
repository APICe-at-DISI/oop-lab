package it.unibo.oop.lab07.exercise01;

/**
 * Represents an exception occurring when a robot overcomes the boundaries of
 * its environment.
 * 
 */
@SuppressWarnings("serial")
public class PositionOutOfBoundException extends Exception {

    private final int x;
    private final int y;

    /**
     * Construct new instance of the exception.
     * 
     * @param initX
     *            position on X that caused the exception
     * @param initY
     *            position on Y that caused the exception
     */
    public PositionOutOfBoundException(final int initX, final int initY) {
        super();
        this.x = initX;
        this.y = initY;
    }

    /**
     * {@inheritDoc}
     */
    public String getMessage() {
        return "Can not move to pos(" + this.x + ", " + this.y + "), out of bounds";
    }
}