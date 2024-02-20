package org.example;

public class Composite {
    public static void main(String[] args){
        Car sportCar = new SportCar();
        Car unknownCar = new Drawing();
        Drawing drawing = new Drawing();
        drawing.add(sportCar);
        drawing.add(unknownCar);
        drawing.draw("Зеленый");
        drawing.clear();
        drawing.add(sportCar);
        drawing.add(unknownCar);
        drawing.draw("Белый ");
        drawing.add(unknownCar);
        drawing.draw("Красный");
    }
}
