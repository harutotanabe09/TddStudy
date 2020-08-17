package app.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TddApplicationTests {

	@Test
	void _1を渡すと文字列1返す() {
		// 準備
		Fizzbuzz fizzbuzz = new Fizzbuzz();
		// 実行
		String actual = fizzbuzz.transrate(1);
		// 検証
		assertEquals("1", actual);
	}


	@Test
	void _2を渡すと文字列2返す() {
		// 準備
		Fizzbuzz fizzbuzz = new Fizzbuzz();
		// 実行
		String actual = fizzbuzz.transrate(2);
		// 検証
		assertEquals("2", actual);
	}
}
