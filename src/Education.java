import java.util.Scanner;

public class Education {
    private String degreeType;
    private String major;
    private String universityName;
    private int gradYear;

    // methods
    public String displayEduInfo() {
        String info = "";
        info += getDegreeType() + " in " + getMajor() + ",\n";
        info += getUniversityName() + ", " +getGradYear();

        return info;
    }

    public void inputEducationInfo(Scanner sc) {
        inputDegreeType(sc);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        inputMajor(sc);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        inputUniName(sc);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        inputGradYear(sc);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    public void inputDegreeType (Scanner sc) {
        String[] degrees = new String[6];
        degrees[0] = "AA";
        degrees[1] = "BA";
        degrees[2] = "MA";
        degrees[3] = "MBA";
        degrees[4] = "PhD";
        degrees[5] = "N/A";

        System.out.print("Please enter the degree type by using our guide below.\n");
        System.out.print("____________________________________________________________\n");
        System.out.print("GUIDE: Type \"1\" for " + degrees[0] +
                        ", \"2\" for " + degrees[1] +
                        ", \"3\" for " + degrees[2] +
                        ", \"4\" for " + degrees[3] +
                        ", \"5\" for " + degrees[4] + ".");
        System.out.print("\n____________________________________________________________");
        System.out.print("\nIf your degree type is not listed above, please enter \"6\": ");
        int tempDegree = sc.nextInt();
        sc.nextLine();
        if (tempDegree == 6) {
            System.out.print("Enter your degree type: ");
            degrees[5] = sc.nextLine();
        }
        setDegreeType(degrees[tempDegree-1]);

    }

    public void inputMajor (Scanner sc) {
        System.out.print("Enter your major: ");
        setMajor(sc.nextLine());
    }

    public void inputUniName(Scanner sc) {
        System.out.print("Enter the name of your university: ");
        setUniversityName(sc.nextLine());
    }

    public void inputGradYear(Scanner sc) {
        System.out.print("Enter the graduation year: ");
        setGradYear(sc.nextInt());
        sc.nextLine();
    }
    // getters and setters
    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }
}
