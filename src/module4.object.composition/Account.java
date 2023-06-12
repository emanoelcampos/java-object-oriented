package module4.object.composition;

public class Account {

    double balance;
    int branchNumber;
    int accountNumber;
    Client accountHolder;

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
