package racingcar;
import camp.nextstep.edu.missionutils.Console;
import java.util.Scanner;

import racingcar.Car;

public class CreateCar {

    String carName;
    int carNum;
    int raceRound;
    Car[] cars;

    public void createCars() {
        System.out.println("경주할 자동차의 이름을 쉼표(,)로 구분하여 입력하시오.");
        carName = camp.nextstep.edu.missionutils.Console.readLine();
        String[] carNames = carName.split(",");
        carNum = carNames.length;
        for (int i = 0; i < carNum; i++) {
            if ((carNames[i].length() <= 0) || (carNames[i].length() > 5)) {
                throw new IllegalArgumentException();
            }
        }

        cars = new Car[carNum];
        for (int i = 0; i < carNum; i++) {
            cars[i] = new Car();
            cars[i].name = carNames[i];
            cars[i].winNum = 0;
        }

        System.out.println("경기 횟수를 입력해주세요.");
        raceRound = Integer.parseInt(camp.nextstep.edu.missionutils.Console.readLine());
    }
}
