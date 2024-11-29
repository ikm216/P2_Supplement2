import org.junit.*;

public class test_sort {
    @Test
    public void testBubble(){
        int [] arr = {5, 3, 8, 6, 2};
        int [] test_arr = {2, 3, 5, 6, 8};
        sort.bubbleSort(arr);
        Assert.assertArrayEquals(test_arr, arr);
    }
    
}
