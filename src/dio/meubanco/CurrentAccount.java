package dio.meubanco;

public class CurrentAccount extends Account {

    public CurrentAccount(Client client) {
        super(client);
    }

    public void printInfos() {
        System.out.println("=== INFORMAÇÕES DA CONTA CORRENTE ===");
        super.printInfos();
    }
}
