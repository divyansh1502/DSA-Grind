public class Food {
    
    private int id;
    private String food;
    private String category;
    private double price;

    Food(int id, String food, String category, double price) {
        this.id = id;
        this.food = food;
        this.category = category;
        this.price = price;
    }
    Food() {

    }
    //getters & setters
    int getId() {
        return this.id;
    }
    void setId(int id) {
        this.id = id;
    }
    String getFood() {
        return this.food;
    }
    void  setFood(String food) {
        this.food = food;
    }
    String getCategory() {
        return this.category;
    }
    void setCategory(String category) {
        this.category = category;
    }
    double getPrice() {
        return this.price;
    }
    void setPrice(double price) {
        this.price = price;
    }
}

