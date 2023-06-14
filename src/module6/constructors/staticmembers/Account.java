package module6.constructors.staticmembers;

public class Account {

    private double balance;
    private int branchNumber;
    private int accountNumber;
    private Client accountHolder;

    private static int total;

    public Account(int branchNumber, int accountNumber) {
        Account.total++;
        //System.out.println("O total de contas é " + total);
        this.branchNumber = branchNumber;
        this.accountNumber = accountNumber;
        //System.out.println("Estou criando uma conta");
    }

    public static int getTotal() {
        return Account.total;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getBranchNumber() {
        return branchNumber;
    }

    /*
    public void setBranchNumber(int branchNumber) {

        if(branchNumber <= 0) {
            System.out.println("cannot be less than or equal to zero");
            return;
        }
        this.branchNumber = branchNumber;
    }
     */

    public int getAccountNumber() {
        return accountNumber;
    }

    /*
    public void setAccountNumber(int accountNumber) {
        if(accountNumber <= 0) {
            System.out.println("cannot be less than or equal to zero");
            return;
        }
        this.accountNumber = accountNumber;
    }
     */

    public Client getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(Client accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void depositFunds(double amount) {
        this.balance += amount;
    }

    public boolean withdrawFunds(double amount) {
        if(this.balance >= amount) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferFunds(Account destinationAccount, double amount) {
        if(this.balance >= amount) {
            this.balance -= amount;
            //destinationAccount.balance += amount;
            destinationAccount.depositFunds(amount);
            return true;
        }
        return false;
    }
}
