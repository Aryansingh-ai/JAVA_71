public class Bank {
    private int balance = 100000;
    public void withdraw(int amount){
        if(amount > balance){
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        else{
            balance -= amount;
            System.out.println("Withdrawn Successfully , remaining balance = "+balance);
        }
    }
}
