### TDDとは

動作するきれないコード

ふつうのプログラマーが着実に動作するコードに向かっていくための手法。
「動作する」「きれいな」を分割して動かす。

### TDDのサイクル

TDDは、要するに以下を行うサイクル

1.目標を考える
2.目標を示すテストを書く
3.テストを実行して失敗させる（Red）
4.目的のコードを書く（Red）
5.テストを成功させる（Green）
6.リファクタリングする（Refactor）
7.1-6を繰り返す

### TDDのポイント

2.目標を示すテストを書く
- 10個のTODOがあったら、10個のテストコードを書くというわけではない。
  1つ1つタスクを潰す。テストの容易性が高いものから書く。

### デモ

FizzBuzz問題

1〜100までの数をプリントするプログラムを書け。
ただし、3で割り切れるときは「Fizz」をプリント
5で割り切れるときは「Buzz」をプリント
両方で割り切れるときは「FizzBuzz」をプリントするようにすること。

### まずは何から？

まずは、TODOを洗い出す。

- 1〜100までの数
- プリントする
- 3の倍数は「Fizz」
- 5の倍数は「Buzz」
- 3と5の両方の倍数は「FizzBuzz」

### 優先順位を考える

まずは、TODOを洗い出す。

優先度高；テスト容易性高

- 数を文字列に変換する
- 3の倍数は「Fizz」
- 5の倍数は「Buzz」
- 3と5の両方の倍数は「FizzBuzz」

優先度低；テスト容易性低い

- 1〜100までの数
　→　ループまでは面倒。1〜Nまでの最低ケースにしよう。優先度低にする。
- プリントする　
　→　プリントをテストする？言語によるが面倒。

### テストメソッドを書く

- 母国語で書くのがおすすめ（オフシュアで開発しているなどを例外を除く）
  テストコードから、動作するドキュメントであってほしい

- 検証→実行→準備で書く。ゴールから書くことで軸をぶらさない。手戻りの発生の軽減。

- 手が止まった場合（できると思ったのができない）、リスクが軽減できる
  抽象度を下げて書く

- 最短時間でかく。ひどい茶番を書く。 -> 仮実装してGreenにする

- 三角測量でまともにしていく。任意のテストでアサートを縦に並べる。アサーションを書く。
  おすすめは、アサーションを１メソッド１つにする