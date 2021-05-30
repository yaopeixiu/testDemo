package Algorith; /**
 * DNA序列由一系列核苷酸组成，缩写为“a”、“C”、“G”和“T”。
 * 例如，“ACGAATTCCG”是一个DNA序列。
 * 在研究DNA时，识别DNA中的重复序列是很有用的。
 * 给定一个代表DNA序列的字符串s，返回在DNA分子中出现多次的所有10个字母长的序列（子字符串）。你可以按任何顺序返回答案。
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindRepeatedDnaSequences {
    public static List<String> findRepeatedDnaSequences(String s) {
        Set<String> strList = new HashSet<>();
        Set<String> query = new HashSet<>();
//        如果曾出现过就添加到输出集合strList中
        for (int i=0; i<s.length()-10+1; i++){
            if (query.contains(s.substring(i,i+10))){
                strList.add(s.substring(i, i+10));
            }else {
                query.add(s.substring(i,i+10));
            }
//            for (int k=i,j=i+10; j<s.length(); k++,j++){
//                if (s.substring(i,i+10).equals(s.substring(k+1, j+1))){
//                    strList.add(s.substring(i,i+10));
//                }
//            }
        }
        return new ArrayList<>(strList);
    }

    public static void main(String[] args) {
        System.out.println(findRepeatedDnaSequences("AAAAAAAAAAAA"));
    }
}
