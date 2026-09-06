public class localClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.greet();
    }
}
//effective final rule
class Outer {

    void greet() {
        int y = 5;
        // y++; ==> cannot modified the variable should be final or cannot be modified its the rule of local class
        class Local {
            void sayHello() {
                System.out.println(y);
            }
            void sayNamaste() {
                System.out.println("Namaste");
            }
        }
        Local local = new Local();
        local.sayNamaste();
        local.sayHello();
    }
}

/*
Where we can create a local class:

1. constructor 
2. loop
3. if-else
4. method
5. static block
*/