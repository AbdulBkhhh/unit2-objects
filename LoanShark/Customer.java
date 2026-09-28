public class Customer {
     // TODO: declare each instance variable name, story, amount, score, rate, years
     private String name;
     private String story;
     private double amount;
     private int score;
     private double rate;
     private int years;


     public Customer(String name, String story, double amount, int score, double rate, int years) {
        this.name = name;
        this.story = story;
        this.amount = amount;
        this.score = score;
        this.rate = rate;
        this.years = years;
    }
    
    public static Customer generateRandom() {
     String[] names = {"Diego", "Maria", "John", "Sarah", "Mike", "Devon", "Dustin", "Charlotte"};
     String[] stories = {
    "We're going to finally put in that pool and make our backyard something dreamy. We need to borrow $1800.",
    "I need money for a new washer and dryer.",
    "My car broke down and I need repairs.",
    "I want to start a small business.",
    "I need to pay for medical bills.",
    "We're making a smart toothbrush. You'll be able to track plaque buildup from your phone! We're going to need $1600 though.",
    "Yo, Can I get $800 to open my new gym, Squats R Us?",
    "Hey, my paycheck doesn't clear 'til Friday, but I've got to pay rent tomorrow. Can I borrow $345 to tide me over?"
};
        
        // TODO: pick a random name from names
        String name = names[(int) (Math.random() * names.length)];
        
        // TODO: pick a random story from stories
        String story = stories[(int) (Math.random() * stories.length)];
        // TODO: pick a random loanAmount between 345 and 2500
        double amount = (int) (Math.random() * (2500-345 + 1) + 345);
        // TODO: pick a random creditScore between 300 and 1150
        int score = (int) (Math.random() * (1150 - 300 + 1) + 300);
        // TODO: pick a random rate between 5 and 15
        double rate = (int) (Math.random() * (15-5+1) + 5);
        // TODO: pick a random years between 1 and 5
        int years = (int) (Math.random() * (5-1+1)+1);
        
        return new Customer(name, story, amount, score, rate, years);
    }
    
    public boolean determineDefault() { 
       // TODO: declare a double variable called chance
       // TODO: use if/else to set chance based on creditScore
       //       creditScore >= 700 → chance = 0.10
       //       creditScore >= 500 → chance = 0.30
       //       otherwise          → chance = 0.80
        // TODO: return Math.random() < chance
        return false;     
    }
    
    // TODO: write 6 getters
}


