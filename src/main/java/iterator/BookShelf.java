package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yoon on 15. 8. 12..
 */
public class BookShelf implements Aggregate {
    private List<Book> books;
    private int last;

    public BookShelf(int max) {
        this.books = new ArrayList<Book>(max);
        this.last = 0;
    }

    public void appendBook(Book book) {
        this.books.add(book);
        this.last ++;
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public int getLength() {
        return this.last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
