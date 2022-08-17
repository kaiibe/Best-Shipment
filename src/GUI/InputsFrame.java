package GUI;

import Items.Item_Extended;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class InputsFrame extends JFrame implements ActionListener {

    String name, type, cnt;
    double height, length, width, radius, apothem, base, weight;

    int numberOfItems;
    int choice = 0;
    int i = 1;

    ArrayList<Items.Item_Extended> items_obj = new ArrayList<>();



    JLabel label = new JLabel("Choose shape of " + i + " item");
    JLabel errorLabel = new JLabel("Error: Inputs Are Wrong Format!");
    JLabel succeedLabel = new JLabel("Succeed: Item Added");


    JButton nextButton = new JButton("Next");



    JRadioButton cylindricalRadioButton = new JRadioButton("Cylindrical");
    JRadioButton cuboidRadioButton = new JRadioButton("Cuboid");
    JRadioButton pentagonalRadioButton = new JRadioButton("Pentagonal");



    JPanel choicePanel = new JPanel();
    JPanel cylindricalPanel = new JPanel();
    JPanel cuboidPanel = new JPanel();
    JPanel pentagonalPanel = new JPanel();



    JTextField itemNameCylindrical = new JTextField();
    JLabel nameCylindrical = new JLabel("Enter the name of an item: ");

    JTextField itemHeightCylindrical = new JTextField();
    JLabel heightCylindrical = new JLabel("Enter the height of an item: ");

    JTextField itemRadiusCylindrical = new JTextField();
    JLabel radiusCylindrical = new JLabel("Enter the radius of an item: ");

    JTextField itemWeightCylindrical = new JTextField();
    JLabel weightCylindrical = new JLabel("Enter the weight of an item: ");


    ////////////////////////////////////////////////////////////////////////////////


    JTextField itemNameCuboid = new JTextField();
    JLabel nameCuboid = new JLabel("Enter the name of an item: ");

    JTextField itemHeightCuboid = new JTextField();
    JLabel heightCuboid = new JLabel("Enter the height of an item: ");

    JTextField itemLengthCuboid = new JTextField();
    JLabel lengthCuboid = new JLabel("Enter the length of an item: ");

    JTextField itemWidthCuboid = new JTextField();
    JLabel widthCuboid = new JLabel("Enter the width of an item: ");

    JTextField itemWeightCuboid = new JTextField();
    JLabel weightCuboid = new JLabel("Enter the weight of an item: ");


    ////////////////////////////////////////////////////////////////////////////////


    JTextField itemNamePentagonal = new JTextField();
    JLabel namePentagonal = new JLabel("Enter the name of an item: ");

    JTextField itemHeightPentagonal = new JTextField();
    JLabel heightPentagonal = new JLabel("Enter the height of an item: ");

    JTextField itemApothemPentagonal = new JTextField();
    JLabel apothemPentagonal = new JLabel("Enter the apothem of an item: ");

    JTextField itemBasePentagonal = new JTextField();
    JLabel basePentagonal = new JLabel("Enter the base of an item: ");

    JTextField itemWeightPentagonal = new JTextField();
    JLabel weightPentagonal = new JLabel("Enter the weight of an item: ");

    public InputsFrame( int numberOfItems)  {

            if ( numberOfItems == 1 ) {
                nextButton.setText("Finish");
            }


            this.numberOfItems = numberOfItems;
            this.setBackground(Color.WHITE);

            choicePanel.setBackground(Color.WHITE);
            choicePanel.setBounds(0, 0, 600, 100);
            choicePanel.setLayout(null);
            this.add(choicePanel);



            cylindricalPanel.setBackground(Color.WHITE);
            cylindricalPanel.setBounds(0, 100, 600, 400);
            cylindricalPanel.setLayout(null);
            cylindricalPanel.setVisible(false);
            this.add(cylindricalPanel);

            cuboidPanel.setBackground(Color.WHITE);
            cuboidPanel.setBounds(0, 100, 600, 400);
            cuboidPanel.setLayout(null);
            cuboidPanel.setVisible(false);
            this.add(cuboidPanel);


            pentagonalPanel.setBackground(Color.WHITE);
            pentagonalPanel.setBounds(0, 100, 600, 400);
            pentagonalPanel.setLayout(null);
            pentagonalPanel.setVisible(false);
            this.add(pentagonalPanel);



            label.setBounds(190, 10, 300, 20);
            cylindricalRadioButton.setBounds(100, 50, 100, 20);
            cuboidRadioButton.setBounds(240, 50, 100, 20);
            pentagonalRadioButton.setBounds(350, 50, 120, 20);
            label.setFont( new Font("Serief", Font.PLAIN, 20) );

            this.add(errorLabel);
            errorLabel.setVisible(false);
            errorLabel.setBounds( 30, 530, 200, 20 );
            errorLabel.setForeground(Color.RED);

            this.add(succeedLabel);
            succeedLabel.setVisible(false);
            succeedLabel.setBounds( 30, 530, 200, 20 );
            succeedLabel.setForeground(Color.green);


            cylindricalRadioButton.addActionListener(this);
            cuboidRadioButton.addActionListener(this);
            pentagonalRadioButton.addActionListener(this);



            ButtonGroup buttonGroup = new ButtonGroup();
            buttonGroup.add(cylindricalRadioButton);
            buttonGroup.add(cuboidRadioButton);
            buttonGroup.add(pentagonalRadioButton);



            choicePanel.add(label);
            choicePanel.add(cylindricalRadioButton);
            choicePanel.add(cuboidRadioButton);
            choicePanel.add(pentagonalRadioButton);


            nameCylindrical.setBounds(10, 10, 200, 20);
            itemNameCylindrical.setBounds(210, 10, 100, 20);

            heightCylindrical.setBounds(10, 32, 200, 20);
            itemHeightCylindrical.setBounds(210, 32, 100, 20);

            radiusCylindrical.setBounds(10, 54, 200, 20);
            itemRadiusCylindrical.setBounds(210, 54, 100, 20);

            weightCylindrical.setBounds(10, 76, 200, 20);
            itemWeightCylindrical.setBounds(210, 76, 100, 20);

            cylindricalPanel.add(nameCylindrical);
            cylindricalPanel.add(itemNameCylindrical);
            cylindricalPanel.add(heightCylindrical);
            cylindricalPanel.add(itemHeightCylindrical);
            cylindricalPanel.add(radiusCylindrical);
            cylindricalPanel.add(itemRadiusCylindrical);
            cylindricalPanel.add(weightCylindrical);
            cylindricalPanel.add(itemWeightCylindrical);


            ///////////////////////////////////////////////////////


            nameCuboid.setBounds(10, 10, 200, 20);
            itemNameCuboid.setBounds(210, 10, 100, 20);

            heightCuboid.setBounds(10, 32, 200, 20);
            itemHeightCuboid.setBounds(210, 32, 100, 20);

            lengthCuboid.setBounds(10, 54, 200, 20);
            itemLengthCuboid.setBounds(210, 54, 100, 20);

            widthCuboid.setBounds(10, 76, 200, 20);
            itemWidthCuboid.setBounds(210, 76, 100, 20);

            weightCuboid.setBounds(10, 100, 200, 20);
            itemWeightCuboid.setBounds(210, 100, 100, 20);

            cuboidPanel.add(nameCuboid);
            cuboidPanel.add(itemNameCuboid);
            cuboidPanel.add(heightCuboid);
            cuboidPanel.add(itemHeightCuboid);
            cuboidPanel.add(weightCuboid);
            cuboidPanel.add(itemWeightCuboid);
            cuboidPanel.add(lengthCuboid);
            cuboidPanel.add(itemLengthCuboid);
            cuboidPanel.add(widthCuboid);
            cuboidPanel.add(itemWidthCuboid);


            ///////////////////////////////////////////////////////


            namePentagonal.setBounds(10, 10, 200, 20);
            itemNamePentagonal.setBounds(210, 10, 100, 20);

            heightPentagonal.setBounds(10, 32, 200, 20);
            itemHeightPentagonal.setBounds(210, 32, 100, 20);

            apothemPentagonal.setBounds(10, 54, 200, 20);
            itemApothemPentagonal.setBounds(210, 54, 100, 20);

            basePentagonal.setBounds(10, 76, 200, 20);
            itemBasePentagonal.setBounds(210, 76, 100, 20);

            weightPentagonal.setBounds(10, 100, 200, 20);
            itemWeightPentagonal.setBounds(210, 100, 100, 20);

            pentagonalPanel.add(namePentagonal);
            pentagonalPanel.add(itemNamePentagonal);
            pentagonalPanel.add(heightPentagonal);
            pentagonalPanel.add(itemHeightPentagonal);
            pentagonalPanel.add(apothemPentagonal);
            pentagonalPanel.add(itemApothemPentagonal);
            pentagonalPanel.add(basePentagonal);
            pentagonalPanel.add(itemBasePentagonal);
            pentagonalPanel.add(weightPentagonal);
            pentagonalPanel.add(itemWeightPentagonal);


            nextButton.setBounds(500, 530, 70, 20);
            nextButton.addActionListener(this);
            this.add(nextButton);



            this.setTitle("Best Shipment");
            this.setLayout(null);
            this.setSize(600, 600);
            this.setVisible(true);
            this.setResizable(false);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cylindricalRadioButton ) {

            cylindricalPanel.setVisible(true);
            cuboidPanel.setVisible(false);
            pentagonalPanel.setVisible(false);
            choice = 1;
            errorLabel.setVisible(false);

        } else if (e.getSource() == cuboidRadioButton ) {

            cylindricalPanel.setVisible(false);
            cuboidPanel.setVisible(true);
            pentagonalPanel.setVisible(false);
            choice = 2;
            errorLabel.setVisible(false);

        } else if (e.getSource() == pentagonalRadioButton ) {

            cylindricalPanel.setVisible(false);
            cuboidPanel.setVisible(false);
            pentagonalPanel.setVisible(true);
            choice = 3;
            errorLabel.setVisible(false);

        }

        if ( e.getSource() == nextButton ) {

            if ( choice == 1 ) {

                try {
                    type = "Cylindrical";
                    name = itemNameCylindrical.getText();
                    height = Double.parseDouble(itemHeightCylindrical.getText());
                    radius = Double.parseDouble(itemRadiusCylindrical.getText());
                    weight = Double.parseDouble(itemWeightCylindrical.getText());

                    errorLabel.setVisible(false);
                    succeedLabel.setVisible(true);
                    i ++;

                    items_obj.add( new Items.Item_Extended( type, name, height, 0, 0, weight, radius, 0, 0 ));

                    if ( i > numberOfItems ) {
                        this.dispose();
                        ResultsGUI go = new ResultsGUI( items_obj );
                    } else {
                        label.setText("Choose shape of " + i + " item");
                    }

                    if ( i == numberOfItems ) {
                        nextButton.setText("Finish");
                    }

                }catch (NumberFormatException nfe) {
                    errorLabel.setVisible(true);
                    succeedLabel.setVisible(false);
                }



            } else if ( choice == 2 ) {

                try {
                    type = "Cuboid";
                    name = itemNameCuboid.getText();
                    height = Double.parseDouble(itemHeightCuboid.getText());
                    length = Double.parseDouble(itemLengthCuboid.getText());
                    width = Double.parseDouble(itemWidthCuboid.getText());
                    weight = Double.parseDouble(itemWeightCuboid.getText());

                    items_obj.add( new Items.Item_Extended( type, name, height, length, width, weight, 0, 0, 0 ));


                    errorLabel.setVisible(false);
                    succeedLabel.setVisible(true);
                    i ++;

                    if ( i > numberOfItems ) {
                        this.dispose();
                        ResultsGUI go = new ResultsGUI( items_obj );
                    } else {
                        label.setText("Choose shape of " + i + " item");
                    }

                    if ( i == numberOfItems ) {
                        nextButton.setText("Finish");
                    }

                } catch ( NumberFormatException nfe ) {
                    errorLabel.setVisible(true);
                    succeedLabel.setVisible(false);
                }

            } else if ( choice == 3 ) {

                try {
                    type = "Pentagonal";
                    name = itemNamePentagonal.getText();
                    height = Double.parseDouble(itemHeightPentagonal.getText());
                    apothem = Double.parseDouble(itemApothemPentagonal.getText());
                    base = Double.parseDouble(itemBasePentagonal.getText());
                    weight = Double.parseDouble(itemWeightPentagonal.getText());

                    items_obj.add( new Items.Item_Extended( type, name, height, 0, 0, weight, 0, apothem, base ) );

                    errorLabel.setVisible(false);
                    succeedLabel.setVisible(true);
                    i ++;

                    if ( i > numberOfItems ) {
                        this.dispose();
                        ResultsGUI go = new ResultsGUI( items_obj );
                    } else {
                        label.setText("Choose shape of " + i + " item");
                    }

                    if ( i == numberOfItems ) {
                        nextButton.setText("Finish");
                    }

                } catch ( NumberFormatException nfe ) {
                    errorLabel.setVisible(true);
                    succeedLabel.setVisible(false);
                }
            }

        }
    }
}









