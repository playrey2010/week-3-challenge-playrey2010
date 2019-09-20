import java.util.Scanner;

public class RoboApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Testing area
        Job job = new Job();
        job.inputJobInformation(sc);
        System.out.println(job.displayJobInformation());

    }
}
