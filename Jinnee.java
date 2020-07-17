import java.util.Random;

public class Jinnee {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 10000;
        int jinnee = random.nextInt(count);
        System.out.println(jinnee);
        int[] rooms = new int[count];
        rooms[jinnee] = 1;
        for (int i = 1; i < count; i++) {
            if (rooms[i] == 1) {
                System.out.println("found");
                break;
            } else for (int j = i; j >= 2; j--) {
                rooms[jinnee] = 0;
                jinnee = changePosition(random, jinnee);
                rooms[jinnee] = 1;
                if (rooms[i] == 1) {
                    System.out.println(jinnee);
                    System.out.println("found");
                    jinnee = count + 80;
                }
            }
        }
    }

    public static int changePosition(Random r, int jinnee) {
        int step = r.nextInt(2);
        if (step == 0) {
            if (jinnee == 9999)
                jinnee -= 1;
            else
                jinnee += 1;

        } else {
            if (jinnee == 0)
                jinnee += 1;
            else
                jinnee -= 1;
        }
        return jinnee;
    }

}
