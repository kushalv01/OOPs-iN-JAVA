public class Car {


        String make = "Ford";
        String model= "Mustang";
        int year = 2025;
        double price= 58000.99;
        boolean isRunning = false;

        void start(){
            System.out.println("you start the engine");
            isRunning=true;

        }
        void stop(){
            System.out.println("you stop the engine");
            isRunning=false;
        }

        void drive(){
        System.out.printf("You drive the %s\n",model);
    }

        void brake(){
            System.out.printf("you brake the %s",model);
        }

}
