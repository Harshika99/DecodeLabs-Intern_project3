

    public class BankAccount {
        private double balance;
        public  BankAccount(double balance){
            this.balance = balance;
        }
        public void deposit(double amount){
           if(amount > 0){
            balance = balance + amount;
            System.out.println("deposited successfully");
           }
           else{
            System.out.println("invalid amount");
           }
           }

           public void withdraw(double amount){
            if(amount > 0 && amount <= balance){
                balance = balance - amount;
                System.out.println("withdraw successfull");
            }
            else{
                System.out.println("invalid amount");
            }

           }
           public void bankbalance(){
            System.out.println("available balance:"+balance);
           }
    }
   

    

