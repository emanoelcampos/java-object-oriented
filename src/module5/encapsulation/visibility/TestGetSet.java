package module5.encapsulation.visibility;

public class TestGetSet {

    public static void main(String[] args) {

        Account account = new Account();
        account.setAccountNumber(77777);
        System.out.println(account.getAccountNumber());

        Client emanoel = new Client();
        emanoel.setName("Emanoel Campos");
        emanoel.setProfession("Software Developer");

        account.setAccountHolder(emanoel);
        System.out.println(account.getAccountHolder().getName());
        System.out.println(account.getAccountHolder().getProfession());

        account.getAccountHolder().setCpf("777.777.777.77");
        //agora em duas linhas
        Client accountHolder = account.getAccountHolder();
        accountHolder.setCpf("333.333.333.33");

        System.out.println(emanoel);
        System.out.println(account.getAccountHolder());
        System.out.println(accountHolder);
    }
}
