package org.training.design.patterns.training.oo.behavioral.chainofresponsibility;

import java.util.Arrays;
import java.util.List;

public class ChainRun {

    public static void main(String[] args) {
        int value = 50;
        if (value < 10) {
            System.out.println("10 dan küçük");
        } else if (value >= 10 && value < 50) {
            System.out.println("10 ile 50 arasında");
        } else if (value > 50) {
            System.out.println("50 den büyük");
        } else {
            System.out.println("Elli");
        }

//        List<ICheckNumber> checkNumbers = Arrays.asList(new CheckLessThan10(),
//                                                        new CheckBetween10And50(),
//                                                        new CheckBiggerThan50(),
//                                                        new Check50());
//        for (ICheckNumber cn : checkNumbers) {
//            String check = cn.check(value);
//            if (check != null){
//                System.out.println(check);
//                break;
//            }
//        }

        ICheckNumber checkNumber =
                new CheckLessThan10(
                        new CheckBetween10And50(
                                new CheckBiggerThan50(
                                        new Check50(null))));
        String check = checkNumber.check(value);
        System.out.println("sonuç : " + check);

        ICheckNumber checkNumber2 =
                new CheckNumberGen(
                        new CheckNumberGen(
                                new CheckNumberGen(
                                        new CheckNumberGen(
                                                new CheckNumberGen(null,
                                                                   500,
                                                                   1_000),
                                                150,
                                                500),
                                        100,
                                        150),
                                50,
                                100),
                        10,
                        50);

        System.out.println(checkNumber2.check(501));
    }

}
