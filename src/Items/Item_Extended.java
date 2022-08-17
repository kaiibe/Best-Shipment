package Items;

// This is an extended class for an Item class
public  class Item_Extended extends Item {

    // receiving back all variables to our new class
    public Item_Extended(String type, String name, double height, double length, double width, double weight, double radius, double apothem, double base) {
        super(type, name, height, length, width, weight, radius, apothem, base);
    }


    // Method to print out general information of an item
    public String Item_Info() {

        String cnt = "";

        cnt += "Name of the item: " + getName() + "\n";
        cnt += "Type of the item: " + getType() + "\n";
        cnt += "Volume of " + getName() + ": " + Item_Volume() + "m3" + "\n";
        cnt += "Weight of " + getName() + ": " + getWeight() + "kg" + "\n";
        cnt += "\n";

        return cnt;
    }
}

