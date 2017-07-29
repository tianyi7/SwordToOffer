/**
 * Author: tianyi
 * Time: 2017/7/29
 * Question:
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * Source:剑指offer
 */
public class FindInArray {
    public boolean Find(int target, int [][] array) {
        int m=array.length;
        int n=array[0].length;
        int i=0;
        int j=n-1;
        while(0<=i&&i<m&&0<=j&&j<n){
            if(array[i][j]>target){
                j--;
            }
            else if(array[i][j]<target){
                i++;
            }
            else if(array[i][j]==target){

                return true;

            }
        }
        return false;
    }
}
