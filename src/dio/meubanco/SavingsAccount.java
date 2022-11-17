package dio.meubanco;

public class SavingsAccount extends Account {

    public SavingsAccount(Client client) {
        super(client);
    }

    public void printInfos() {
        System.out.println("=== INFORMAÇÕES DA CONTA POUPANÇA ===");
        super.printInfos();
    }
}
