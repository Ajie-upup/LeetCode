package code1_To100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ajie
 * @date 2023/3/8
 * @description: https://leetcode.cn/problems/word-ladder-ii/description/
 */
public class code07_单词接龙 {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) {
            return new ArrayList<>();
        }
        return null;
    }
}
