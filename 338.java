class Solution {
    public int[] countBits(int num) {
        int[] arr = new int[num+1];
        for(int i=0 ; i<num+1 ; i++)
        arr[i] = Integer.bitCount(i);
        
        return arr;
    }
}