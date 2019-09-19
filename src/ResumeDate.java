import java.util.Date;
import java.util.Scanner;

// NEXT STEPS: Take input to set date and create method for displaying as needed.
// next: create guide for choosing month

public class ResumeDate extends Date {

    public ResumeDate(int year, int month, int date) {
        super(year, month, date);
    }

    public ResumeDate(int year, int month) {
        this.setYear(year);
        this.setMonth(month);
    }

    public void inputResumeDate(Scanner sc) {
        System.out.println("");
    }

    public String getMonthAndYear() {
        String[] months = new String[12];
        months[0] = "January";
        months[1] = "February";
        months[2] = "March";
        months[3] = "April";
        months[4] = "May";
        months[5] = "June";
        months[6] = "July";
        months[7] = "August";
        months[8] = "September";
        months[9] = "October";
        months[10] = "November";
        months[11] = "December";

        return months[this.getMonth()] + " " + getYear();

    }

}
