package FacadePattern;

public class BankAccountFacade {

    private int accountNumber;
    private int securityCode;

    AccountNumberCheck accountNumberCheck;
    SecurityCodeCheck securityCodeCheck;
    FundsCheck fundsCheck;

    WelcomeToBank welcomeToBank;

    public BankAccountFacade(int newAccNum, int secCode) {
        accountNumber = newAccNum;
        securityCode = secCode;
        welcomeToBank = new WelcomeToBank();
        accountNumberCheck = new AccountNumberCheck();
        securityCodeCheck = new SecurityCodeCheck();
        fundsCheck = new FundsCheck();
    }

    public int getAccountNumber(){
        return accountNumber;
    }
    public int getSecurityCode(){
        return securityCode;
    }

    public void withdrawCash(double cashToGet){
        if(accountNumberCheck.isAccountActive(getAccountNumber())
                && securityCodeCheck.isValidSecurityCode(getSecurityCode())
                && fundsCheck.haveEnoughMoney(cashToGet)){
            System.out.println("Transaction Complete\n");
        }else{
            System.out.println("Transaction Failed\n");
        }

    }

    public void depositCash(double cashToDeposit){
        if(accountNumberCheck.isAccountActive(getAccountNumber())
                && securityCodeCheck.isValidSecurityCode(getSecurityCode())){
                fundsCheck.makeDeposit(cashToDeposit);
            System.out.println("Transaction Complete\n");
        }
        else{
            System.out.println("Transaction Failed\n");
        }
    }
}
