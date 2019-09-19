import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class RoboApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Skill skill = new Skill();
        skill.inputSkill(sc);
        System.out.println(skill.displaySkill());

        ResumeDate rd = new ResumeDate(2000, 1);
        System.out.println(rd.getMonthAndYear());


    }
}
