package Oopjava;


public class Encapsulation {
    // Private variable - can only be accessed through this class
    private double bankBalance;

    // deposit() method - corrected return type (void, not double void)
    public void deposit(double amount) {
        if (amount > 0) bankBalance += amount;
    }

    // withdraw() method - corrected return type
    public void withdraw(double amount) {
        if (amount <= bankBalance) {
            bankBalance -= amount;
        }
    }

    // getBalance() method - should return double, not void
    public double getBalance() {
        return bankBalance;
    }

public static void main(String[] args){
Encapsulation obj = new Encapsulation();
//getting total amount with getbalance
obj.deposit(100000);
double Balance = obj.getBalance(); 
System.out.println("The bank balance is - " + Balance);

//getting total amout after withdrawl
obj.withdraw(500);
double withBalance = obj.getBalance();
System.out.println("The bank balance is - " + withBalance);
}
}