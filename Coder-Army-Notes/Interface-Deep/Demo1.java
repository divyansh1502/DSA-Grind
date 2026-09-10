public class Demo1 {
    public static void main(String[] args) {
        Payment p1 = new CreditCard();
        p1.pay();
    }
}
interface Payment {
    void pay();
}
class CreditCard implements Payment {
    @Override
    public void pay() {
        System.out.println("Paying via Credit Card");
    }
}
class DebitCard implements Payment {
    @Override
    public void pay() {
        System.out.println("Paying via Debit Card");
    }
}