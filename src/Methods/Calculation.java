package Methods;


import Items.Item_Extended;
import java.util.ArrayList;


public class Calculation {


    // Calculating total volume of all items
    public static double TotalVolume( ArrayList<Item_Extended> items_obj ){

        double cnt = 0;

        // This Loop is going through all our objects
        for ( Items.Item_Extended i: items_obj ){
            cnt += i.Item_Volume();
        }

        return cnt;
    }


    // Calculating total weight of all items
    public static double TotalWeight( ArrayList<Item_Extended> items_obj ){

        double cnt = 0;

        // This Loop is going through all our objects
        for ( Items.Item_Extended i: items_obj ){
            cnt += i.getWeight();
        }

        return cnt;
    }


    // Calculating best Shipment
    public static String Best_Shipment( double itemVolume, double itemWeight, double SmallContainer, double BigContainer ) {

        String cnt = "";

        int big = 0;        // needed to count how much big containers may be needed
        int small1 = 0;     // needed to count how much small containers with over 500kg may be needed
        int small2 = 0;     // needed to count how much small containers with under 500kg may be needed


        System.out.println();

        // I used the same algorithm that I used in the first assignment
        while ( true ) {
            if ( itemVolume <= 0 )
                break;

            if ( itemVolume <= SmallContainer ){
                if (itemWeight >= 500) {          // Condition for checking if the Total Weight is bigger 500g. Thus, counter for small containers with over 500kg is increased by 1
                    small1 ++;
                    itemVolume -= SmallContainer;
                } else {                                  // Condition will work if the Total Weight is less than 500g. Thus, counter for big containers with under 500kg is increased by 1
                    small2 ++;
                    itemVolume -= SmallContainer;
                }
            }else{
                big ++;
                itemWeight -= ( itemWeight / itemVolume ) * BigContainer;		// Decreasing Item Weight by density
                itemVolume -= BigContainer;
            }
        }

        cnt += "Total Containers Needed: " + ( big + small1 + small2) + "\n";
        cnt += "Big container needed: " + big + "\n";
        cnt += "Small container with over 500kg needed: " + small1 + "\n";
        cnt += "Small container with under 500kg needed: " + small2 + "\n\n\n";


        // Calculate and Print the total price
        int price = (big * 1800) + (small1 * 1200) + (small2 * 1000);

        cnt += "Total price needed: " + price + "€";

        return cnt;
    }



    // Method to print out general information of all items
    public static String ItemsInformation( double total_items_volume, double total_items_weight, double small_container_volume, double big_container_volume ){

        String cnt = "";

        cnt += "Total Volume of Items: " + total_items_volume + "m3\n";

        cnt += "Total Weight of Items: " + total_items_weight + "kg\n";
        cnt += "Total Volume of a Big Container: " + big_container_volume + "m3\n";
        cnt += "Total Volume of a Small Container: " + small_container_volume + "m3\n";
        cnt += "\n";

        return cnt;
    }

    // Method to calculate how much of each box types we have
    public static String ItemsOrder(  ArrayList<Item_Extended> items_obj ) {

        long cylindrical = 0, cuboid = 0, pentagonal = 0;

        String cnt = "";

        for ( Items.Item_Extended i: items_obj ){
            if ( i.getType() == "Cylindrical" )
                cylindrical ++;
            else if ( i.getType() == "Cuboid" )
                cuboid ++;
            else if ( i.getType() == "Pentagonal" )
                pentagonal ++;
        }

        cnt += "Total of Cylindrical boxes: " + cylindrical + "\n";
        cnt += "Total of Cuboid boxes: " + cuboid + "\n";
        cnt += "Total of Pentagonal boxes: " + pentagonal + "\n";

        return cnt;
    }

}
