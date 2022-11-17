package dio.meubanco;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("Meu Banco");

        Client client1 = new Client("José da Silva", "12345678910");
        bank.addClientList(client1);

        Client client2 = new Client("João da Souza", "98765432198");
        bank.addClientList(client2);

        Account currentAccount1 = new CurrentAccount(client1);
        bank.addAccountList(currentAccount1);

        Account savingsAccount1 = new SavingsAccount(client1);
        bank.addAccountList(savingsAccount1);

        Account currentAccount2 = new CurrentAccount(client2);
        bank.addAccountList(currentAccount2);

        Account savingsAccount2 = new SavingsAccount(client2);
        bank.addAccountList(savingsAccount2);

        bank.getAccount();
        bank.getClient();

        currentAccount1.printInfos();
        savingsAccount1.printInfos();
        currentAccount2.printInfos();
        savingsAccount2.printInfos();
    }
}
