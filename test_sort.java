import org.junit.*;

public class test_sort {
    @Test
    public void testBubble(){
        int [] arr = {5, 3, 8, 6, 2};
        int [] test_arr = {2, 3, 5, 6, 8};
        sort.bubbleSort(arr);
        Assert.assertArrayEquals(test_arr, arr);
    }

    @Test
    public void testMerge(){
        int [] arr = {10, 5, 2, 1, 8};
        int [] test_arr = {1, 2, 5, 8, 10};
        int [] sort_arr = sort.mergeSort(arr);
        Assert.assertArrayEquals(test_arr, sort_arr);
    }

    @Test
    public void testQuick(){
        int [] arr = {9, 7, 3, 6, 28};
        int [] test_arr = {3, 6, 7, 9, 28};
        sort.quickSort(arr, 0, arr.length - 1);
        Assert.assertArrayEquals(test_arr, arr);
    }

}
