public class PlayerCard {

    public static void main(String[] args) {
        System.out.println("Welcome to CreatePlayerCard");
        Footballer footballer = new Footballer();
        footballer.fillInformation();
        footballer.displayInformation();
        int ratingTemp= (footballer.pace+footballer.physical+footballer.passing+footballer.defending+footballer.shooting+
                footballer.dribbling)/6;
        int sum=0;
        int rating=0;
        if(footballer.pace>=ratingTemp){
            sum+=footballer.pace;
            rating++;
        }
        if(footballer.passing>=ratingTemp){
            sum+=footballer.passing;
            rating++;
        }
        if(footballer.dribbling>=ratingTemp){
            sum+=footballer.dribbling;
            rating++;
        }
        if(footballer.shooting>=ratingTemp){
            sum+=footballer.shooting;
            rating++;
        }
        if(footballer.physical>=ratingTemp){
            sum+=footballer.physical;
            rating++;
        }
        if(footballer.defending>=ratingTemp){
            sum+=footballer.defending;
            rating++;
        }
        System.out.println("Your rating is : "+sum/rating);
    }
}
