package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap<Car,CarsHome> map= new HashMap<>();
        map.put(new Car(22,5345),new CarsHome(1998,"Niva",35000,"blue"));
        map.put(new Car(33,55534),new CarsHome(1996,"Audi",35000,"blue"));
        map.put(new Car(44,5244),new CarsHome(1993,"Lexus",35000,"blue"));
        map.put(new Car(55,534),new CarsHome(1998,"Djip",35000,"black"));
        map.put(new Car(11,223),new CarsHome(2022,"Tayotta",35000,"white"));
        for (Map.Entry<Car,CarsHome> a: map.entrySet()) {
            System.out.println(a.getKey() + " " + a.getValue());
        }





       

        



    }
}
