package javado.handsOn.vanilla;

import lombok.Getter;
import lombok.Setter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Loggerの自動生成（コード例）
 * 
 * この例では SLF4J を使っている
 */
// TODO: lombok.extern.slf4j.Slf4jアノテーション
@Getter
@Setter
public class HandsOn03 {

  // TODO: 削除
  private static final Logger log = LoggerFactory.getLogger(HandsOn02a.class);

  private String info;

  public static void main(String[] args) {
    HandsOn03 target = new HandsOn03();
    target.setInfo("成功！");
    log.info(target.getInfo());
  }

}
