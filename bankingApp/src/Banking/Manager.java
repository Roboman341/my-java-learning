package Banking;

public class Manager {
    private Vault vault;

    public Manager() {
        // This is the constructor of the Manager class. When a new Manager object is created
        // this constructor is called automatically.
        vault = new Vault();
        vault.loadFromDisk("bank_account.txt");
    }

    public int getCurrentBalance() {
        return vault.getBankAccount();
    }

    public void putMoneyToTheAccount(int inputMoney) {
        System.out.format("I'm gonna put %s$ to the account%n", inputMoney);
        vault.putMoney(inputMoney);
        vault.saveToDisk("bank_account.txt");
    }

    public boolean getMoneyFromTheAccount(int retrievedMoney) {
        System.out.format("I'm gonna retrieve %s$ from the account%n", retrievedMoney);
        boolean success = vault.retrieveMoney(retrievedMoney);
        vault.saveToDisk("bank_account.txt");
        return success;
    }
}
