public class EnumPolymorphism {
    public static void main(String[] args) {
        
        Direction northDirection = Direction.NORTH;
        northDirection.move();
    
    }
}
enum Direction {
    NORTH {
        @Override
        public void move() {
            System.out.println("Move up (y + 1)");
        }  
    },
    SOUTH {
        @Override
        public void move() {
            System.out.println("Move up (y - 1)");
        }  
    },
    EAST {
        @Override
        public void move() {
            System.out.println("Move right (x + 1)");
        }  
    },
    WEST {
        @Override
        public void move() {
            System.out.println("Move left (x - 1)");
        }  
    };

    public abstract void move();
}





















// abstract class Direction1 {
//     public abstract void move();
// }

// class NorthDirection extends Direction1 {
//     @Override
//     public void move() {
//         System.out.println("Move up (y + 1)");
//     }
// }
// class SouthDirection extends Direction1 {
//     @Override
//     public void move() {
//         System.out.println("Move down (y - 1)");
//     }
// }
// class EastDirection extends Direction1 {
//     @Override
//     public void move() {
//         System.out.println("Move right (x + 1)");
//     }
// }
// class WestDirection extends Direction1 {
//     @Override
//     public void move() {
//         System.out.println("Move left (x - 1)");
//     }
// }