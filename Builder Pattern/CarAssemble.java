public class CarAssemble{

    public static void main(String[] args){

        Car myCar = new Car.CarBuilder()
            .transmission("Manual")
            .brand("Toyota")
            .passengerCapacity(4)
            .engineType("Diesel")
            .color("Orange")
            .build();

            System.out.println(myCar.brand);
            System.out.println(myCar.engineType);
            System.out.println(myCar.transmission);
            System.out.println(myCar.color);
            System.out.println(myCar.passengerCapacity);

    }
}