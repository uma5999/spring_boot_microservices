package com.cc.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapForLoops {
	public static void main(String[] args) {

		Map<String, Object> map = new LinkedHashMap<>();
		map.put("one", "hdfc");
		map.put("two", "axis");
		map.put("three", "sbi");
		map.put("four", "kotak");
		map.put("fiev", "RBI");
		map.put("six", "hdfc");

//		for (Entry<String, Object> en : map.entrySet()) {
//			System.out.println(en.getKey() + "--->" + en.getValue());
//		}

		for (String str : map.keySet()) {
			System.out.println(str + "--" + map.get(str));
		}
//
//		map.entrySet().stream().forEach(key -> key.getKey().toString());
//		map.entrySet().stream().forEach(item -> item.getValue());

	}
}
