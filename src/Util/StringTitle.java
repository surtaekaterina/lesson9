package Util;

import com.itacademy.service.*;

public class StringTitle implements CharSequence {

	private char[] chars;


	public StringTitle(String str) {
		this.chars = str.toCharArray();
	}

	public StringTitle(char[] a) {
		this.chars = a;
	}


	@Override
	public int length() {
		// TODO Auto-generated method stub
		return chars.length;
	}

	@Override
	public char charAt(int index) {
		// TODO Auto-generated method stub
		return chars[index];
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		int length = end - start;
		char[] result = new char[length];
		for (int i = start; i <= end; i++) {
			int k = 0;
			result[k] = chars[i];
			k++;
		}
		return new String(result);
	}

	public String toString() {
		return new String(chars);
	}

}
