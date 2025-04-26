package products;

public abstract class Product {
    private String title;
    private Double price;
    private String id;
    Product (String title , Double price, String id) {
        setTitle(title);
        setId(id);
        setPrice(price);
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setId(String id) {
        if (!(id.length() ==4)){
            System.out.println("id can't set ");
        }
        this.id = id;
    }
    public String toString() {
        return "title :" +getTitle()+ "price :" +getPrice() +"it's id :" + getId();
    }

    protected abstract String generateId();
}
