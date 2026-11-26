class Solution {
    public boolean canAliceWin(int n) {

        int turn = 10;

        while (n >= turn) {
            n = n - turn;
            turn--;

            if (n < turn) {
                return true;
            }

            n = n - turn;
            turn--;
        }

        return false;
    }
}