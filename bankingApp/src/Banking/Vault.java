package Banking;

import java.io.*;

class Vault {
    public int bankAccount;

    public Vault() {
        this.bankAccount = 100;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public int putMoney(Integer numberToPut) {
        bankAccount += numberToPut;
        return bankAccount + numberToPut;
    }

    public boolean retrieveMoney(Integer numberToRetrieve) {
        if (numberToRetrieve <= bankAccount) {
            bankAccount -= numberToRetrieve;
            return true;
        } else {
            System.out.print("There is not enough money!");
            return false;
        }
    }

    // Save the current bankAccount value to a file
    public void saveToDisk(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(Integer.toString(bankAccount));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // Load the bankAccount value from a file
    public void loadFromDisk(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            bankAccount = Integer.parseInt(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}