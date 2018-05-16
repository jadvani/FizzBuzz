/***
Created by Javier Advani
on May 16, 2018
***/
package advani.src;

public enum SpecialWords {

	FIZZ(3), BUZZ(5);

	private int myWordNumber;

	SpecialWords(int number) {
		this.myWordNumber = number;
	}

	public int getAssociatedNumber() {
		return myWordNumber;
	}

}
