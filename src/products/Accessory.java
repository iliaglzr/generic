package products;

public class Accessory extends Product{
    private String color;
    private static int number = 0;


    public Accessory(String title, Double price, String color) {
        super(title, price);
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

            setId("3" + String.format("%02d",number));
            return "3" + String.format("%02d",number);
        }
        number++;
        setId("3" + String.format("%03d",number));
        return "3" + String.format("%03d",number);
    }
}
