package app.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Step5Code {

    @Test
    void _5を渡すと文字列Buzz返す() {
        // 準備
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        // 実行
        String actual = fizzbuzz.transrate(5);
        // 検証
        assertEquals("Buzz", actual);
    }
}
