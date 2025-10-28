public class Main {
    public static void main(String[] args){

        Car car= new Car();
        Car car2=new Car();

        System.out.println(car.make+ " "+ car.model);
        System.out.println(car2.make+ " "+ car2.model);

        System.out.println(car.make);

        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);

        System.out.println("\n");

        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);

        car.drive();
        car.brake();



    }
}
