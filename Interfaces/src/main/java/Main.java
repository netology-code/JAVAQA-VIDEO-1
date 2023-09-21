import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book(
                1,
                "Моя весна",
                200,
                "Александр Шубкин",
                100,
                1947
        );

        Book book2 = new Book(
                1,
                "Моя осень",
                300,
                "Александр Шубкин",
                50,
                1948
        );

        BookPriceComparator priceComparator = new BookPriceComparator();

        Book[] books = { book1, book2 };
        Arrays.sort(books, priceComparator);
    }
}
