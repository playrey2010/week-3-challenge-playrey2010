import java.util.Scanner;

public class RoboApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Testing area
        Resume r = new Resume();
        r.inputResumeInformation(sc);
        System.out.println(r.displayResumeInfo());

    }
}
