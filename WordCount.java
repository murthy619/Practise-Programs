package com.practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class WordCount {

	public static void main(String[] args) {
	String sentence = "program This is simple Java program";
	Map<String, Integer> wordCount = new HashMap<String,Integer>();
	String[] words = sentence.split(" ");
	for(String word:words){
		if(wordCount.containsKey(word)){
			wordCount.put(word, wordCount.get(word)+1);
		}
		else
		{
			wordCount.put(word, 1);
		}
	}

for(Entry<String, Integer> count : wordCount.entrySet()){
	System.out.println(count.getKey()+" "+count.getValue());

}


	}

}
