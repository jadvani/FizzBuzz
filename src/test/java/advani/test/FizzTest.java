/***
Created by Javier Advani
on May 16, 2018
***/
package advani.test;

import org.junit.Assert;
import org.junit.Test;

import advani.src.FizzBuzzGenerator;
import advani.src.SpecialWords;

public class FizzTest {

	private static final String LOCALSEPARATOR = "-";

	@Test
	public void isThreeAFizz() {
		FizzBuzzGenerator fizzBuzzChecker = new FizzBuzzGenerator();

		Assert.assertEquals("FIZZ", fizzBuzzChecker.checkFizzBuzzNumbers(3, SpecialWords.FIZZ));
	}

	@Test
	public void isThreeHundredThreeAFizz() {
		FizzBuzzGenerator fizzBuzzChecker = new FizzBuzzGenerator();
		Assert.assertEquals("FIZZ", fizzBuzzChecker.checkFizzBuzzNumbers(303, SpecialWords.FIZZ));
	}

	@Test
	public void isFiveAFizz() {
		FizzBuzzGenerator fizzBuzzChecker = new FizzBuzzGenerator();
		Assert.assertNotEquals("FIZZ", fizzBuzzChecker.checkFizzBuzzNumbers(5, SpecialWords.FIZZ));
	}

	@Test
	public void isFiveABuzz() {
		FizzBuzzGenerator fizzBuzzChecker = new FizzBuzzGenerator();
		Assert.assertEquals("BUZZ", fizzBuzzChecker.checkFizzBuzzNumbers(5, SpecialWords.BUZZ));
	}

	@Test
	public void isFiveAWhizz() {
		FizzBuzzGenerator fizzBuzzChecker = new FizzBuzzGenerator();
		Assert.assertNotEquals("WHIZZ", fizzBuzzChecker.checkFizzBuzzNumbers(5, SpecialWords.WHIZZ));
	}

	@Test
	public void isSevenAWhizz() {
		FizzBuzzGenerator fizzBuzzChecker = new FizzBuzzGenerator();
		Assert.assertEquals("WHIZZ", fizzBuzzChecker.checkFizzBuzzNumbers(7, SpecialWords.WHIZZ));
	}

	@Test
	public void isFifteenFizzBuzzAndLastNumber() {
		FizzBuzzGenerator fizzBuzzChecker = new FizzBuzzGenerator();
		fizzBuzzChecker.checkAllSpecialWordsForGivenNumber(15, 15);
		Assert.assertEquals("FIZZBUZZ", fizzBuzzChecker.result);
	}

	@Test
	public void isFifteenFizzBuzz() {
		FizzBuzzGenerator fizzBuzzChecker = new FizzBuzzGenerator();
		fizzBuzzChecker.checkAllSpecialWordsForGivenNumber(150, 15);
		Assert.assertEquals("FIZZBUZZ-", fizzBuzzChecker.result);
	}

	@Test
	public void is25Buzz() {
		FizzBuzzGenerator fizzBuzzChecker = new FizzBuzzGenerator();
		Assert.assertEquals("BUZZ", fizzBuzzChecker.checkFizzBuzzNumbers(25, SpecialWords.BUZZ));
	}

	// @Test
	// public void print33List() {
	// FizzBuzzGenerator fizzBuzzChecker = new FizzBuzzGenerator();
	// Assert.assertEquals("1" + LOCALSEPARATOR + "2" + LOCALSEPARATOR + "FIZZ" +
	// LOCALSEPARATOR + "4" + LOCALSEPARATOR
	// + "BUZZ" + LOCALSEPARATOR + "FIZZ" + LOCALSEPARATOR + "7" + LOCALSEPARATOR +
	// "8" + LOCALSEPARATOR
	// + "FIZZ" + LOCALSEPARATOR + "BUZZ" + LOCALSEPARATOR + "11" + LOCALSEPARATOR +
	// "FIZZ" + LOCALSEPARATOR
	// + "13" + LOCALSEPARATOR + "14" + LOCALSEPARATOR + "FIZZ" + "BUZZ" +
	// LOCALSEPARATOR + "16"
	// + LOCALSEPARATOR + "17" + LOCALSEPARATOR + "FIZZ" + LOCALSEPARATOR + "19" +
	// LOCALSEPARATOR + "BUZZ"
	// + LOCALSEPARATOR + "FIZZ" + LOCALSEPARATOR + "22" + LOCALSEPARATOR + "23" +
	// LOCALSEPARATOR + "FIZZ"
	// + LOCALSEPARATOR + "BUZZ" + LOCALSEPARATOR + "26" + LOCALSEPARATOR + "FIZZ" +
	// LOCALSEPARATOR + "28"
	// + LOCALSEPARATOR + "29" + LOCALSEPARATOR + "FIZZ" + "BUZZ" + LOCALSEPARATOR +
	// "31" + LOCALSEPARATOR
	// + "32" + LOCALSEPARATOR + "FIZZ", fizzBuzzChecker.printListOfNumbers(33));
	// }

	@Test
	public void print33ListWithWhizz() {
		FizzBuzzGenerator fizzBuzzChecker = new FizzBuzzGenerator();
		Assert.assertEquals("1" + LOCALSEPARATOR + "2" + LOCALSEPARATOR + "FIZZ" + LOCALSEPARATOR + "4" + LOCALSEPARATOR
				+ "BUZZ" + LOCALSEPARATOR + "FIZZ" + LOCALSEPARATOR + "WHIZZ" + LOCALSEPARATOR + "8" + LOCALSEPARATOR
				+ "FIZZ" + LOCALSEPARATOR + "BUZZ" + LOCALSEPARATOR + "11" + LOCALSEPARATOR + "FIZZ" + LOCALSEPARATOR
				+ "13" + LOCALSEPARATOR + "WHIZZ" + LOCALSEPARATOR + "FIZZ" + "BUZZ" + LOCALSEPARATOR + "16"
				+ LOCALSEPARATOR + "17" + LOCALSEPARATOR + "FIZZ" + LOCALSEPARATOR + "19" + LOCALSEPARATOR + "BUZZ"
				+ LOCALSEPARATOR + "FIZZWHIZZ" + LOCALSEPARATOR + "22" + LOCALSEPARATOR + "23" + LOCALSEPARATOR + "FIZZ"
				+ LOCALSEPARATOR + "BUZZ" + LOCALSEPARATOR + "26" + LOCALSEPARATOR + "FIZZ" + LOCALSEPARATOR + "WHIZZ"
				+ LOCALSEPARATOR + "29" + LOCALSEPARATOR + "FIZZ" + "BUZZ" + LOCALSEPARATOR + "31" + LOCALSEPARATOR
				+ "32" + LOCALSEPARATOR + "FIZZ", fizzBuzzChecker.printListOfNumbers(33));
	}

}
