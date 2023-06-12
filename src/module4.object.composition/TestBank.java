package module4.object.composition;

public class TestBank {

    public static void main(String[] args) {

        Client emanoel = new Client();
        emanoel.name  = "Emanoel Campos";
        emanoel.cpf = "777.777.777.77";
        emanoel.profession = "Software Developer";

        Account emanoelBankAccount = new Account();
        emanoelBankAccount.depositFunds(350);

        // associa o cliente emanoel a conta emanoelBankAccount
        emanoelBankAccount.accountHolder = emanoel;
        System.out.println(emanoelBankAccount.accountHolder.name);

    }
}
