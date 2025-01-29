
/**
 * Write a description of class TDEE here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TDEE {

    public static void main(String[] args) {
        String Resting = null;
        String Sedentary = null;
        String Light = null;
        String Moderate = null;
        String VeryActive = null;
        String ExtremelyActive = null;
        String ActivityFactor;
        String ActivityLevel = null;
        String male = null;
        String female = null;

        Scanner in = new Scanner(System.in);

        //User Input
        System.out.print("Please enter your name:  ");
        String Name = in.nextLine();

        System.out.print("Please enter your BMR: ");
        double BMR = in.nextLine();

        System.out.print("Please enter your gender (M/F): ");
        String Gender = in.nextLine();

        //Determine Activity Factor
        if(ActivityLevel == Resting && Gender == male || Gender == female)
            ActivityFactor = "1.0";
        else if(ActivityLevel == Sedentary && Gender == male || Gender == female)
            ActivityFactor = "1.3";
        else if(ActivityLevel == Light && Gender == male)
            ActivityFactor = "1.6";
        else if(ActivityLevel == Light && Gender == female)
            ActivityFactor = "1.5";
        else if(ActivityLevel == Moderate && Gender == female)
            ActivityFactor = "1.6";
        else if(ActivityLevel == Moderate && Gender == male)
            ActivityFactor = "1.7";
        else if(ActivityLevel == VeryActive && Gender == male)
            ActivityFactor = "2.1";
        else if(ActivityLevel == VeryActive && Gender == female)
            ActivityFactor = "1.9";
        else if(ActivityLevel == ExtremelyActive && Gender == female)
            ActivityFactor = "2.2";
        else if(ActivityLevel == ExtremelyActive && Gender == male)
            ActivityFactor = "2.4";
        else
            ActivityFactor = "false";



        //calculate TDEE
        double TDEE =  ActivityFactor * BMR;

        //Print output
        System.out.println("Select Your Activity Level");
        System.out.println("[A] Resting (Sleeping, Reclining)");
        System.out.println("[B] Sedentary (Restricted Mobility)");
        System.out.println("[C] Light  (Sitting, Standing)");
        System.out.println("[D] Moderate (Light Manual labor, Dancing, Riding Bike");
        System.out.println("[E]Very Active (Team Sports, Hard Manual Labor");
        System.out.println("[F] Extremely Active (Full-time Athlete, Heavy Manual Labor");

        System.out.println("\n");
        System.out.println("Enter the letter corresponding to your activity level: ");
        String info = in.nextLine();

        System.out.println("\n\n");
        System.out.println("Your results: ");
        System.out.println("Name: " + Name + "\t\t\t\t" + Gender);
        System.out.println("BMR: " + BMR + "calories" + "\t\t\t\t" + ActivityFactor);
        System.out.println("TDEE: " + TDEE + "calories");




    }
}


