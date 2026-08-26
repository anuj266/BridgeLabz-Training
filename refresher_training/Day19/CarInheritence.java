class Car{
    int speed;
    int numberOfTyres;
    Car(int speed,int numberOfTyres){
        this.speed=speed;
        this.numberOfTyres=numberOfTyres;
    }
    void accelerate(){
        System.out.println("Car is accelerating");
    }

    void speed(){
        System.out.println("Car speed is "+speed);
    }
}
class BMW extends Car{
    BMW(int speed, int numberOfTyres){
        super(speed,numberOfTyres);
    }

    @Override
    void accelerate(){
        System.out.println("BMW is accelerating");
    }

    @Override
    void speed(){
        System.out.println("BMW speed is "+speed);
    }

}
public class CarInheritence{
    public static void main(String[] args) {
        Car car=new BMW(320,4);
        car.speed();
        car.accelerate();
    }
}