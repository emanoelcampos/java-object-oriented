package module3.defining.behavior;

public class TestMethod {

    public static void main(String[] args) {

        Account anaAccount = new Account();
        anaAccount.balance = 2456.50;
        anaAccount.depositFunds(750.90);
        System.out.println(anaAccount.balance);

        boolean managedWithdraw = anaAccount.withdrawFunds(1555.96);
        System.out.println(managedWithdraw);
        System.out.println(anaAccount.balance);

        Account emanoelAccount = new Account();
        emanoelAccount.depositFunds(3500);

        boolean transferOperation =  emanoelAccount.transferFunds(anaAccount, 400);
        System.out.println(transferOperation);
        System.out.println(emanoelAccount.balance);
        System.out.println(anaAccount.balance);
    }
}
