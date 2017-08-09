/**
 * Author: tianyi
 * Time: 2017/8/9
 * Question:输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * Source:剑指Offer
 */
public class NumberOf1 {
    public int NumberOf1(int n) {
        int count = 0;
        String str = Integer.toBinaryString(n);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                count++;
            }
        }

        return count;
    }
}
