class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==0 || num==1){
            return true;
        }
        int start = 2;
        int end = num;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (Math.pow(mid, 2) == num) {
                return true;
            } else if (Math.pow(mid, 2) < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
