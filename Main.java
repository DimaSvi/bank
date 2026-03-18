public class Main {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("UA001", "Ivan", 1000);

        System.out.println("Owner: " + acc1.getOwnerName());
        System.out.println("Balance: " + acc1.getBalance());

        acc1.deposit(200);
        System.out.println("After deposit: " + acc1.getBalance());

        acc1.withdraw(300);
        System.out.println("After withdraw: " + acc1.getBalance());

        acc1.withdraw(2000);

        acc1.setOwnerName("Al");
        acc1.setOwnerName("Alex");

        System.out.println("New owner: " + acc1.getOwnerName());
    }
}