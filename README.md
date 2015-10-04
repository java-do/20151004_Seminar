Java DOでしょう #02
====

札幌, 2015-10-04

[Connpass - Java DOでしょう #02](http://javado.connpass.com/event/20011/)

## ハンズオンの準備

### メインハンズオン（wekaによる機械学習）

1. http://john-smith.github.io/weka.html を開く
2. "wekaのダウンロード" を行う（3.7.13）

### サブハンズオン（lombok）

1. https://github.com/java-do/20151004_seminar を表示し、画面右下の “Download Zip” からzipダウンロードして展開する
2. **【Eclipseの人だけ】** [Project Lombok](https://projectlombok.org/) から lombok.jar 1.16.6 をダウンロードしてインストール （インストール方法：[yyoshikaw(2014) Lombok -Qiita](http://qiita.com/yyoshikaw/items/32a96332cc12854ca7a3)）
3. 1で展開した 20151004_seminar フォルダの中の lombok20151004 プロジェクトをIDEで開く
  - 【NetBeans】
    - ファイル ＞ プロジェクトを開く で lombok20151004 を選択
    - 読み込まれたプロジェクトを右クリック ＞ ビルド
    - いくつかのクラスに x がつくかも知れないが、全てのファイルについていなければOK
  - 【Eclipse】
    - ファイル ＞ インポート(import) ＞ Maven ＞ 既存のMavenプロジェクト（Existing Maven Projects） で lombok20151004 を選択
    - 読み込まれたプロジェクトを右クリック ＞ Maven ＞ プロジェクトの更新（Update Project）

