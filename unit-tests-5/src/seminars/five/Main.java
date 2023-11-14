package seminars.five;

import seminars.five.number.MaxNumberModule;
import seminars.five.number.RandomNumberModule;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        RandomNumberModule randList = new RandomNumberModule();
        MaxNumberModule maxNumberModule = new MaxNumberModule();
        List<Integer> result = randList.generate(6);

        int maxNumber = maxNumberModule.getMaxNumber(result);
        System.out.println("result = " + result);
        System.out.println(maxNumber);
    }
}
