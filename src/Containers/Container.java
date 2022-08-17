package Containers;

public abstract class Container {

    // All variables are private
    private double length_small_container;
    private double width_small_container;
    private double height_small_container ;
    private double length_big_container;
    private double width_big_container;
    private double height_big_container ;


    // Constructor
    public Container(double length_small_container, double width_small_container, double height_small_container, double length_big_container, double width_big_container, double height_big_container) {

        this.length_small_container = length_small_container;
        this.width_small_container = width_small_container;
        this.height_small_container = height_small_container;

        this.length_big_container = length_big_container;
        this.width_big_container = width_big_container;
        this.height_big_container = height_big_container;
    }


    // getter and setter for all our variables
    public double getLength_small_container() {
        return length_small_container;
    }public void setLength_small_container(double length_small_container) {
        this.length_small_container = length_small_container;
    }

    public double getWidth_small_container() {
        return width_small_container;
    }public void setWidth_small_container(double width_small_container) {
        this.width_small_container = width_small_container;
    }

    public double getHeight_small_container() {
        return height_small_container;
    }public void setHeight_small_container(double height_small_container) {
        this.height_small_container = height_small_container;
    }

    public double getLength_big_container() {
        return length_big_container;
    }public void setLength_big_container(double length_big_container) {
        this.length_big_container = length_big_container;
    }

    public double getWidth_big_container() {
        return width_big_container;
    }public void setWidth_big_container(double width_big_container) {
        this.width_big_container = width_big_container;
    }

    public double getHeight_big_container() {
        return height_big_container;
    }public void setHeight_big_container(double height_big_container) {
        this.height_big_container = height_big_container;
    }



    // Calculating total volume of a small container
    public double SmallContainerVolume(){
        double cnt;

        cnt = getLength_small_container() * getWidth_small_container() * getHeight_small_container();

        return cnt;
    }


    // Abstract method for calculating total volume of a big container
    public abstract double BigContainerVolume();

}
