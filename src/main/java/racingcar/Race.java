package racingcar;
import camp.nextstep.edu.missionutils.Randoms;
import racingcar.CreateCar;

import java.util.Random;

public class Race {
    Random Rand = new Random();
    CreateCar cr = new CreateCar();

    int[] winNum;

    public void initRace() {
        cr.createCars();
    }

    public boolean move() {
        //nt num = Randoms.pickNumberInRange(0,9);
        int num = Rand.nextInt(10);
        return (num > 4);
    }

    public void doRace() {
        for (int i = 0; i < cr.carNum; i++) {
            if (move()) {
                cr.cars[i].winNum++;
            }
        }
        for (int i = 0; i < cr.carNum; i++) {
            System.out.print(String.format("%s : ", cr.cars[i].name));
            System.out.println("-".repeat(cr.cars[i].winNum));
        }
    }


    public void printWinner() {
        int max = 0;
        boolean isFirst = true;
        for (int i = 0; i < cr.carNum; i++) {
            if (max < cr.cars[i].winNum) {
                max = cr.cars[i].winNum;
            }
        }
        System.out.print("최종 우승자 : ");
        for (int i = 0; i < cr.carNum; i++) {
            if (!isFirst && (max == cr.cars[i].winNum)) {
                System.out.print(",");
            }
            if (max == cr.cars[i].winNum) {
                System.out.print(String.format("%s", cr.cars[i].name));
                isFirst = false;
            }
        }
    }
}
