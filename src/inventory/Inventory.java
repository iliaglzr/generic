package inventory;

import products.Product;

import java.util.ArrayList;

public class Inventory<T extends Product> {
    private ArrayList<T> items = new ArrayList<>();


    public ArrayList<T> getItems() {
        return items;
    }

    public void setItems(ArrayList<T> items) {
        this.items = items;
    }

    public void addItems(T product) {
        items.add(product);
    }

    public void applyDiscount(String producttitle, int discount) {
        for (T product : items) {
            if (product.getTitle().equals(producttitle)) {
                double newPrice = product.getPrice() * (1 - discount / 100.0);
                double oldprice = product.getPrice();
                product.setPrice(newPrice);
                double off = oldprice - newPrice;
                System.out.println("off :" +off+ " on" + product.getTitle());
                break;
            }
            System.out.println("not found");
        }
    }
    public void removeItemsById(String id) {
        items.removeIf(product -> product.getId().equals(id));
        System.out.println("this "+id+" removed");
    }
    public T findItemsById(String id) {
        for (T product : items) {
            if (product.getId().equals(id)) {
                System.out.println("your id founded " +id);
                return product;
            }
        }
        System.out.println("not founded!");
        return null;
    }

    public void displayAll() {
        for (T product : items) {
            System.out.println(product);
        }
    }
}
