public class Book {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int year;
    private int pageCount;
    private double price;
    private String coverType;

    // Конструкторы
    public Book(int id, String title, String author, String publisher, int year, int pageCount, double price, String coverType) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pageCount = pageCount;
        this.price = price;
        this.coverType = coverType;
    }

    // Методы set и get
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    // Метод toString
    @Override
    public String toString() {
        return "Книга:" +
                "номер=" + id +
                ", Название='" + title + '\'' +
                ", Автор='" + author + '\'' +
                ", Издательство='" + publisher + '\'' +
                ", Год=" + year +
                ", Кол-во страниц=" + pageCount +
                ", Цена=" + price +
                ", Переплёт='" + coverType + '\'' +
                ';';
    }

    // Дополнительные методы
    // Метод для вывода информации о книгах заданного автора
    public void displayBooksByAuthor(String authorName) {
        if (this.author.equals(authorName)) {
            System.out.println(this.toString());
        }
    }

    // Метод для вывода информации о книгах заданного издательства
    public void displayBooksByPublisher(String publisherName) {
        if (this.publisher.equals(publisherName)) {
            System.out.println(this.toString());
        }
    }

    // Метод для вывода информации о книгах изданных после заданного года
    public void displayBooksPublishedAfterYear(int year) {
        if (this.year > year) {
            System.out.println(this.toString());
        }
    }
}

class Library {
    public static void main(String[] args) {
        // Создание массива книг
        Book[] books = new Book[3];
        books[0] = new Book(1, "Спорт и дух ", "Витя", "Спорт", 2020, 30, 1000.5, "на пружине");
        books[1] = new Book(2, "Рэп всегда ", "Серёжа", "Музыка", 2013, 217, 20.12, "мягкий");
        books[2] = new Book(3, "Как успеть везде ", "Кирилл", "Время", 2015, 144, 30.0, "тугой");

        // Вывод списка книг заданного автора
        System.out.println("Список книг автора Серёжа:");
        for (Book book : books) {
            book.displayBooksByAuthor("Серёжа");
        }

        // Вывод списка книг, выпущенных заданным издательством
        System.out.println("\nСписок книг издательства Спорт:");
        for (Book book : books) {
            book.displayBooksByPublisher("Спорт");
        }

        // Вывод списка книг, выпущенных после заданного года
        System.out.println("\nСписок книг, выпущенных после 2010 года:");
        for (Book book : books) {
            book.displayBooksPublishedAfterYear(2010);
        }
    }
}