public class Customer implements Comparable<Customer> {
    private String firstName, lastName;
    private int rating;
    private double balance;
    private RatingType ratingType;

    public Customer(String firstName, String lastName, int rating, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rating = rating;
        this.balance = balance;
        // Set ratingType here:
        if (this.rating >= 0 && this.rating <= 3) {
            this.ratingType = RatingType.LOW;
        } else if (this.rating >= 4 && this.rating <= 7) {
            this.ratingType = RatingType.MEDIUM;
        } else if (this.rating >= 8 && this.rating <= 10) {
            this.ratingType = RatingType.HIGH;
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getRating() {
        return rating;
    }

    public double getBalance() {
        return balance;
    }

    // Your getter goes here:
    public RatingType getRatingType() {
        return ratingType;
    }

    @Override
    public String toString() {
        return "firstName= " + firstName + " "
                + "lastName= " + lastName + " "
                + "rating= " + rating + " "
                + "balance =" + balance + " "
                + "ratingType = " + ratingType;
        // Add ratingType here:
    }

    @Override
    public int compareTo(Customer customer) {
        // Add comparison here
        if (this.rating > customer.rating) {
            return 1;
        } else if (this.rating < customer.rating) {
            return -1;
        } else {
            return 0;
        }
    }
}
