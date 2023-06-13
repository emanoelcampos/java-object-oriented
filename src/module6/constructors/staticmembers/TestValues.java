package module6.constructors.staticmembers;

public class TestValues {

    public static void main(String[] args) {

        Account account = new Account(37,13179);
        Account account1 = new Account(37, 91713);

        /*
        conta está inconsistente
        account.setBranchNumber(-7777);
        account.setAccountNumber(-3333);

        System.out.println(account.getBranchNumber());
        System.out.println(account.getAccountNumber());
        */

        System.out.println(Account.getTotal());


    }
}
