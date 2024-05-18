/*
给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。

回文数
是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

例如，121 是回文，而 123 不是。
*/
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0||x%10==0&&x!=0){//x小于0 或x是10的整数倍 则一定不是回文数
            return false;
        }
        int num=0;
        while(x>num){//x<=num时说明有一半数据被处理 即可跳出循环
            int ge=x%10;
            num=num*10+ge;
            x=x/10;
        }
        return x==num||x==num/10;
    }

}
