package Containers;

public class Container_Abstract extends Container {


    // receiving back all variables from our new class
    public Container_Abstract(double length_small_container, double width_small_container, double height_small_container, double length_big_container, double width_big_container, double height_big_container) {
        super(length_small_container, width_small_container, height_small_container, length_big_container, width_big_container, height_big_container);
    }


    // Assigning our abstract method, and calculating total volume of a big container
    public double BigContainerVolume(){
        double cnt;

        cnt = getLength_big_container() * getWidth_big_container() * getHeight_big_container();

        return cnt;
    }
}
