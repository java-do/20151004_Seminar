package javado.handsOn.useLombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import lombok.val;
import lombok.extern.slf4j.Slf4j;

/**
 * アノテーションの設定（コード例）
 * 
 * この例では視覚的にわかりやすい '@Deprecated' を使っていますが、本来は、DIの '@Inject' などに使うようです.
 * 
 * なお、パラメーターにつけたいときは
 * 
 * 'onParam = @__(@XXXXX)'
 * 
 * 複数つけたいときは
 * 
 * '@__({@Foo, @Far})'
 * 
 * のように設定します。
 */
@Slf4j
@ToString
@AllArgsConstructor(onConstructor = @__(@Deprecated))
public class HandsOn20 {

  @Getter(onMethod = @__(@Deprecated))
  private String name;

  public static void main(String[] args) {
    val target = new HandsOn20("JavaDo");
    log.info(target.getName());
  }

}
