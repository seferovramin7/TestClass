package StaticKeyword;

import org.apache.commons.lang3.time.StopWatch;

import java.lang.reflect.Array;

public class Test {
    public static void main(String[] args) {
        try {
            StopWatch stopwatch = new StopWatch();
            stopwatch.start();

//        StringBuilder str = new StringBuilder("Hello");
//        for (int i = 0; i < 999999999; i++) {
//              str.append("1");
//        }
            StringBuffer bfr = new StringBuffer("Hello");
            for (int i = 0; i < 999999; i++) {
                bfr.append("0");
            }
            int[] intArray = new int[3];
            int i = intArray[5];
            System.out.println(i);
            stopwatch.stop();

            long time = stopwatch.getTime();

            System.out.println(time);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
