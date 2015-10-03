package javado.sample.useLombok;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

/**
 * Beanでありがちなボイラープレートを簡略化するLombokアノテーションの基本形
 *
 * <dl>
 * <dt>クラス用のLombokアノテーション</dt>
 * <dd>Slf4j : log という変数でslf4j を利用できるようにする</dd>
 * <dd>AllArgsConstructor : フィールド全てを引数にもつコンストラクタを作成する</dd>
 * <dd>FieldDefaults : フィールドの修飾子を設定する</dd>
 * <dt>DataにまとめられているLombokアノテーション</dt>
 * <dd>RequiredArgsConstructor : final/NonNullなフィールドを引数に持つコンストラクタを作成する</dd>
 * <dd>EqualsAndHashCode : equals, hashcode メソッドを実装する</dd>
 * <dd>Getter : フィールドのGetterを作成する</dd>
 * <dd>Setter : フィールドのSetterを作成する</dd>
 * <dd>ToString : フィールドの値を表示するtoStringメソッドを実装する</dd>
 * <dt>変数・パラメータ用のLombokアノテーション</dt>
 * <dd>NonNull : Null不許可にする（Nullチェックをする）</dd>
 * </dl>
 */
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class NorwegianForestCat {

  @NonNull
  String name;

  @NonNull
  Integer age;

  @NonNull
  String hair;

  /**
   * 鳴く
   */
  public void mew() {
    log.info(hair + "で" + age + "才の" + name + "がニャーと鳴いた!");
  }

}
