package book17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamsLibrary {
    public static final List<Book> books =
      Arrays.asList(new Book("A", "A1"), new Book("A", "A2"), new Book("B", "B1"));

    public static List<Book> booksByAuthor(String author) {
      return books.stream()
              .filter(b -> b.author().equals(author))
              .collect(Collectors.toList());
    }

    public static void main(String[] args) {
      List<Book> booksByA = booksByAuthor("A").stream()
                 .sorted(Comparator.comparing(b -> b.author()))
                 .collect(Collectors.toList());
      System.out.print(booksByA);
    }
}
