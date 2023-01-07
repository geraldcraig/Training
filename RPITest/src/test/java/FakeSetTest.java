import org.junit.*;
import static org.junit.Assert.*;

import java.util.Collection;

/*
Instructions: 
1.	Uncomment a test (@Test method) in FakeSetTest
2.	Write the bare minimum code for the test to pass
3.	Repeat for each test in order
*/

//class FakeSetTest<T> {
//
//    public FakeSetTest() {
//    }
//
//    public void add(T element) {
//    }
//
//	public void isEmpty() {
//    }
//
//	public void addAll(Collection<T> collection) {
//    }
//}

public class FakeSetTest {
    FakeSet<Integer> intSet;
    FakeSet<String> stringSet;

    @Before
    public void init() {
        intSet = new FakeSet<Integer>();
        stringSet = new FakeSet<String>();
    }


    @Test
    public void createNewSet() {
        assertNotNull(new FakeSet());
    }

/*
    @Test
    public void addIntegerToIntegerSet() {
        assertTrue(intSet.add(1));
    }
*/
/* 
	@Test
    public void checkIsEmptyOnNewSet() {
        assertTrue(intSet.isEmpty());
    }
 */
 /* 
    @Test
    public void isNotEmptyAfterAdd() {
        intSet.add(1);
        assertFalse(intSet.isEmpty());
    }
 */
/* 
    @Test
    public void checkSizeOfModifiedSet() {
        intSet.add(1);
        assertEquals(1, intSet.size());
 
    }
 */
 /* 
    @Test
    public void checkSizeOfNewSet() {
        assertEquals(0, intSet.size());
    }
 */
 /* 
    @Test
    public void checkNotContains() {
        assertFalse(intSet.contains(1));
    }
 */
 /* 
    @Test
    public void checkContains() {
        intSet.add(1);
        assertTrue(intSet.contains(1));
    }
 */
 /* 
    @Test(expected = IllegalArgumentException.class)
    public void addSameObjectToSetTwice() {
        intSet.add(1);
        intSet.add(1);
    }
 */
 /* 
    @Test
    public void checkRemove() {
        intSet.add(1);
        intSet.remove(1);
        assertFalse(intSet.contains(1));
    }
 */
/*  
    @Test
    public void checkIsEmptyOnRemoveLast() {
        intSet.add(1);
        intSet.remove(1);
        assertTrue(intSet.isEmpty());
    }
 */
/*  
    @Test
    public void checkRemoveIsTrueOnRemoval() {
        intSet.add(1);
        assertTrue(intSet.remove(1));
    }
 */
 /* 
    @Test
    public void checkRemoveNonExistentElement() {
        assertFalse(intSet.remove(1));
    }
 */
 /* 
    @Test
    public void checkSuccessfulRemoveAltersSize() {
        int preRemoveSize;
        intSet.add(1);
        preRemoveSize = intSet.size();
        intSet.remove(1);
        assertEquals(preRemoveSize-1, intSet.size());
    }
 */
 /* 
    @Test
    public void checkClearRemovesObject() {
        intSet.add(1);
        intSet.clear();
        assertFalse(intSet.contains(1));
    }
 */
 /* 
    @Test
    public void checkSizeOnClear() {
        intSet.add(1);
        intSet.clear();
        assertEquals(0, intSet.size());
    }
 */
 /* 
    @Test
    public void checkIsEmptyOnClear() {
        intSet.add(1);
        intSet.clear();
        assertTrue(intSet.isEmpty());
    }
 */
 /* 
    @Test
    public void checkEquals() {
        assertTrue(intSet.equals(intSet));
    }
 */
 /* 
    @Test
    public void checkEmptySetsEqual() {
        var intSet2 = new FakeSet<Integer>();
        assertTrue(intSet.equals(intSet2));
    }
 */
 /* 
    @Test
    public void checkDifferentLengthSetsUnequal() {
        var intSet2 = new FakeSet<Integer>();
        intSet.add(1);
        assertFalse(intSet.equals(intSet2));
    }
 */
 /* 
    @Test
    public void checkDifferentSameSizeSetsUnequal() {
        var intSet2 = new FakeSet<Integer>();
        intSet.add(1);
        intSet2.add(2);
        assertFalse(intSet.equals(intSet2));
    }
 */
 /* 
    @Test
    public void addAll() {
        var list = Arrays.asList(new Integer[]{1,2});
        assertTrue(intSet.addAll(list));
    }
 */
 /* 
    @Test(expected=IllegalArgumentException.class)
    public void addAllTwice() {
        var list = Arrays.asList(new Integer[]{1,2});
        intSet.addAll(list);
        intSet.addAll(list);
    }
 */
 /* 
    @Test
    public void checkAddString() {
        stringSet.add("Test");
    }
 */
 /* 
    @Test(expected = IllegalArgumentException.class)
    public void checkAddStringTwice() {
        String testString = "Test";
        String testString2 = "Test";
        stringSet.add(testString);
        stringSet.add(testString2);
    }
*/
}
