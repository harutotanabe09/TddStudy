package app.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Step4Code {

	@Test
	void _3を渡すと文字列Fizz返す() {
		// 準備
		Fizzbuzz fizzbuzz = new Fizzbuzz();
		// 実行
		String actual = fizzbuzz.transrate(3);
		// 検証
		assertEquals("Fizz", actual);
	}
}
