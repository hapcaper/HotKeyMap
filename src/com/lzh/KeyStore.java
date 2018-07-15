package com.lzh;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ASUS
 * @date 2018/7/15
 */
public class KeyStore implements Serializable {

	final private char chars[] = new char[]{'A', 'B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	final private static Map<Character, Key> charMap = new HashMap<>(26);
	private static KeyStore keyStore;

	private KeyStore() { }

	public static KeyStore getInstance() {
		if (keyStore == null) {
			keyStore = new KeyStore();
			keyStore.init();
		}
		return keyStore;
	}

	/**
	 *  暂时不忘文件里写  每次运行都初始化为0
	 */
	public void init() {

		for (char aChar : chars) {
			charMap.put(aChar, new Key(aChar,0));
		}

	}

	public void addOne(char c) { }

	/**
	 * 吧每个字母做对应的num加上去
	 * @param map 每个字母对应的累计数
	 */
	public void addMany(Map map) {

	}

	public void storeKey(char c) {
		if (charMap.containsKey(c)) {
			charMap.get(c).addOne();
		}
	}

	public Map getKeyStoreData() {
		return charMap;
	}


	class Key implements Serializable{
		Key(char c, int num) {
			this.c = c;
			this.num = num;
		}
		Key() { }

		void addOne() {
			this.num++;
		}

		char c;
		int num;
	}




}

