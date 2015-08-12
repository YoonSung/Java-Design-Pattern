package iterator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by yoon on 15. 8. 12..
 */
public class IteratorTest {
    @Test
    public void bookIterator() {
        //Given
        String[] books = new String[]{
                "Around the World in 80 Days",
                "Bible",
                "Cinderella",
                "Daddy-Long-Legs"
        };

        BookShelf bookShelf = new BookShelf(books.length);

        for (String bookName : books) {
            bookShelf.appendBook(new Book(bookName));
        }

        //When
        Iterator it = bookShelf.iterator();

        //Then
        int index = 0;
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println("" + book.getName());
            assertEquals(books[index], book.getName());
            index++;
        }
    }
}