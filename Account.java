import java.util.*;
 class Account{
 int balance;
 void Account(int intialBalance){
 System.out.println("Enter the balance:");
 Scanner s=new Scanner(System.in);
 intialBalance=s.Int();
 balance = initialBalance;
 };
 void Account(){
 balance = 0.0;
 };
 void deposit(int amount){
 balance += amount;
 };
 void withdraw(int amount) {
 if (amount > balance) {
 System.out.println("Insufficient funds. $5 penalty charged.");
 balance-= 5.0;
 }
 else {
 balance-= amount;
 }
 };
 void getBalance() {
 return balance;
 };
 void computeInterest(int interestRate) {
 double interest = balance * interestRate / 100.0;
 balance += interest;
 };
 }
 class main_account
 {
 public static void main(String[] args) {
Account account1 = new Account();
 Account account2 = new Account();
 account1.deposit(50.0);
 account1.withdraw(75.0);
 System.out.println("Account 1 balance: $" +
 account1.getBalance());
 account2.deposit(200.0);
 account2.withdraw(300.0);
 System.out.println("Account 2 balance: $" +
 account2.getBalance());
 account1.computeInterest(5.0);
 System.out.println("Account 1 balance after interest: $" +
 account1.getBalance());
 }
 }
