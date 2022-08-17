package GUI;

import Items.Item_Extended;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ResultsGUI extends JFrame implements ActionListener {

    String ItemsInformation = "";
    String ShipmentInformation = "";

    double total_items_volume = 0;
    double total_items_weight = 0;
    double small_container_volume = 0;
    double big_container_volume = 0;



    ArrayList<Items.Item_Extended> items_obj = new ArrayList<>();

    JPanel RadioButtonPanel = new JPanel();
    JPanel ItemsInformationPanel = new JPanel();
    JPanel ShipmentInformationPanel = new JPanel();
    JPanel buttonsPanel = new JPanel();

    String str = "asd dasd as \n asdasd a\n asdasdas";

    JTextArea totalShapes = new JTextArea();
    JTextArea ShipmentInfo = new JTextArea();



    JRadioButton ItemsInformationRadioButton = new JRadioButton("Items Information");
    JRadioButton ShipmentInformationRadioButton = new JRadioButton( "Shipment Information" );

    JButton againButton = new JButton("New Shipment");
    JButton exitButton = new JButton("Exit");

    public ResultsGUI( ArrayList<Item_Extended> items_obj ) {

        totalShapes.setText(str);

        this.add(RadioButtonPanel);
        RadioButtonPanel.setBounds(0, 0, 600, 70);
        RadioButtonPanel.setBackground(Color.WHITE);
        RadioButtonPanel.add(ItemsInformationRadioButton);
        RadioButtonPanel.add(ShipmentInformationRadioButton);
        RadioButtonPanel.setLayout(null);


        this.add(ItemsInformationPanel);
        ItemsInformationPanel.setBounds(0, 70, 600, 460);
        ItemsInformationPanel.setLayout(null);
        ItemsInformationPanel.setVisible(false);
        ItemsInformationPanel.setBackground(Color.WHITE);


        this.add(ShipmentInformationPanel);
        ShipmentInformationPanel.setBounds(0, 70, 600, 460);
        ShipmentInformationPanel.setLayout(null);
        ShipmentInformationPanel.setVisible(false);
        ShipmentInformationPanel.setBackground(Color.WHITE);


        this.add(buttonsPanel);
        buttonsPanel.setLayout(null);
        buttonsPanel.setBounds(0, 530, 600, 50);
        buttonsPanel.setBackground(Color.WHITE);
        buttonsPanel.add(againButton);
        buttonsPanel.add(exitButton);


        againButton.setBounds(340, 10, 150, 20);
        againButton.addActionListener(this);

        exitButton.setBounds(500, 10, 70, 20);
        exitButton.addActionListener(this);

        ItemsInformationPanel.add(totalShapes);
        totalShapes.setBounds(20, 20, 550, 450);


        ItemsInformation += Methods.Calculation.ItemsOrder(items_obj);

        ItemsInformation += "\n\n";

        for ( Items.Item_Extended i: items_obj ){
            ItemsInformation += i.Item_Info();
        }

        totalShapes.setText( ItemsInformation );
        totalShapes.setEditable(false);


        total_items_volume = Methods.Calculation.TotalVolume(items_obj);    // Taking Total Volume of items
        total_items_weight = Methods.Calculation.TotalWeight(items_obj);    // Taking Total Weight of items


        Containers.Container_Abstract containers = new Containers.Container_Abstract( 6.06, 2.43, 2.59, 12.01, 2.43, 2.59 );      // creating an object
        small_container_volume = containers.SmallContainerVolume();     // Taking Total Volume of a small container
        big_container_volume = containers.BigContainerVolume();         // Taking Total Volume of a big container



        ShipmentInformationPanel.add(ShipmentInfo);
        ShipmentInfo.setBounds(20, 20, 550, 450);
        ShipmentInformation += Methods.Calculation.ItemsInformation( total_items_volume, total_items_weight, small_container_volume, big_container_volume );

        ShipmentInformation += Methods.Calculation.Best_Shipment(total_items_volume, total_items_weight, small_container_volume, big_container_volume);

        ShipmentInfo.setText(ShipmentInformation);
        ShipmentInfo.setEditable(false);

        ItemsInformationRadioButton.setBounds(100, 20, 150, 20);
        ItemsInformationRadioButton.addActionListener(this);

        ShipmentInformationRadioButton.setBounds(300, 20, 250, 20);
        ShipmentInformationRadioButton.addActionListener(this);



        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(ItemsInformationRadioButton);
        buttonGroup.add(ShipmentInformationRadioButton);



        this.setTitle("Results");
        this.setLayout(null);
        this.setSize(600, 600);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == ItemsInformationRadioButton ) {

            ItemsInformationPanel.setVisible(true);
            ShipmentInformationPanel.setVisible(false);

        } else if ( e.getSource() == ShipmentInformationRadioButton ) {

            ShipmentInformationPanel.setVisible(true);
            ItemsInformationPanel.setVisible(false);

        }

        if ( e.getSource() == againButton ) {
            this.dispose();
            new ItemsQuantityFrame();
        } else if ( e.getSource() == exitButton ) {
            System.exit(0);
        }

    }
}
