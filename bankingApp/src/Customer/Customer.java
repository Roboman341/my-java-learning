package Customer;

import Banking.Manager;

public class Customer {
    public static void main(String[] args) {
        Manager manager1 = new Manager();

//        boolean success = manager1.getMoneyFromTheAccount(100);
//        if (success) {
//            System.out.println("Retrieved money successfully.");
//        } else {
//            System.out.println("Failed to retrieve money.");
//        }
//        System.out.println("Current bank account balance: " + manager1.getCurrentBalance());


        manager1.putMoneyToTheAccount(25);
        System.out.println(manager1.getCurrentBalance());
    }
}