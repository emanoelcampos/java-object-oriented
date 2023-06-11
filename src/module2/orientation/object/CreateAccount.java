package module2.orientation.object;

public class CreateAccount {

    public static void main(String[] args) {

        Account account1 = new Account();
        account1.balance = 3589.90;
        System.out.println(account1.balance);

        account1.balance += 345;
        System.out.println(account1.balance);

        Account account2 = new Account();
        account2.balance = 2345.85;
        System.out.println(account2.balance);

    }
}
