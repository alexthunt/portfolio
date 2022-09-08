package lab5;

import java.util.ArrayList;

public class Lab5 {

    public static void main(String[] args) {
        ArrayList<Driveable> cars = new ArrayList<>();

        cars.add(new Lamborgini());
        cars.add(new ChevyCruise());
        
        for (Driveable car : cars) {
            Drive(car);
        }

    }

    public static void Drive(Driveable car) {
        while (car.getLitersInTank() > 0) {
            int randomKilometersToDrive = (int) (Math.random() * 50 + 1);
            if (car.drive(randomKilometersToDrive)) {
                System.out.println("Drove " + randomKilometersToDrive + " kilometers in the " + car.toString());
            }
        }
    }
}
