package SeminarsAPI4892;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int j = new Random().nextInt(10);
            if (j % 2 == 0) {
                System.out.println(j);
                //System.out.print(j + ", ");
            }
        }
    }
}



