package assessment2;

import java.util.Scanner;

class Customer{
	int id;
	String name;
	char gender;
	public Customer(int id, String name, char gender) {
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public char getGender() {
		return gender;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + "]";
	}
}

class Account {
	
	int id;
	Customer customer;
	double balance=0.0;
	
	public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
	 
	public Account(int id, Customer customer) {
		this.id = id;           
	    this.customer = customer; 
	    this.balance = 0.0;
    }
	
	public int getID() {
		return id;
	}
	
	Customer getCustomer() {
		return customer;
		
	}
	
	public double getBalance() {
		return balance;
		
	}
	
	void setBalance(double balance) {
		this.balance=balance;
	}
	
	public String getCustomerName() {
		return customer.name;
	}
	
	Account deposit(double amount) {
		balance=balance+amount;
		return this;
	}
	
	Account withdraw(double amount) {
		if(balance>=amount) {
			balance=balance-amount;
		}
		else
		{
			System.out.println("amount withdrawn exceeds the current balance!");
		}
		return this;
	}

	@Override
	public String toString() {
		return customer.toString() + " balance=" + String.format("%.2f", balance);
	}

	
	
	
}
public class Sum1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Account_Id:");
        int Account_ID = input.nextInt();

        System.out.println("Customer_Id:");
        int customer_id = input.nextInt();

        System.out.println("Customer_name:");
        String name = input.next();

        System.out.println("Customer_Gender:");
        char gender = input.next().charAt(0);

        Customer customer = new Customer(customer_id, name, gender);
        Account account = new Account(Account_ID, customer);

        int choice = 0;
        while (choice != 4) {
            System.out.println("\nPlease Select One Option from below");
            System.out.println("1.WITHDRAW");
            System.out.println("2.DEPOSIT");
            System.out.println("3.CHECK BALANCE");
            System.out.println("4.EXIT");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to Withdraw: ");
                    double withdrawAmount = input.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to Deposit: ");
                    double depositAmount = input.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Current Balance: " + String.format("%.2f", account.getBalance()));
                    break;
                case 4:
                    System.out.println("THANK YOU FOR BANKING WITH US!!");
                    break;
                
            }
        }
        input.close();
    }
}