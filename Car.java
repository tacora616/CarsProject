import java.lang.invoke.StringConcatException;

public class Car {
    String make, model,fuel,condition,color;
    int Year , milage;
    Car()
    {

    }
    Car(String car_make,String car_model,int car_year, int car_milage, String car_fuel,String car_condition, String car_Color)// add the other attributes
    {
      make=car_make;
      model=car_model;
      Year= car_year;
      fuel=car_fuel;
      condition=car_condition;
      color=car_Color;
      milage=car_milage;
// condition is either used or new

    }

}
