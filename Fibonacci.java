/**
 * Author: tianyi
 * Time: 2017/8/7
 * Question:大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 * Source:剑指Offer
 */
public class Fibonacci {
    public int Fibonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
        else{
            return Fibonacci(n-2)+Fibonacci(n-1);
        }

    }
}
