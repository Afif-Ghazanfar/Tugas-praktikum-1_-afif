package cars;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startEngine();
        myCar.throttle();
        myCar.turnOnHeadLamp();
        myCar.brake();
        myCar.turnOffHeadLamp();
        
        System.out.println("\nInfo Mobil:");
        System.out.println("Brand   : " + myCar.brand);
        System.out.println("Warna   : " + myCar.color);
        System.out.println("No Plat : " + myCar.noPlate);
        System.out.println("Dimensi : " + myCar.width + "m x " + myCar.height + "m");

    }
}
