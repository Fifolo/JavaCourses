public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.setAccountNumber(111222333);
        myAccount.setBalance(15000);
        myAccount.setMail("filip.starczewski@gmail.com");
        myAccount.setName("Filip Starczewski");
        myAccount.setPhoneNumber(786135188);
        System.out.println(myAccount.getName() + " is owner of " + myAccount.getAccountNumber() + " account number");
        System.out.println("His balance is " + myAccount.getBalance());
        System.out.println("You can contact him via mail: " + myAccount.getMail() + " and his phone number is " +
                myAccount.getPhoneNumber());
        myAccount.depositFunds(5000);
        System.out.println("Your balance = "+ myAccount.getBalance());
        myAccount.withdrawFunds(7000);
        System.out.println("Your balance = "+myAccount.getBalance());
        myAccount.withdrawFunds(15000);

    }
}
