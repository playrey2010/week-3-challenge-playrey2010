import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Job {
    private String companyName;
    private String jobTitle;
    private String startDate;
    private String endDate;
    private ArrayList<String> tasks;

    // important methods
    public String displayJobInformation () {
        String info = "";
        info += getJobTitle() + "\n";
        info += getCompanyName() + ", " + displayDates() + "\n";
        info += displayTasks();

        return info;
    }

    public void inputJobInformation(Scanner sc) {
        inputJobTitle(sc);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        inputCompanyName(sc);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        inputStartDate(sc);
        inputEndDate(sc);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        inputTasks(sc);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    public void inputJobTitle(Scanner sc) {
        System.out.print("Enter the job title: ");
        setJobTitle(sc.nextLine());
    }

    public void inputCompanyName(Scanner sc) {
        System.out.print("Enter the company name: ");
        setCompanyName(sc.nextLine());
    }

    public String displayDates () {
        return getStartDate() + " - " + getEndDate();
    }

    public void inputEndDate(Scanner sc) {
        String[] months = new DateFormatSymbols(Locale.getDefault()).getMonths();
        int year = 1970, month = 0;

        System.out.print("Enter the end date for your job as a " + getJobTitle() + " --> year: ");
        year = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the month in numbers (1-12): ");
        month = sc.nextInt();
        sc.nextLine();
        setEndDate(months[month-1] + " " + year);
    }

    public void inputStartDate(Scanner sc) {
        String[] months = new DateFormatSymbols(Locale.getDefault()).getMonths();
        int year = 1970, month = 0;

        System.out.print("Enter the starting date for your job as a " + getJobTitle() + " --> year: ");
        year = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the month in numbers (1-12): ");
        month = sc.nextInt();
        sc.nextLine();
        setStartDate(months[month-1] + " " + year);
    }

    public void inputTasks (Scanner sc) {
        ArrayList<String> tempTasks = new ArrayList<>();
        String tempTask = "";
        String again = "n";
        System.out.print("Enter your main task as " + getJobTitle() + ": ");
        tempTask = sc.nextLine();
        tempTasks.add(tempTask);

        do {
            System.out.print("Would you like to add another task/duty? (\"Y\" or \"N\"): ");
            again = sc.nextLine();
            if (again.equalsIgnoreCase("y")) {
                System.out.print("Please enter your task: ");
                tempTask = sc.nextLine();
                tempTasks.add(tempTask);
            } else {
                break;
            }
        }while (again.equalsIgnoreCase("y"));

        setTasks(tempTasks);
    }

    public String displayTasks () {
        String display = "";
        for (String task : getTasks()) {
            display += "- " + task + "\n";
        }
        return display;
    }

    // getter and setters

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public ArrayList<String> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<String> tasks) {
        this.tasks = tasks;
    }



}
