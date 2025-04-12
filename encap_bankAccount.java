package test;

public class encap_bankAccount {

    //balance private
    private double balance;

    //constructor to initialize balance
    public encap_bankAccount(double balance)
    {
        this.balance=balance;
    }

    //deposit Money
    public void deposit(double amount)
    {
        if(amount>0)
        {
            balance+=amount;
        }
    }

    //withdraw money
    public void withdraw(double amount)
    {
        if(amount > 0 && balance>=amount)
        {
            balance-=amount;
        }
    }
    //Getter method to balance
    public double getbalance()
    {
        return balance;
    }

    public static void main(String[] args) {

        encap_bankAccount bankAcc = new encap_bankAccount(1000);
        bankAcc.deposit(5000);
        bankAcc.withdraw(2500);
        System.out.println("Balance" + bankAcc.getbalance());
        
    }
    
}
