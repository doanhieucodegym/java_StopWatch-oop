import java.util.Random;

public class Main_Watch {
    public static void main(String[] args) {
        long start =0;
            Stop_Watch watch =new Stop_Watch();
        watch.start();



        long total = 0;
        for (int i = 0; i < 10000; i++) {
            total += i;
        }

        watch.stop();
        System.out.println("Running time :"+watch.getElapsedTime());
    }
}
