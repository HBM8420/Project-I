
package unitconverter;
import javax.swing.*;
import java.awt.event.*;

public class UnitConverter {
    private JFrame frame;
    private JLabel inputLabel,outputLabel;
    private JTextField input, output;
    private JComboBox<String>fromUnit,toUnit;
    private JButton convertButton;
    protected void initComponents(){
        frame = new JFrame("Unit Converter");
        frame.setSize(400,150);
        frame.setLayout(null);
        inputLabel = new JLabel("input:");
        outputLabel = new JLabel("output:");
        input = new JTextField();
        output = new JTextField();
        convertButton = new JButton("Convert");
        fromUnit = new JComboBox<String>(new String[]{"meters","centimeters","kilometers","inches"});
        toUnit = new JComboBox<String>(new String[]{"meters","centimeters","kilometers","inches"});

        inputLabel.setBounds(20,20,100,20);
        input.setBounds(150,20,100,20);
        fromUnit.setBounds(270,20,100,20);
        outputLabel.setBounds(20,50,100,20);
        output.setBounds(150,50,100,20);
        output.setEditable(false);
        toUnit.setBounds(270,50,100,20);
        convertButton.setBounds(150,80,100,20);

        frame.add(inputLabel);
        frame.add(outputLabel);
        frame.add(input);
        frame.add(output);
        frame.add(inputLabel);
        frame.add(fromUnit);
        frame.add(toUnit);
        frame.add(convertButton);
        convertButton.addActionListener(new ConvertButtonListener());

        frame.setVisible(true);
    }
    public UnitConverter(){
        initComponents();
    }
    public static void main(String args[]){
        new UnitConverter();
    }
    private class ConvertButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String fromUnitType = fromUnit.getSelectedItem().toString();
            String toUnitType = toUnit.getSelectedItem().toString();
            double inputValue = Double.parseDouble(input.getText());
            double outputValue = 0.0;

            if(fromUnitType.equals("meters")){

                if(toUnitType.equals("meters")){
                    outputValue = UnitConverter.metersToMeters(inputValue);
                }
                else if (toUnitType.equals("centimeters")) {
                    outputValue = UnitConverter.metersToCentimeters(inputValue);
                }
                else if(toUnitType.equals("kilometers")){
                    outputValue = UnitConverter.metersToKilometers(inputValue);
                }
                else{
                    outputValue = UnitConverter.metersToInches(inputValue);
                }
            }
            else if(fromUnitType.equals("centimeters")){

                if(toUnitType.equals("meters")){
                    outputValue = UnitConverter.centimetersToMeters(inputValue);
                }
                else if (toUnitType.equals("centimeters")) {
                    outputValue = UnitConverter.centimetersToCentimeters(inputValue);
                }
                else if(toUnitType.equals("kilometers")){
                    outputValue = UnitConverter.centimetersToKilometers(inputValue);
                }
                else{
                    outputValue = UnitConverter.centimetersToInches(inputValue);
                }
            }
            else if(fromUnitType.equals("kilometers")){

                if(toUnitType.equals("meters")){
                    outputValue = UnitConverter.kilometersToMeters(inputValue);
                }
                else if (toUnitType.equals("centimeters")) {
                    outputValue = UnitConverter.kilometersToCentimeters(inputValue);
                }
                else if(toUnitType.equals("kilometers")){
                    outputValue = UnitConverter.kilometersToKilometers(inputValue);
                }
                else {
                    outputValue = UnitConverter.kilometersToInches(inputValue);
                }
            }
            else{
                    if(toUnitType.equals("meters")){
                        outputValue = UnitConverter.inchesToMeters(inputValue);
                    }
                    else if (toUnitType.equals("centimeters")) {
                        outputValue = UnitConverter.inchesToCentimeters(inputValue);
                    }
                    else if(toUnitType.equals("kilometers")){
                        outputValue = UnitConverter.inchesToKilometers(inputValue);
                    }
                    else{
                        outputValue = UnitConverter.inchesToInches(inputValue);
                    }
            }
            output.setText(""+outputValue);
        }

    }
    public static double metersToMeters(double value){

        double output = value;
        return output;
    }
    public static double metersToCentimeters(double value){

        double output = value * 100;
        return output;
    }
    public static double metersToKilometers(double value){

        double output = value / 1000;
        return output;
    }
    public static double metersToInches(double value){

        double output = value * 39.37;
        return output;
    }
    public static double centimetersToMeters(double value){

        double output = value/100;
        return output;
    }
    public static double centimetersToCentimeters(double value){

        double output = value;
        return output;
    }
    public static double centimetersToKilometers(double value){

        double output = value/100/1000;
        return output;
    }
    public static double centimetersToInches(double value){

        double output = (value/100)*39.37;
        return output;
    }
    public static double kilometersToKilometers(double value){

        double output = value;
        return output;
    }
    public static double kilometersToMeters(double value){

        double output = value * 1000;
        return output;
    }
    public static double kilometersToCentimeters(double value){

        double output = value * 1000 * 100;
        return output;
    }
    public static double kilometersToInches(double value){

        double output = value * 1000 * 39.37;
        return output;
    }
    public static double inchesToKilometers(double value){

        double output = (value/39.37)/1000;
        return output;
    }
    public static double inchesToMeters(double value){

        double output = value/39.37;
        return output;
    }
    public static double inchesToCentimeters(double value){

        double output = (value/39.37)*100;
        return output;
    }
    public static double inchesToInches(double value){

        double output = value;
        return output;
    }

}
