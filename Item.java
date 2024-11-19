/**
 * Represents an item in the game.
 * Each item has a name, description, and weight.
 * 
 * @author [Your Name]
 * @version 1.0
 */
public class Item {
    private String name;
    private String description;
    private double weight;

    /**
     * Constructor for the Item class.
     * 
     * @param name        The name of the item.
     * @param description A short description of the item.
     * @param weight      The weight of the item.
     */
    public Item(String name, String description, double weight) {
        this.name = name;
        this.description = description;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getWeight() {
        return weight;
    }
}