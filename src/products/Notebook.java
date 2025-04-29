package products;

public class Notebook extends Product{
    private static int number = 0;

    private int pageCount;

    private boolean isHardCover;

    public Notebook(String title, Double price, int pageCount, boolean isHardCover) {
        super(title, price);
        setPageCount(pageCount);
        this.isHardCover = isHardCover;
    }



    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }


    @Override
    public String toString() {
        return super.toString()+"page count : " + getPageCount() +" is hard cover: "+isHardCover ;
    }

    @Override
    public String generateId() {
        number++;
        if (number>9) {

            setId("2" + String.format("%02d",number));
            return "2" + String.format("%02d",number);
        }
        setId("2" + String.format("%03d",number));
        return "2" + String.format("%03d",number);
    }
}
