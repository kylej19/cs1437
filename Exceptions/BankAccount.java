import java.util.*;

public class BankAccount {
    public static void main(String[] args) {
        CustomerManagement cm = new CustomerManagement();
        cm.addCustomer("Alice", 1001, 5000.0);
        cm.addCustomer("Bob", 1002, 3000.0);
        cm.addCustomer("Charlie", 1003, 7000.0);
        cm.addCustomer("Diana", 1004, 2000.0);
        
        try {
            // Access a customer and perform transactions
            Customer alice = cm.getCustomer(1001);
            System.out.println(alice);
            // Perform some transactions
            alice.deposit(1500.0);
            System.out.println("After deposit: " + alice);
            alice.withdraw(2000.0);
            System.out.println("After withdrawal: " + alice);

            // Attempt to access a non-existent customer
            cm.getCustomer(9999);
            // print all customers
            System.out.println("\nAll customers:");
            cm.displayAllCustomers();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
// Customer class
class Customer {
    private String name;
    private int accountNumber;
    private double balance;

    public Customer(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) throws Exception {
        if (amount <= 0) 
            throw new Exception("Deposit amount must be positive.");
        balance += amount;
    }
    public void withdraw(double amount) throws Exception {
        if (amount <= 0) 
            throw new Exception("Withdrawal amount must be positive.");
        if (amount > balance) 
            throw new Exception("Insufficient funds.");
        balance -= amount;
    }
    public String toString() {
        return "Customer{name='" + name + "', accountNumber=" + accountNumber + ", balance=" + balance + "}";
    }
}
// Customer management class
class CustomerManagement {
    private List<Customer> customers;
    // Constructor
    public CustomerManagement() {
        customers = new ArrayList<>();
    }
    // Mutator methods    
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    public void addCustomer(String name, int accountNumber, double balance) {
        customers.add(new Customer(name, accountNumber, balance));
    }
    // Accessor methods
    public Customer getCustomer(int accountNumber) throws Exception {
        for (Customer customer : customers) {
            if (customer.getAccountNumber() == accountNumber) {
                return customer;
            }
        }
        throw new Exception("Customer with account number " + accountNumber + " not found.");
    }
    public void displayAllCustomers() {
        // for (Customer customer : customers) {
        //     System.out.println(customer);
        // }
        customers.stream().forEach(i -> System.out.println(i));
    }
}
    
