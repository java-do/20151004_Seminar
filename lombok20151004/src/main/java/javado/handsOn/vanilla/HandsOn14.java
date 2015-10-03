package javado.handsOn.vanilla;

import java.util.concurrent.atomic.AtomicReference;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Getter（遅延初期化）
 */
public class HandsOn14 {
  private static final Logger log = LoggerFactory.getLogger(HandsOn14.class);

  private final String name = "JavaDo";

  // TODO: 1. private final String state に変更
  // TODO: 2. lombok.Getter アノテーション (lazy=true)
  private final AtomicReference<String> state = new AtomicReference<>();

  // TODO: 削除
  public String getState() {
    String innerState = state.get();
    if (innerState == null) {
      synchronized (state) {
        innerState = state.get();
        if (innerState == null) {
          String actualState = makeState();
            this.state.set(actualState);
        }
      }
    }
    return state.get();
  }

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
