package module5.encapsulation.visibility;

public class TestNegativeWithdraw {

    public static void main(String[] args) {

        Account account = new Account();
        //account.depositFunds(100);
        //System.out.println(account.withdrawFunds(101));
        System.out.println(account.getBalance());

        /*
        proibido
        account.balance = account.balance - 101;
        System.out.println(account.balance);
        */

    }
}
