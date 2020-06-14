package LeetCode.thirty.day.covid.LeetCodeChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author ucguy4u
 *
 *         Given an array of strings, group anagrams together. Example:
 * 
 *         Input: ["eat", "tea", "tan", "ate", "nat", "bat"], Output: [
 *         ["ate","eat","tea"], ["nat","tan"], ["bat"] ]
 * 
 *         Note: All inputs will be in lowercase. The order of your output does
 *         not matter.
 * 
 */
public class GroupAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strs[] = { "eat", "tea", "tan", "ate", "nat", "bat" };
		GroupAnagram obj = new GroupAnagram();
		List<List<String>> result = obj.groupAnagrams(strs);

		for (List<String> l1 : result) {
			for (String n : l1) {
				System.out.print(n + " ");
			}

			System.out.println();
		}

	}

	public List<List<String>> groupAnagrams(String[] strs) {

		Map<String, List<String>> map = new HashMap();
		for (String s : strs) {
			int[] m = new int[26];
			for (char c : s.toCharArray())
				m[c - 'a']++;
			String key = Arrays.toString(m);
			map.putIfAbsent(key, new ArrayList());
			map.get(key).add(s);
		}
		return new ArrayList(map.values());
	}
}
