import com.edu.CustomArrayList;
import com.edu.DefaultCustomArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Iterator;
import static org.junit.jupiter.api.Assertions.*;

public class DefaultCustomArrayListTest {

    private CustomArrayList<Integer> list;

    @BeforeEach
    public void setUp() {
        list = new DefaultCustomArrayList<>();
    }

    @Test
    public void testAddAndGetSize() {
        assertTrue(list.add(1));
        assertTrue(list.add(2));
        assertEquals(2, list.size());
    }

    @Test
    public void testGet() {
        list.add(1);
        list.add(2);
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
    }

    @Test
    public void testRemove() {
        list.add(1);
        list.add(2);
        assertTrue(list.remove(1));
        assertEquals(1, list.size());
        assertFalse(list.contains(1));
    }

    @Test
    public void testClear() {
        list.add(1);
        list.add(2);
        list.clear();
        assertEquals(0, list.size());
        assertTrue(list.isEmpty());
    }

    @Test
    public void testContains() {
        list.add(1);
        list.add(2);
        assertTrue(list.contains(1));
        assertFalse(list.contains(3));
    }

    @Test
    public void testIsEmpty() {
        assertTrue(list.isEmpty());
        list.add(1);
        assertFalse(list.isEmpty());
    }

    @Test
    public void testIterator() {
        list.add(1);
        list.add(2);
        Iterator<Integer> iterator = list.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(1, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(2, iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testGetWithIndexOutOfBoundShouldThrowException() {
        list.add(1);
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(5);
        });
    }
}
