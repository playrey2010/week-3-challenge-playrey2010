import java.text.DateFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class RoboApp {
    public static void main(String[] args) {
        // Test  area
        String[] months = new DateFormatSymbols(Locale.getDefault()).getMonths();
        System.out.println(months[6]);
        Scanner sc = new Scanner(System.in);
        // Testing the skill class
        Skill skill = new Skill();
        skill.inputSkill(sc);
        System.out.println(skill.displaySkill());
        // testing RD, to be deleted
        ResumeDate rd = new ResumeDate(2000, 1);
        System.out.println(rd.getMonthAndYear());


    }
}
