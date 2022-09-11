package FacadePattern;

public class TestBankAccount {

    public static void main(String[] args) {

        BankAccountFacade accesingBank = new BankAccountFacade(12345678,1234);
        accesingBank.withdrawCash(50.00);
        accesingBank.withdrawCash(900.00);
        accesingBank.depositCash(200.00);
    }
}
