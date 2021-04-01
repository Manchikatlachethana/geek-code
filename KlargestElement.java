#Given an array of N positive integers, print k largest elements from the array. 

/*
  
 Input:
N = 5, k = 2
arr[] = {12,5,787,1,23}
Output: 787 23
Explanation: First largest element inthe array is 787 and the second largest is 23.
-->The function kLargest() that takes the array, N and K as input parameters and returns a list of k largest element in descending order.
 */

import java.util.*;
import java.io.*;


class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            int arr[] = new int[n];
            for(int i = 0; i<n; ++i)
                arr[i] = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> list = ob.kLargest(arr, n, k);
            for(int i = 0; i<list.size(); i++)
                System.out.print(list.get(i) + " ");
            System.out.println();
            t--;
        }
    }
}

class Solution
{
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        Arrays.sort(arr);
        ArrayList<Integer> klist=new ArrayList<Integer>();
        for(int i=1;i<=k;i++){
            klist.add(arr[n-i]);
        }
        
    return klist;
    }
}
