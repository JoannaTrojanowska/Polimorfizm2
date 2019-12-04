package com.company;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle refVehicleObiektcar = new Car();
        Vehicle refVehicleObiektsportCar = new SportCar();

        //1.sposob
        SportCar sc = ((SportCar) refVehicleObiektsportCar);
        sc.go();

        //2.sposob
        ((SportCar)refVehicleObiektsportCar).go();

        Car c = ((Car) refVehicleObiektcar);
        c.horn();

        Vehicle[] vehicles = {vehicle, refVehicleObiektcar, refVehicleObiektsportCar};

        //for (Vehicle v:vehicles) {
           // if(v instanceof SportCar){
              //  SportCar sportCar = (SportCar) v;
             //   sportCar.go();
               // sportCar.horn();
               // sportCar.turbo();
           // }
       // }

        for (Vehicle ve : vehicles) {
            ve.go();

            if (ve instanceof SportCar) {
            ((SportCar) refVehicleObiektsportCar).turbo();
            sc.turbo();
            sc.horn();
        }else if(ve instanceof Car){
                ((Car) refVehicleObiektcar).horn();
                c.go();
            }
        }
    }
}
