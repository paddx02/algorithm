package com.algorithm.test;

import com.algorithm.Sort;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by liuxp on 15/12/26.
 */

public class SortTest {
    private Sort sort;

    @Before
    public void setUp(){
        sort = new Sort();
    }

    @Test
    public void testInsertSort(){
        int[] arr = {11,14,15,12, 10, 16, 16, 17, 13, 14} ;
        sort.insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
