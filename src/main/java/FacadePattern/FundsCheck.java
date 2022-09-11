package FacadePattern;

public class FundsCheck {

    private double cashInAccount = 1000.00;

    public double getCashInAccount(){
        return cashInAccount;
    }

    public void decreaseCashInAccount(double cashWithdrawn){
        cashInAccount -= cashWithdrawn;

    }
    public void increaseashInAccount(double cashDeposit){
        cashInAccount += cashDeposit;

    }

    public boolean haveEnoughMoney(double cashToWithdrawl){

        if(cashToWithdrawl > getCashInAccount()){
            System.out.println("You dont have enough money");
            System.out.println("Current Balance: " + getCashInAccount());
            return false;
        }
        else{
            decreaseCashInAccount(cashToWithdrawl);
            System.out.println("Withdrawal complete\nCurrent Balance: " + getCashInAccount());
            return true;
        }
    }

    public void makeDeposit(double cashToDeposit){
        increaseashInAccount(cashToDeposit);
        System.out.println("Depost complete.\nCurrent Balance:" + getCashInAccount());



    }
}
