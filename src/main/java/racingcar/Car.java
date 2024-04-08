package racingcar;

public class Car {
    private int winNum = 0;
    private String name;

    //Constructer
    Car(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public int getWinNum() {
        return  this.winNum;
    }
    public void increaseWinNum() {
        winNum++;
    }
}
