import java.util.Scanner;

public class Skill {
    private String name;
    private String rating;
    private String[] proficiencies;

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    // Methods

    public void inputSkill(Scanner sc) {
        System.out.print("Please enter the skill name: ");
        setName(sc.nextLine());
        askForRating(sc);
    }

    public void askForRating (Scanner sc) {
        proficiencies = new String[5];
        proficiencies[0] = "Fundamental";
        proficiencies[1] = "Novice";
        proficiencies[2] = "Intermediate";
        proficiencies[3] = "Advanced";
        proficiencies[4] = "Expert";

        System.out.print("\nPlease enter the rating (integer) for that specific skill: ");
        System.out.print("\n\n\tGUIDE: Type \"1\" for " + proficiencies[0] +
                ", \"2\" for " + proficiencies[1] + ", \"3\" for " + proficiencies[2] + ", \"4\" for "
                + proficiencies[3] + ", and \"5\" for " + proficiencies[4] + ": ");
        int tempChoice = sc.nextInt();
        sc.nextLine();
        setRating(proficiencies[tempChoice-1]);
    }

    public String displaySkill() {
        return getName() + ", " + getRating();
    }

}
