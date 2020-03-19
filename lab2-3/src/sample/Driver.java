package sample;

public class Driver {
    private Car car;

    public Driver(Car car){
        this.car = car;
    }

    public void manageCar(int index, boolean wantOpen){
        if (index > 4){
            System.out.println("Error door.");
            return;
        }
        if(wantOpen){
            car.carCase.setDoorOpened(index);
        }
        else{
            car.carCase.setDoorClosed(index);
        }

    }

    public void putWheel(int index){
        if (index > 4){
            System.out.println("Error wheel.");
        }
        Wheel current = car.wheels.get(index);
        current.setDeflated();
    }
}
