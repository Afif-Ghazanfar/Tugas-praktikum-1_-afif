package cars;

import vehicles.Vehicle;

public class Car implements Vehicle {
  
	String color;
	String noPlate;
	double width;
	double height;
	String brand;
	boolean headLampOn;

    public Car() {
        this.color = "Black";
        this.noPlate = "B 1234 XYZ";
        this.width = 1.8;
        this.height = 1.5;
        this.brand = "Toyota";
        this.headLampOn = false;
    }

    public void startEngine() {
        System.out.println("Mesin mobil dinyalakan..");
    }

    public void throttle() {
        System.out.println("Mobil dipercepat..");
    }

    public void brake() {
        System.out.println("Mobil direm..");
    }

    public void turnOnHeadLamp() {
        if (!headLampOn) {
            headLampOn = true;
            System.out.println("Lampu depan dinyalakan.");
        } else {
            System.out.println("Lampu depan sudah menyala.");
        }
    }

    public void turnOffHeadLamp() {
        if (headLampOn) {
            headLampOn = false;
            System.out.println("Lampu depan dimatikan.");
        } else {
            System.out.println("Lampu depan sudah mati.");
        }
    }

}
