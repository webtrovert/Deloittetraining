package iodemos;

import java.util.StringTokenizer;

public class StringTokenDemo {

	public static void main(String[] args) {
		String value = "Lalalalala hmm";
		StringTokenizer tokenizer = new StringTokenizer(value); //count number of words using Tokenizer
		System.out.println(tokenizer.countTokens());

	}

}
