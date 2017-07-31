/**
 * Author: tianyi
 * Time: 2017/7/31
 * Question:（这道题太简单就过了总感觉有啥问题）
 * 请实现一个函数，
 * 将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.
 * 则经过替换之后的字符串为We%20Are%20Happy。
 * Source:剑指offer
 */
public class ReplaceSpace {
    public String replaceSpace(StringBuffer str) {
        String strs=str.toString();
        String newstr=strs.replace(" ","%20");
        return newstr;
    }
}
