package module2.orientation.object;

public class TestReference {

    public static void main(String[] args) {

        Account account1 = new Account();
        account1.balance = 1213.75;

        System.out.println("Balance first account: " + account1.balance);
        System.out.println(account1);

        Account account2 = account1;
        System.out.println("Balance second account: " + account2.balance);
        System.out.println(account2);

        account2.balance += 1000;
        System.out.println("Balance second account: " + account2.balance);

        System.out.println("Balance first account: " + account1.balance);

        if(account1 == account2) {
            System.out.println("Same object");
        } else {
            System.out.println("different objects");
        }
    }
}
