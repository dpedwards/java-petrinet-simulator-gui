/* Copyright Davain Pablo Edwards core8@gmx.net. Licensed https://creativecommons.org/licenses/by-nc-sa/4.0/deed.en */
package business;

/**
 * Represents an abstract arc in a petri net or similar net-based structures.
 * <p>
 * An arc in these structures typically defines a connection or relationship
 * between two distinct types of net objects, such as places and transitions.
 * This abstract class provides a foundation for specific types of arcs that 
 * may have varied behaviors or attributes.
 * </p>
 * As an extension of the {@link NetObject} class, the `Arc` class inherits 
 * general properties and behaviors that are common to all objects in the net. 
 * This could include attributes like ID, label, or any other generic properties 
 * defined in the parent class.
 * </p>
 * Concrete subclasses of `Arc` should implement specific arc behaviors and 
 * possibly override or extend the inherited behaviors from `NetObject`.
 * 
 * The class Arc is an example of the Template Method design pattern. 
 * This pattern is characterized by an abstract class that defines a 'template' of operations, 
 * some of which are implemented by the abstract class itself and some of which are left abstract, 
 * to be implemented by subclasses.
 * In this case, the Arc class is an abstract class that extends NetObject. 
 * It provides a structure (or 'template') for an arc in a net-based structure, with some behaviors
 * defined (like getting and setting the connected Place) and some behaviors left for concrete subclasses to implement. 
 * This is typical of the Template Method pattern.
 */
public abstract class Arc extends NetObject {

    /** The place to which this arc connects. */
    protected Place place;

    /** The transition to which this arc connects. */
    protected Transition transition;

    /**
     * Retrieves the place to which this arc is connected.
     *
     * @return The connected place.
     */
    public Place getPlace() {
        return place;
    }

    /**
     * Sets or updates the place to which this arc connects.
     *
     * @param place The place to connect this arc to.
     */
    public void setPlace(Place place) {
        this.place = place;
    }

    /**
     * Retrieves the transition to which this arc is connected.
     *
     * @return The connected transition.
     */
    public Transition getTransition() {
        return transition;
    }

    /**
     * Sets or updates the transition to which this arc connects.
     *
     * @param transition The transition to connect this arc to.
     */
    public void setTransition(Transition transition) {
        this.transition = transition;
    }
}
