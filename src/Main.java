import inventory.Inventory;

import products.*;

public class Main {
    public static void main(String[] args) {
        Inventory<Book> bookInventory = new Inventory<Book>();
        Inventory<Notebook> notebookInventory =new Inventory<Notebook>();
        Inventory<Accessory> accessoryInventory = new Inventory<Accessory>();
        Book book1 = new Book("math",190000.00,"","ilia","iran","mathes");
        book1.generateId();
        bookInventory.addItems(book1);
        Book book2 = new Book("ap",180000.00,"","ilia","iran","programing");
        book2.generateId();
        bookInventory.addItems(book2);

        Notebook notebook1 = new Notebook("notebook 1",30000.00,"",60,true);
        notebook1.generateId();
        notebookInventory.addItems(notebook1);

        Notebook notebook2 = new Notebook("notebook 2",50000.00,"",100,true);
        notebook2.generateId();
        notebookInventory.addItems(notebook2);

        Accessory accessory1 = new Accessory("clock",3800000.00,"","black");
        accessory1.generateId();
        accessoryInventory.addItems(accessory1);

        Accessory accessory2 = new Accessory("glasses",4600000.00,"","blue");
        accessory2.generateId();
        accessoryInventory.addItems(accessory2);
        System.out.println("books :");
        bookInventory.displayAll();
        System.out.println("Notebooks :");
        notebookInventory.displayAll();
        System.out.println("accessory :");
        accessoryInventory.displayAll();

        accessoryInventory.removeItemsById("3001");
        bookInventory.removeItemsById("1001");

        bookInventory.findItemsById("1002");
        notebookInventory.findItemsById("3004");

//        public static double calculateTotalPrice(Inventory<? extends Product> inventory) {
//            double totalPrice = 0.0;
//            for (Inventory inventory : Inventory) {
//                totalPrice += product.getPrice();
//            }
//            return totalPrice;
//        }

    }
}