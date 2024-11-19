/**
 * Represents the player in the game.
 * The player has an inventory and can move between rooms.
 * 
 * @author [Your Name]
 * @version 1.0
 */
import java.util.ArrayList;
import java.util.Stack;

public class Player {
    private ArrayList<Item> inventory;
    private Stack<Room> movementHistory;

    public Player() {
        this.inventory = new ArrayList<>();
        this.movementHistory = new Stack<>();
    }

    public void pickUpItem(Item item) {
        inventory.add(item);
    }

    public Item dropItem(String itemName) {
        for (Item item : inventory) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                inventory.remove(item);
                return item;
            }
        }
        return null;
    }

    public String listInventory() {
        if (inventory.isEmpty()) {
            return "Your inventory is empty.";
        }
        StringBuilder sb = new StringBuilder("You are carrying:");
        for (Item item : inventory) {
            sb.append("\n" + item.getName() + " - " + item.getDescription());
        }
        return sb.toString();
    }

    public void moveToRoom(Room room) {
        movementHistory.push(room);
    }

    public Room goBack() {
        if (!movementHistory.isEmpty()) {
            return movementHistory.pop();
        }
        return null;
    }
}