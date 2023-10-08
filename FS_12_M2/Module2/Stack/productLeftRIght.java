package Module2.Stack;

import java.util.Scanner;
import java.util.Stack;

public class productLeftRIght {
     static int MAX = 1000;
     
   
    static int[] nextGreaterInLeft(int []a,int n)
    {
        int []left_index = new int[MAX];
        Stack<Integer> s = new Stack<Integer>();
     
        for (int i = n - 1; i >= 0; i--)
        {
            while (s.size() != 0 && a[i] > a[s.peek() - 1])
            {
                int r = s.peek();
                s.pop();
    
                left_index[r - 1] = i + 1;
            }   
            s.push(i + 1);
        }
        return left_index;
    }
    static int[] nextGreaterInRight(int []a,int n)
    {
        int []right_index = new int[MAX];
        Stack<Integer> s = new Stack<Integer>();
        for (int i = 0; i < n; ++i) {
     
            while (s.size() != 0 &&
                        a[i] > a[s.peek() - 1])
            {
                int r = s.peek();
                s.pop();
                right_index[r - 1] = i + 1;
            }
            s.push(i + 1);
        }
        return right_index;
    }
    
    static int LRProduct(int []arr, int n)
    {
         
        
        int []left = nextGreaterInLeft(arr, n);
     
        int []right = nextGreaterInRight(arr, n);
        int ans = -1;
        for (int i = 1; i <= n; i++)
        {
            ans = Math.max(ans, left[i] * right[i]);
        }
     
        return ans;
    }
     
    public static void main(String args[])
    { Scanner scn= new Scanner(System.in);
         int n=scn.nextInt();
        int []arr = new int[n];
         for(int i=0; i<n;i++){
             arr[i]=scn.nextInt();
         }
        System.out.print(LRProduct(arr, n));
    }
}
