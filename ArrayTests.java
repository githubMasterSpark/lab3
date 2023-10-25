import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReverseInPlace2() {
    int[] input1 = { 3, 6 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 6, 3 }, input1);
	}

  @Test
  public void testReverseInPlace3() {
    int[] input1 = { 3, 6, 9 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 9, 6, 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input1 = {1, 2, 3};
    assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed3() {
    int[] input1 = {4, 5};
    assertArrayEquals(new int[]{5, 4}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAvgWithoutLowest() {
    double[] arr = {1.0, 1.0, 2.0, 4.0};
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(arr), 0);
  }
}
