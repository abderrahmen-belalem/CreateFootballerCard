import java.util.Scanner;

class Footballer extends Man {
    String position;
    int pace;
    int dribbling;
    int shooting;
    int defending;
    int passing;
    int physical;


    Footballer() {
        super("", "", "", 0, 0);
    }

    Footballer(String firstName, String lastName, String birthdayDate, int height, int weight) {
        super(firstName, lastName, birthdayDate, height, weight);
        this.pace = pace;
        this.dribbling = dribbling;
        this.shooting = shooting;
        this.defending = defending;
        this.passing = passing;
        this.physical = physical;
        this.position = position;
    }

    public int getPace() {
        return pace;
    }

    public void setPace(int pace) {
        this.pace = pace;
    }

    public int getDribbling() {
        return dribbling;
    }

    public void setDribbling(int dribbling) {
        this.dribbling = dribbling;
    }

    public int getShooting() {
        return shooting;
    }

    public void setShooting(int shooting) {
        this.shooting = shooting;
    }

    public int getDefending() {
        return defending;
    }

    public void setDefending(int defending) {
        this.defending = defending;
    }

    public int getPassing() {
        return passing;
    }

    public void setPassing(int passing) {
        this.passing = passing;
    }

    public int getPhysical() {
        return physical;
    }

    public void setPhysical(int physical) {
        this.physical = physical;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    void fillInformation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Name : ");
        this.firstName = scanner.nextLine();
        System.out.println("Enter the Last Name : ");
        this.lastName = scanner.nextLine();
        System.out.println("Enter the Birthday Date : ");
        this.birthdayDate = scanner.nextLine();
        System.out.println("Enter the weight : ");
        this.weight = scanner.nextInt();
        System.out.println("Enter the Height : ");
        this.height = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the Position : ");
        this.position = scanner.nextLine();
        System.out.println("Enter the Pace : ");
        this.pace = scanner.nextInt();
        System.out.println("Enter the Dribbling :");
        this.dribbling = scanner.nextInt();
        System.out.println("Enter the Shooting");
        this.shooting = scanner.nextInt();
        System.out.println("Enter the Defending : ");
        this.defending = scanner.nextInt();
        System.out.println("Enter the Passing : ");
        this.passing = scanner.nextInt();
        System.out.println("Enter the physical : ");
        this.physical = scanner.nextInt();
    }
    void displayInformation(){
        System.out.println("First name : " + getFirstName());
        System.out.println("Last name : " + getLastName());
        System.out.println("Birthday Date : " + getBirthdayDate());
        System.out.println("Height : " + getHeight());
        System.out.println("Weight : " + getWeight());
        System.out.println("Position : " + getPosition());
        System.out.println("Pace : " + getPace());
        System.out.println("Dribbling : " + getDribbling());
        System.out.println("Shooting : " + getShooting());
        System.out.println("Defending : " + getDefending());
        System.out.println("Passing : " + getPassing());
        System.out.println("Physical : " + getPhysical());
    }
}
