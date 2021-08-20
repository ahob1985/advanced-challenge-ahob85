
/**
 * Write a description of class AdvancedChallenge here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AdvancedChallenge
{
    /**
     * Given a non-empty array, return true if there is a place to split the 
     * array so that the sum of the numbers on one side is equal to the sum 
     * of the numbers on the other side.
     * 
     * Examples:
     * canBalance([1, 1, 1, 2, 1]) → true
     * canBalance([2, 1, 1, 2, 1]) → false
     * canBalance([10, 10]) → true
     */
    public static boolean canBalance(int[] nums){

    }

    /**
     * Consider the leftmost and righmost appearances of some value in an 
     * array. We'll say that the "span" is the number of elements between the 
     * two inclusive. A single value has a span of 1. Returns the largest 
     * span found in the given array.
     * 
     * Examples:
     * maxSpan([1, 2, 1, 1, 3]) → 4
     * maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
     * maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
     */
    public static int maxSpan(int[] nums) {

    }

    /**
     * Given two arrays of numbers sorted in increasing order, outer and 
     * inner, return true if all of the numbers in inner appear in outer. The 
     * best solution makes only a single "linear" pass of both arrays, taking 
     * advantage of the fact that both arrays are already in sorted order.
     * 
     * Examples:
     * linearIn([1, 2, 4, 6], [2, 4]) → true
     * linearIn([1, 2, 4, 6], [2, 3, 4]) → false
     * linearIn([1, 2, 4, 4, 6], [2, 4]) → true
     */
    public static boolean linearIn(int[] outer, int[] inner){

    }

    /**
     * Return an array that contains exactly the same numbers as the given 
     * array, but rearranged so that every 4 is immediately followed by a 5. 
     * Do not move the 4's, but every other number may move. The array 
     * contains the same number of 4's and 5's, and every 4 has a number 
     * after it that is not a 4. 5's may appear anywhere in the original 
     * array.
     * 
     * Examples:
     * fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
     * fix45([1, 4, 1, 5]) → [1, 4, 5, 1]
     * fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]
     */
    public static int[] fix45(int[] nums){

    }

    /**
     * Given n>=0, return an array length n*n with the following pattern, 
     * shown here for n=3: 
     * {0, 0, 1,   0, 2, 1,   3, 2, 1} (spaces added to show the 3 groups).
     * 
     * Examples:
     * squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
     * squareUp(2) → [0, 1, 2, 1]
     * squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
     */
    public static int[] squareUp(int n){

    }
}
