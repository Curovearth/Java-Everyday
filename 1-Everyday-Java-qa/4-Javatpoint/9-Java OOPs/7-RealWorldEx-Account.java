// To demonstrate the working of a banking system where we deposit and withdraw amount from our account
// Creating an Account class which has deposit() and withdraw() methods

class TestAccount {
    public static void main(String args[]){
        Account a1 = new Account();
        a1.insert("Ritesh",873829,1000);
        a1.display();
        a1.checkBalance();
        a1.deposit(3000);
        a1.checkBalance();
        a1.withdraw(4000);
        a1.checkBalance();
    }
}

class Account {
    String name;
    int acc_no;
    float amount;
    void insert(String a, int n, float amt) {       //Feeding the values from user to get the details of his/her name, account_no and amount
        amount = amt;
        acc_no = n;
        name = a;
    }
    void deposit(float amt) {                       //Depositing a amount to the bank
        amount = amount + amt;
        System.out.println(amt + " Deposited");
    }
    void withdraw(float amt) {                      //withdrawing amount from the bank
        if(amount < amt) System.out.println("Insufficient Balance");
        else{
            amount = amount - amt;
            System.out.println(amount + " Withdrawn from the account");
        }
    }
    void checkBalance(){ System.out.println("Balance is " + amount); }
    void display(){ System.out.println(acc_no + " " + name + " " + amount); }
}
