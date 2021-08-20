
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
        int leftSum = 0;
        for(int i = 0; i < nums.length; i++) {
            leftSum += nums[i];
            int rightSum = 0;
            for(int j = i + 1; j < nums.length; j++) {
                rightSum += nums[j];
            }
            if(leftSum == rightSum) {
                return true;
            }
        }
        return false;
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
        int max = 0;
        for(int i = 0; i < nums.length; i++) {
            int span = 1;
            for(int j = i; j < nums.length; j++) {
                if(nums[i] == nums[j] && span > max) {
                    max = span;
                }
                span++;
            }
        }
        return max;
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
        if(inner.length == 0) {
            return true;
        }
        int outerID = 0;
        int innerID = 0;
        while(outerID < outer.length) {
            if(outer[outerID] == inner[innerID]) {
                innerID++;
                if(innerID == inner.length) {
                    return true;
                }
            }
            outerID++;
        }
        return false;
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
        int[] fix = nums.clone();
        for(int i = fix.length - 1; i > 0; i--) {
            if(fix[i] == 4 && fix[i + 1] != 5) {
                boolean foundFive = false;
                for(int j = i - 1; j >= 0 && !foundFive; j--) {
                    if(fix[j] == 5) {
                        int five = fix[j];
                        fix[j] = fix[i + 1];
                        fix[i + 1] = five;
                        foundFive = true;
                    }
                }
            } else if(fix[i] == 5 && fix[i - 1] != 4) {
                boolean foundFour = false;
                for(int j = i - 1; j >= 0 && !foundFour; j--) {
                    if(fix[j] == 4 && fix[j + 1] != 5) {
                        int five = fix[i];
                        fix[i] = fix[j + 1];
                        fix[j + 1] = five;
                        foundFour = true;
                    }
                }
            }
        }
        return fix;
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
        int mod = n + 1;
        int current = 1;
        int[] retArray = new int[n * n];
        for(int i = retArray.length - 1; i >= 0; i--) {
            if(current <= mod) {
                retArray[i] = current % mod;
            } else {
                retArray[i] = 0;
            }
            current++;
            if(current > n) {
                current = 1;
                mod--;
            }
        }
        return retArray;
    }
}