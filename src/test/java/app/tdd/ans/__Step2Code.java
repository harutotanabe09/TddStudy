package app.tdd.ans;

import app.tdd.Fizzbuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class __Step2Code {

    @Test
    void _1を渡すと文字列1返す() {
        // 準備
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        // 実行
        String actual = fizzbuzz.transrate(1);
        // 検証
        assertEquals("1", actual);
    }
}
