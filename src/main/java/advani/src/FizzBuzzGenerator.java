/***
Created by Javier Advani
on May 16, 2018
***/
package advani.src;

public class FizzBuzzGenerator {

	public boolean isASpecialWord = false;
	public String result = "";

	public String checkFizzBuzzNumbers(int numberToCheck, SpecialWords myWord) {
		return numberToCheck % myWord.getAssociatedNumber() == 0 ? myWord.toString() : Integer.toString(numberToCheck);
	}

	public String printListOfNumbers(int listLimit) {
		for (int i = 1; i <= listLimit; i++) {
			checkAllSpecialWordsForGivenNumber(listLimit, i);
			if (!isASpecialWord) {
				result = result + (Integer.toString(i));
				addSeparatorBetweenNumbers(listLimit, i);
			}
			isASpecialWord = false;
		}
		return result;
	}

	
	public void checkAllSpecialWordsForGivenNumber(int listLimit, int numberFromList) {
		String localResult = "";
		for (SpecialWords word : SpecialWords.values()) {
			if (checkFizzBuzzNumbers(numberFromList, word) == word.toString()) {
				isASpecialWord = true;
				localResult = localResult + (checkFizzBuzzNumbers(numberFromList, word));
			}
		}
		result = result + localResult;
		if (localResult != "") {
			addSeparatorBetweenNumbers(listLimit, numberFromList);
		}
	}

	private void addSeparatorBetweenNumbers(int listLimit, int numberFromList) {
		if (numberFromList < listLimit) {
			result = result + "-";
		}
	}
}