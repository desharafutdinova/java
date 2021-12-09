package Questions;

public class Q223 {
    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4};
        int i = 0;

        do{
            System.out.println(arr[i] + " ");
            i++;
        }
        while(i<arr.length+1);
    }
}

/*
What is the result?
A. 1 2 3 4 followed by an ArrayIndexOutOfBoundsException
B. 1 2 3
C. 1 2 3 4
D. Compilation fails.

 */

// Answer is A

/*

Explanation:
since the condition inside while is (i < arr.length + 1), once i reaches the last index which is 3, prints the last element, gets increased by 1, checks the condition and gets to the next loop in will get out of bound, because you array doesn't have index = 4;

 */