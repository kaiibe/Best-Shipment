package Items;

public class Item {

    // All variables are private
    private String type;
    private String name;
    private double height;
    private double length;
    private double width;
    private double radius;
    private double apothem;
    private double base;
    private double weight;

    //Constructor
    public Item(String type, String name, double height, double length, double width, double weight, double radius, double apothem, double base) {

        this.name = name;
        this.height = height;
        this.length = length;
        this.width = width;
        this.radius = radius;
        this.apothem = apothem;
        this.base = base;
        this.type = type;
        this.weight = weight;

    }


    // Getter and Setters for all our private variables
    public String getName() {
        return this.name;
    }public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }public void setType(String type) {
        this.type = type;
    }

    public double getHeight() {
        return this.height;
    }public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return this.length;
    }public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }public void setWidth(double width) {
        this.width = width;
    }

    public double getRadius() {
        return this.radius;
    }public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getApothem() {
        return this.apothem;
    }public void setApothem(double apothem) {
        this.apothem = apothem;
    }

    public double getBase() {
        return this.base;
    }public void setBase(double base) {
        this.base = base;
    }

    public double getWeight() {
        return weight;
    }public void setWeight(double weight) {
        this.weight = weight;
    }


    // Calculating volume of an item
    public double Item_Volume (){

        double ans = 0, p = 3.14;

        if ( this.type == "Cylindrical" ) {
            ans = this.height * p * ( this.radius * this.radius);
        } else if ( this.type == "Cuboid" ) {
            ans = this.height * this.length * this.width;
        } else if ( this.type == "Pentagonal" ){
            ans = this.height * this.apothem * this.base;
        }

        return ans;
    }

}







