package visitor;

import composite.FileTreatmentException;

import java.util.Iterator;

/**
 * Created by yoon on 15. 8. 15..
 */
public abstract class Entry implements Acceptor {
    public abstract String getName();
    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public Iterator iterator() throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
