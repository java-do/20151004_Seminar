package javado.handsOn.useLombok;

import lombok.Getter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Getterによるスレッドセーフな遅延初期化（コード例）
 */
public class HandsOn14 {
  private static final Logger log = LoggerFactory.getLogger(HandsOn14.class);

  private final String name = "JavaDo";
  @Getter(lazy = true)
  private final String state = makeState();

  public static void main(String[] args) {
    HandsOn14 target = new HandsOn14();
    log.info(target.toString());
    target.getState();
    log.info(target.toString());
  }

  @Override
  public String toString() {
    return this.getClass().getSimpleName() + "(name=" + name + ", state=" + state + ")";
  }

  /**
   * Serviceクラスなどの体で
   * 
   * @return "札幌
   */
  public String makeState() {
    return "札幌";
  }

}
