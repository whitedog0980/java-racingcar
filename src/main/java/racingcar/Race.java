package racingcar;
import camp.nextstep.edu.missionutils.Randoms;
import racingcar.CreateCar;

import java.util.Random;

public class Race {
    Random Rand = new Random();
    CreateCar cr = new CreateCar();
    int raceRound;


    public void initRace() {
        cr.createCars();
        System.out.println("경기 횟수를 입력해주세요.");
        raceRound = Integer.parseInt(camp.nextstep.edu.missionutils.Console.readLine());
    }

    public boolean move() {
        //nt num = Randoms.pickNumberInRange(0,9);
        int num = Rand.nextInt(10);
        return (num > 4);
    }

    public void doRace() {
        for (int i = 0; i < cr.carNum; i++) {
            if (move()) {
                cr.cars[i].increaseWinNum();
            }
        }
        for (int i = 0; i < cr.carNum; i++) {
            System.out.print(String.format("%s : ", cr.cars[i].getName()));
            System.out.println("-".repeat(cr.cars[i].getWinNum()));
        }
    }


    public void printWinner() {
        int max = 0;
        boolean isFirst = true;
        //get max winNums
        for (int i = 0; i < cr.carNum; i++) {
            if (max < cr.cars[i].getWinNum()) {
                max = cr.cars[i].getWinNum();
            }
        }
        //print Winner
        System.out.print("최종 우승자 : ");
        for (int i = 0; i < cr.carNum; i++) {
            // add ',' if isn't first winner
            if (!isFirst && (max == cr.cars[i].getWinNum())) {
                System.out.print(",");
            }
            if (max == cr.cars[i].getWinNum()) {
                System.out.print(String.format("%s", cr.cars[i].getName()));
                isFirst = false;
            }
        }
    }
}
