import java.util.Scanner;
     public class Atm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(5000);
       int choice;
       double amount;
       while(true){
        System.out.println("enter your choice");
        System.out.println("1.deposit");
        System.out.println("2.withdraw");
        System.out.println("3.checkbalance");
        System.out.println("4.exit");
        choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("enter deposit amount");
                amount = sc.nextDouble();
                account.deposit(amount);
        break;
           case 2:
            System.out.println("enter withdraw amount");
            amount = sc.nextDouble();
            account.withdraw(amount);
            break;
            case 3:
                System.out.println("current balance amount :");
                account.bankbalance();
                break;
            case 4:
                System.out.println("thankyou");
                sc.close();
                break;
         default:
            System.out.println("invalid choice");
            }
       }
    }
}
    
