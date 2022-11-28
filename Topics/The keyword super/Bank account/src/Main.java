class BankAccount {

    protected String number;
    protected Long balance;

    public BankAccount(String number, Long balance) {
        this.number = number;
        this.balance = balance;
    }

}

class CheckingAccount extends BankAccount {
    double fee = 0.0;

    public CheckingAccount(String number, Long balance, double fee) {
        super(number, balance);
        this.fee = fee;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate = 0.0;

    public SavingsAccount(String number, Long balance, double interestRate) {
        super(number, balance);
        this.interestRate = interestRate;
    }
}