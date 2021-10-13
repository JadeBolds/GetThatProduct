package gotThatProduct;

public class ExpirationDate {
    private String month;
    private String day;
    private String year;

    @Override
    public String toString() {
        return "ExpirationDate{" +
                "month='" + month + '\'' +
                ", day='" + day + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
