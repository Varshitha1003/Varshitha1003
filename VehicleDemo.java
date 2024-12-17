class Vehicle{
    int speed;
    int capacity;
    int wheels;
    String name;
    void vehicleinfo()
    {
        System.out.println(speed + "," +capacity+ "," +wheels+ "," +name);

    }


}
public class VehicleDemo{
public static void main(String args[])
{
    Vehicle vehicle1=new Vehicle();
    vehicle1.speed=250;
    vehicle1.capacity=4;
    vehicle1.wheels=4;
    vehicle1.name="mercedes";
    vehicle1.vehicleinfo();
}
}