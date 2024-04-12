import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car_Dealership extends JFrame{
    private JPanel Main_Panel;
    private JLabel Welcome;
    private JComboBox Make_combobox;
    private JLabel Fuel_type;
    private JRadioButton gas_button;
    private JRadioButton Hybrid_Button;
    private JRadioButton Electric_Button;
    private JButton Submit_Button;
    private JLabel Condition_Label;
    private JRadioButton newcondition_Button1;
    private JRadioButton UsedCondition_Button;
    private JLabel Year;
    private JComboBox Car_color_combo_box;
    private JLabel Milage_Label;
    private JTextField Milage;
    List<Car>availble_cars;

    public Car_Dealership(){
        setSize(700,700);
        setVisible(true);
        setContentPane(Main_Panel);
        availble_cars=new ArrayList<>();
        Car car1=new Car("Toyota","Rav 4",2004,19000,"Gas","Used","Blue");
        Car car2=new Car("Porsche","Cayenne",2024,0,"Electric","New","Red");
        Car car3= new Car("Mercedes","C class",2023,20000,"electric","Used","Silver");
        Car car4=new Car("Lexus","RZ",2014,0,"Electric","New","White");
        Car car5=new Car("Cadillac","XT6 Sport",2024,0,"Electric","New","Black");
        Car car6=new Car("Dodge","Charger",1997,50000,"Gas","Used","Yellow");
        Car car7=new Car("Ferrari","F40",2022,4000,"electric","New","Green");
        Car car8= new Car("BMW","2 Series Gran Coup",2024,0,"Gas","New","Blue");
        Car car9= new Car("Ford","Tacoma",2012,30000,"Hybrid","Used","Green");
        Car car10=new Car("Kia","Sorento",2019,15674,"Hybrid","Used","Silver");
        Submit_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String user_match = String.valueOf(String.valueOf(Arrays.toString(Arrays.stream(Submit_Button.getSelectedObjects()).toArray())));
                    String user_selected_make = Make_combobox.getSelectedItem().toString();
                    String user_selected_fuel = "";
                    if (Electric_Button.isSelected()) user_selected_fuel = "Electric";
                    else if (Hybrid_Button.isSelected()) user_selected_fuel = "Hybrid";
                    else if (gas_button.isSelected()) user_selected_fuel = "Gas";
                    int number_of_matches = 0;
                    for (Car eachcar : availble_cars) {
                        if (eachcar.make.equalsIgnoreCase(user_selected_make)) {
                            number_of_matches++;
                        }
                        if (eachcar.fuel.equalsIgnoreCase(user_selected_fuel)) {
                            number_of_matches++;
                        }
                        if (number_of_matches >= 4) {
                            JOptionPane.showMessageDialog(null, "The car that matches with you is" + eachcar.toString());
                        }
                        String user_selected_Color=Car_color_combo_box.getSelectedItem().toString();
                        String user_selected_Color="";

                    }
                    catch()
                    {
                        JOptionPane.showMessageDialog(null,"Please enter a numeric Value");
                    }
                }
                }
            }
        });


            }
}
