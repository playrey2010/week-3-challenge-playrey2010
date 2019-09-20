import java.util.Scanner;

public class RoboApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Testing area
        Resume r = new Resume();
        r.inputWorkExp(sc);
        System.out.println(r.displayWorkExp());




    }
}
