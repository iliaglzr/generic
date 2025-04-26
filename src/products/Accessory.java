package products;

public class Accessory extends Product{
    private String color;
    int number=0;

    public Accessory(String title, Double price, String id, String color) {
        super(title, price, id);
        setColor(color);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString()+"color : "+ getColor();
    }
    public String generateId() {

        if (number>9) {

            setId("3" + String.format("%02",number));
            return "3" + String.format("%02",number);
        }
        number++;
        setId("3" + String.format("%03",number));
        return "3" + String.format("%03",number);
    }
}
