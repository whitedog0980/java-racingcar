package racingcar;

public class MiniCar extends Car{
    MiniCar(String name) {super(name);}

    @Override
    public int getRandomFactor() {return 2;}
}
