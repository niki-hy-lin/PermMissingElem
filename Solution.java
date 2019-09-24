// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        int N = A.length;
        int smallest = 1;//given info
        int largest = N + 1;//given info
        int result = 0;//the missing element
        
        int arraySum=(N+1)*(N+2)/2;//this is converted from sum of consecutive integer: n*(n+1)/2, when in range of [1, n]
        
        
        for (int i=0; i<N; i++){
            
            arraySum = arraySum - A[i];//we get a new arraySum everytime we minus one element
                
        }
        
        result=arraySum;//After substracting all elements from the arraySum, we get the result.
        
        return result;
        
        
    }
    
}

