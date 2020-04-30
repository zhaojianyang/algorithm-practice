package com.zjy.algorithm.hash;

import java.util.Arrays;

/**
 * @author: zjy
 * @date: 2020/4/30 16:08
 */
public class IsAnagram {

    /**
     *  242. 有效的字母异位词
     * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
     *
     * 示例 1:
     *
     * 输入: s = "anagram", t = "nagaram"
     * 输出: true
     * 示例 2:
     *
     * 输入: s = "rat", t = "car"
     * 输出: false
     * 说明:
     * 你可以假设字符串只包含小写字母。
     * @param args
     */
    public static void main(String[] args) {

        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s,t));
    }


    public static boolean isAnagram(String s, String t) {
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);
        return Arrays.equals(chars,chars1);
    }
}
