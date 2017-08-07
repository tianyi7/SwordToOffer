/**
 * Author: tianyi
 * Time: 2017/8/7
 * Question:一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * Source:剑指Offer
 */
public class JumpFloorII {
    public int JumpFloorII(int target) {
        int result=0;
        if(target==1){
            return 1;
        }

        else{
            while(target>1){
                result+=JumpFloorII(target-1);
                target--;
            }
        }
        return result+1;

    }
}
