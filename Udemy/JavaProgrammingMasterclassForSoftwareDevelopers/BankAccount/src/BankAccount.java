public class BankAccount {
    private long accountNumber;
    private float balance;
    private String name;
    private String mail;
    private int phoneNumber;

    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setBalance(float balance){
        this.balance=balance;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setMail(String mail){
        this.mail=mail;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public long getAccountNumber(){
        return this.accountNumber;
    }
    public float getBalance(){
        return this.balance;
    }
    public String getName(){
        return this.name;
    }
    public String getMail(){
        return this.mail;
    }
    public int getPhoneNumber(){
        return this.phoneNumber;
    }
    public void depositFunds(float amount){
        this.balance+=amount;
    }
    public void withdrawFunds(float amount) {
        if (this.balance < amount) {
            System.out.println("You don't have that amount");
        } else {
            this.balance -= amount;
        }
    }

}
