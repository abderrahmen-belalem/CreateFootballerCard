public class Man {
    String firstName;
    String lastName;
    String birthdayDate;
    int height;
    int weight;

    Man(String firstName, String lastName, String birthdayDate, int height, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdayDate = birthdayDate;
        this.height = height;
        this.weight = weight;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(String birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
