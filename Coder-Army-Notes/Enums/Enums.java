public class Enums {
    public static void main(String[] args) {
        int status = PaymentStatus.SUCCESS;
        System.out.println(status);

        int ststus2 = 100;
        if(status == Role.USER) {
 
        }
    }
}

//Payment Status: SUCCESS -> FAILED -> PENDING
/*
Problem with this approach:
1. Type Safety
2. Poor Readability
3. No grouping of related entities
*/
class PaymentStatus {
    public static final int SUCCESS = 1;
    public static final int FAILED = 2;
    public static final int PENDING = 3;
}
class Role {
    public static final int USER = 1;
    public static final int ADMIN = 2;
}

