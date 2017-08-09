/**
 * Author: tianyi
 * Time: 2017/8/9
 * Question:(代码写的极其糟烂，但是还是过了)
 * 输入一个整数数组，
 * 实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * Source:剑指Offer
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class ReOrderArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for (int i = 0; i < n; i++) {
            array[i]=sc.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(array[i]%2!=0){
                set.add(i);
                list.add(array[i]);

            }

        }
        for (int i = 0; i < n; i++) {
            if(!set.contains(i)){
                list.add(array[i]);
            }
        }
        for (int i = 0; i < n; i++) {
            array[i]=list.get(i);
        }
        System.out.println(array);



    }
}
