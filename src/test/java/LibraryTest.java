import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

/*
 * This Java source file was auto generated by running 'gradle init --type java-library'
 * by 'Hari' at '30/6/15 6:53 PM' with Gradle 2.4
 *
 * @author Hari, @date 30/6/15 6:53 PM
 */
public class LibraryTest {
    @Test
    public void testSomeLibraryMethod() throws IOException {
        Library classUnderTest = new Library();
        assertEquals("should return connection string", "bla bla", classUnderTest.someLibraryMethod());
    }
}
