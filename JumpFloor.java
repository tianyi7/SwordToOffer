/**
 * Author: tianyi
 * Time: 2017/8/7
 * Question:一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * Source:剑指Offer
 */
public class JumpFloor {
    public int JumpFloor(int target) {
        if(target==1){
            return 1;
        }
        if(target==2){
            return 2;
        }
        else{
            return JumpFloor(target-1)+JumpFloor(target-2);
        }


    }
}
