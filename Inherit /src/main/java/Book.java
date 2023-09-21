public class Book extends Product {
    private String author;
    private int pages;
    private int publishedYear;

    public Book(int id, String name, int price, String author, int pages, int publishedYear) {
        super(id, name, price);
        this.author = author;
        this.pages = pages;
        this.publishedYear = publishedYear;
    }

    @Override
    public void use() {
        System.out.println("Читаем книгу: " + name);
    }

    @Override
    public boolean isTooExpensive() {
        if (price > 10_000) {
            return true;
        } else {
            return false;
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }
}
