package Customer;

import Banking.Manager;

public class Customer {
    private String name;
    private double accountBalance;

    // Constructor requiring name and initial deposit
    public Customer(String name, double accountBalance) {
        this.name = name;
        this.accountBalance = accountBalance;
    }

    public String getName() {
        return name;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public static void main(String[] args) {
        Customer customer1 = new Customer("John", 200);
        // Access and display customer's information
        System.out.println("Customer Name: " + customer1.getName());
        System.out.println("Account Balance: $" + customer1.getAccountBalance());


        Manager manager1 = new Manager();
        boolean success = manager1.getMoneyFromTheAccount(100);
        if (success) {
            System.out.println("Retrieved money successfully.");
        } else {
            System.out.println("Failed to retrieve money.");
        }
        System.out.println("Current bank account balance: " + manager1.getCurrentBalance());


//        manager1.putMoneyToTheAccount(25);
//        System.out.println(manager1.getCurrentBalance());
    }
}