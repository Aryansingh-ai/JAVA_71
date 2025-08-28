public class MyBank {
    public static void main(String[] args) {
        Bank b =  new Bank();
        try{
            b.withdraw(50000);
            b.withdraw(51000);
        }
        catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
