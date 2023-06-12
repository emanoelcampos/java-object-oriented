package module4.object.composition;

public class TestAccountWithOutClient {

    public static void main(String[] args) {

        Account anaAccount = new Account();

        anaAccount.accountHolder = new Client();
        System.out.println(anaAccount.accountHolder); //referência do cliente

        anaAccount.accountHolder.name = "Ana";
        System.out.println(anaAccount.accountHolder.name);
    }
}
