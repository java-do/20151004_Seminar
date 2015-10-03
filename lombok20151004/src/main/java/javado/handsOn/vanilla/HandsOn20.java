package javado.handsOn.vanilla;

import lombok.ToString;
import lombok.val;
import lombok.extern.slf4j.Slf4j;

/**
 * アノテーションの設定
 */
@Slf4j
@ToString
// TODO: lombok.AllArgsConstructor アノテーション (onConstructor = @__(@Deprecated))
public class HandsOn20 {

  // TODO: lombok.Getter アノテーション (onMethod = @__(@Deprecated))
  private final String name;

  // TODO: コンストラクタを削除
  @Deprecated
  public HandsOn20(String name) {
    this.name = name;
  }

  // TODO: メソッドを削除
  @Deprecated
  public String getName() {
    return name;
  }

  public static void main(String[] args) {
    val target = new HandsOn20("JavaDo");
    log.info(target.getName());
  }

}
