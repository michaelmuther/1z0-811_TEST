import java.util.Random;

public class Random1 {

    public static void main(String[] args) {
        int seed = 15;

//        Random random = new Random(seed); // a
//        int ranint = random.nextInt();

//        Random random = new Random(seed); // b
//        int ranint = random.setSeed(seed);

//        Random random = new Random();
//        int ranint = random.nextInt(seed);

        Random random = new Random();
        int ranint = random.nextInt(seed * 20);

        System.out.println(ranint);
    }

}
