package com.njit.sfTry;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SortTest {
    /**
     * 直接插入排序
     * @param a
     */
    public static void DirectInsertSort(int[] a){
        int length = a.length;
        int i,j;
        int t;
        for (i=1;i<length;i++)
        {
            t = a[i];
            for(j=i;j>=1&&t<a[j-1];j--)
            {
                a[j] = a[j-1];
            }
            a[j] = t;
        }
    }

    /**
     * 冒泡排序demo
     * @param a
     */
    public static void BubbleSort(int[] a){
        int length = a.length;
        int i,t;
        for(i = 0;i<length;i++)
        {
            for (int j = 0;j<length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    t=a[j+1];
                    a[j+1] = a[j];
                    a[j] = t;
                }
            }
        }
    }

    /**
     * 快速排序Demo
     * @param nums
     * @param low
     * @param high
     */
    public static void QuickSort(int[] nums, int low, int high)
    {
        if (low < high) {
            int middle = getMiddle(nums, low, high);
            //对左子序列进行排序
            QuickSort(nums, low, middle - 1);
            //对右子序列进行排序
            QuickSort(nums, middle + 1, high);
        }
    }

    private static int getMiddle(int[] nums, int low, int high) {
        //当前数组的第一个元素作为中轴（基准）
        int temp = nums[low];
        while (low < high) {
            //这里temp <= nums[high]中等号的情况相当于数组中出现了两个相等的数字，循环比较依然能够继续
            while (low < high && temp <= nums[high]) {
                high--;
            }
            nums[low] = nums[high];
            System.out.println();
            while (low < high && temp >= nums[low]) {
                low++;
            }
            nums[high] = nums[low];
            System.out.println();
        }
        nums[low] = temp;
        return low;
    }

    public static void main(String[] args) {
        int[] a = {5,7,3,2,8,6,9};

//        SortTest.DirectInsertSort(a);
//        SortTest.BubbleSort(a);
        SortTest.QuickSort(a,0,a.length-1);
        for (int x: a) {
            System.out.print(x);
        }
        System.out.println();
    }
}
