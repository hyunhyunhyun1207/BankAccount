package Temp;

public class Account {
    private String accountNum;
    private String name;
    private String pwd;
    private int balance;

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public String getName() {

        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String setPwd(String pwd) {
        return this.pwd = pwd;
    }

    public String getPwd() {

        return pwd;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
