package com.java0tutor.string.pattern.task1;

import java.util.regex.Pattern;

public class Task1 {

	// Работа с регулярными выражениями (Pattern, Matcher). Задание 1:
	// Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее
	// выполнять с текстом три различных операции:
	// отсортировать абзацы по количеству предложений;
	// в каждом предложении отсортировать слова по длине;
	// отсортировать лексемы в предложении по убыванию количества вхождений
	// заданного символа, а в случае равенства – по алфавиту.

	private String str;

	public Task1() {

	}

	public Task1(String str) {
		super();
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public String sortParagraphs() {
		String[] array;
		String result;

		array = initArrayOfParagraphs();
		array = sortSentences(array);
		result = createString(array, "\n", "");
		return result;
	}

	public String sortWordsInSentences() {
		String[] ArrayOfSentences;
		String[] arrayOfParagraphs;
		String[] arrayWords;
		String result;

		arrayOfParagraphs = initArrayOfParagraphs();
		for (int m = 0; m < arrayOfParagraphs.length; m++) {
			ArrayOfSentences = initArrayOfSentences(arrayOfParagraphs[m]);
			for (int k = 0; k < ArrayOfSentences.length; k++) {
				arrayWords = initArrayOfWords(ArrayOfSentences[k]);
				arrayWords = sortWords(arrayWords);
				result = createString(arrayWords, " ", ". ");
				ArrayOfSentences[k] = result;
			}
			result = createString(ArrayOfSentences, "", "\n");
			arrayOfParagraphs[m] = result;
		}
		result = createString(arrayOfParagraphs, "", "");
		return result;
	}

	public String sortLexemesInSentences(char c) {
		String[] ArrayOfSentences;
		String[] arrayOfParagraphs;
		String[] arrayWords;
		String result;

		arrayOfParagraphs = initArrayOfParagraphs();
		for (int m = 0; m < arrayOfParagraphs.length; m++) {
			ArrayOfSentences = initArrayOfSentences(arrayOfParagraphs[m]);
			for (int k = 0; k < ArrayOfSentences.length; k++) {
				arrayWords = initArrayOfWords(ArrayOfSentences[k]);
				arrayWords = sortLexemes(arrayWords, c);
				result = createString(arrayWords, " ", ". ");
				ArrayOfSentences[k] = result;
			}
			result = createString(ArrayOfSentences, "", "\n");
			arrayOfParagraphs[m] = result;
		}
		result = createString(arrayOfParagraphs, "", "");
		return result;
	}

	private String[] sortSentences(String[] array) {
		int count;
		int max;
		String tmp;

		count = 0;
		max = 0;
		for (int i = 0; i < array.length; i++) {
			max = countOfSentences(array[i]);
			count = i;
			for (int j = i + 1; j < array.length; j++) {
				if (countOfSentences(array[j]) < max) {
					max = countOfSentences(array[j]);
					count = j;
				}
			}
			tmp = array[i];
			array[i] = array[count];
			array[count] = tmp;
		}
		return array;
	}

	private String[] sortWords(String[] array) {
		int count;
		int max;
		String tmp;

		count = 0;
		max = 0;
		for (int i = 0; i < array.length; i++) {
			max = lengthOfWord(array[i]);
			count = i;
			for (int j = i + 1; j < array.length; j++) {
				if (lengthOfWord(array[j]) < max) {
					max = lengthOfWord(array[j]);
					count = j;
				}
			}
			tmp = array[i];
			array[i] = array[count];
			array[count] = tmp;
		}
		return array;
	}

	private String[] sortLexemes(String[] array, char c) {
		int count;
		int max;
		String tmp;

		count = 0;
		max = 0;
		for (int i = 0; i < array.length; i++) {
			max = countOfSymbolInWord(array[i], c);
			count = i;
			for (int j = i + 1; j < array.length; j++) {
				if (countOfSymbolInWord(array[j], c) > max) {
					max = countOfSymbolInWord(array[j], c);
					count = j;
				}
			}
			tmp = array[i];
			array[i] = array[count];
			array[count] = tmp;
		}
		array = sortWordsByAlpha(array, c);
		return array;
	}

	private String[] sortWordsByAlpha(String[] array, char c) {
		int count;
		int max;
		String tmp;
		int x;

		count = 0;
		max = 0;
		x = 0;
		for (int i = 0; i < array.length; i++) {
			max = countOfSymbolInWord(array[i], c);
			count = i;
			for (int j = i + 1; j < array.length; j++) {
				if (countOfSymbolInWord(array[j], c) == max) {
					max = countOfSymbolInWord(array[j], c);
					while (x < array[j].length() && x < array[i].length()) {
						if ((int) array[i].charAt(x) - (int) array[j].charAt(x) < 0) {
							count = i;
							x = 0;
							break;
						} else if ((int) array[i].charAt(x) - (int) array[j].charAt(x) > 0) {
							count = j;
							x = 0;
							break;
						} else if (x < array[j].length() && x < array[i].length()) {
							x++;
						} else {
							count = i;
							break;
						}
					}
				}
			}
			tmp = array[i];
			array[i] = array[count];
			array[count] = tmp;
		}
		return array;
	}

	private String createString(String[] array, String s1, String s2) {
		String s;
		s = "";
		for (int i = 0; i < array.length - 1; i++) {
			s = s + array[i] + s1;
		}
		s = s + array[array.length - 1] + s2;
		return s;
	}

	private String[] initArrayOfParagraphs() {
		String[] array;
		Pattern pattern = Pattern.compile("\n|\t");
		array = pattern.split(str);
		return array;
	}

	private String[] initArrayOfSentences(String s) {
		String[] array;

		Pattern pattern = Pattern.compile("\\.*\\!*\\?*[.!?;]\\s*");
		array = pattern.split(s);
		return array;
	}

	private String[] initArrayOfWords(String s) {
		String[] array;

		Pattern pattern = Pattern.compile("\\.*\\!*\\?*[.!?; ]\\s*");
		array = pattern.split(s);
		return array;
	}

	private int lengthOfWord(String s) {
		int count;

		count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				count++;
			}
		}
		return count;
	}

	private int countOfSymbolInWord(String s, char c) {
		int count;

		count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}

	private int countOfSentences(String str) {
		int count;

		count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 33 || str.charAt(i) == 46 || str.charAt(i) == 63) {
				while (i < str.length() && (str.charAt(i) == 33 || str.charAt(i) == 46 || str.charAt(i) == 63)) {
					i++;
				}
				count++;
			}
		}
		return count;
	}
}
