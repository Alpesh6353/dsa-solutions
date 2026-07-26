class Solution {
    public int reverse(int x) {
        long rd = 0;
        int ld;
        while (x != 0) {
            ld = x % 10;
            rd = (rd * 10) + ld;
            if (rd > Integer.MAX_VALUE || rd < Integer.MIN_VALUE) {
                return 0;
            }
            x /= 10;
        }
        return (int) rd;
    }
}
