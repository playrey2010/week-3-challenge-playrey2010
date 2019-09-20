import java.util.ArrayList;
import java.util.Scanner;

public class Resume {
    private String name;
    private String emailAddress;
    private ArrayList<Education> educationalAchievement;
    private ArrayList<Job> workExperience;
    private ArrayList<Skill> skills;

    // methods CREATE DISPLAY METHOD
    public void inputEdAchievements (Scanner sc) {
        Education education;
        ArrayList<Education> tempEdu = new ArrayList<>();
        String choice = "n";

        do {
            education = new Education();
            education.inputEducationInfo(sc);
            tempEdu.add(education);
            System.out.print("\nWould you like to add another educational achievement? (\"Y\" or \"N\"): ");
            choice = sc.nextLine();
        } while (choice.equalsIgnoreCase("y"));
        setEducationalAchievement(tempEdu);
    }

    public String displayWorkExp () {
        String display = "";
        for (Job job : getWorkExperience()) {
            display += job.displayJobInformation() + "\n";
        }
        return display;
    }

    public void inputWorkExp (Scanner sc) {
        Job job;
        ArrayList<Job> tempWE = new ArrayList<>();
        String choice = "n";

        do {
            job = new Job();
            job.inputJobInformation(sc);
            tempWE.add(job);
            System.out.print("\nWould you like to add another work experience? (\"Y\" or \"N\"): ");
            choice = sc.nextLine();

        } while (choice.equalsIgnoreCase("y"));
        setWorkExperience(tempWE);
    }

    public String displaySkills() {
        String display = "";
        for (Skill skill : getSkills()) {
            display += skill.displaySkill() + "\n";
        }
        return display;
    }

    public void inputSkills (Scanner sc) {
        Skill skill;
        ArrayList<Skill> tempSkills = new ArrayList<>();
        String choice = "n";
        for (int i=0; i<3; i++) {
            skill = new Skill();
            System.out.println("Skill #" + (i+1));
            skill.inputSkill(sc);
            tempSkills.add(skill);
        }
        do {
            System.out.print("\nDo you want to enter an additional skill? (\"Y\" or \"N\"): ");
            choice = sc.nextLine();
            if (choice.equalsIgnoreCase("y")) {
                skill = new Skill();
                skill.inputSkill(sc);
                tempSkills.add(skill);
            } else {
                break;
            }
        }while (choice.equalsIgnoreCase("y"));

        setSkills(tempSkills);
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public ArrayList<Education> getEducationalAchievement() {
        return educationalAchievement;
    }

    public void setEducationalAchievement(ArrayList<Education> educationalAchievement) {
        this.educationalAchievement = educationalAchievement;
    }

    public ArrayList<Job> getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(ArrayList<Job> workExperience) {
        this.workExperience = workExperience;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }
}
