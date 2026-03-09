import java.util.*;

class Customer {

    private String name = null;
    private int score = 300;

    Customer(String name, int score) {

        this.name = name;

        if (score < 300 || score > 850) {
            score = 300;
        }

        this.score = score;
    }

    // mutators
    void setName(String name) {
        this.name = name;
    }
    void setCreditScore(int score) {

        if (score < 300 || score > 850) {
            score = 300;
        }

        this.score = score;
    }

    // accessors
    String getName() {
        return name;
    }
    int getCreditScore() {
        return score;
    }

    String getCreditRating() {

        if (score <= 629) {
            return "Bad";
        } else if (score <= 689) {
            return "Fair";
        } else if (score <= 719) {
            return "Good";
        } else {
            return "Excellent";
        }
    }

}

public class CustomerCreator {

    public static void main(String[] args) {

    //Customer bob = new Customer(name, creditScore)
        Customer customers[] = {
            new Customer("Bob",500),
            new Customer("Alice",700),
            new Customer("John",800),
            new Customer("Jane",600),
            new Customer("Kyle",200)
        };

        for (int i = 0; i < customers.length; i++) {
            System.out.print("NAME: " + customers[i].getName() 
                    + "\nSCORE: " + customers[i].getCreditScore()
                    + "\nRATING: " + customers[i].getCreditRating() + "\n\n");
        }

    }
}
