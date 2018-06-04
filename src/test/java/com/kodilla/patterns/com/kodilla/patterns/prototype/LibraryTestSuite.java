package com.kodilla.patterns.com.kodilla.patterns.prototype;

import com.kodilla.patterns.prototype.Book;
import com.kodilla.patterns.prototype.Library;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //given

        Library library = new Library("New List");
        IntStream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(n -> library.getBooks().add(new Book("Ogniem i Mieczem", "Sienkiewicz", LocalDate.of(2014, 1, 1))));

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.getName();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        System.out.println(library);
        System.out.println(clonedLibrary);

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.getBooks();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().add(new Book("W pustyni i w puszczy", "Sienkiewicz", LocalDate.of(2014, 1, 1)));
        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(6, library.getBooks().size());
        Assert.assertEquals(6, clonedLibrary.getBooks().size());
        Assert.assertEquals(5, deepClonedLibrary.getBooks().size());

    }
}

