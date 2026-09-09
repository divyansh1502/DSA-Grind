public class enum2 {
    public static void main(String[] args) {
        // PaymentStatus status2 = 100; ==> Not allowed in enums it ensure type safety
        PaymentStatus status = PaymentStatus.SUCCESS;
        System.out.println(status.name());
        
    }
}
// ENUM --> Enumerations | Enumerated Types
// ENUM --> Predefined set of consonants
enum PaymentStatus {
    SUCCESS,
    PENDING,
    FAILED;
}
class PaymentStatus2 {
    public static final int SUCCESS = 1;
    public static final int FAILED = 2;
    public static final int PENDING = 3;
}
