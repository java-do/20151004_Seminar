package javado.handsOn.vanilla;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
// TODO: lombok.EqualsAndHashCodeアノテーション
@Getter
public class HandsOn07 {

  private String name;
  private String state;

  // TODO: メソッド削除
  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof HandsOn07)) {
      return false;
    }
    HandsOn07 other = (HandsOn07) o;
    if (!(other instanceof HandsOn07)) {
      return false;
    }
    if (!Objects.equals(this.getName(), other.getName())) {
      return false;
    }
    if (!Objects.equals(this.getState(), other.getState())) {
      return false;
    }
    return true;
  }

  // TODO: メソッド削除
  @Override
  public int hashCode() {
    return Objects.hash(name, state);
  }

  public static void main(String[] args) {
    HandsOn07 target1 = new HandsOn07("JavaDo", "札幌");
    HandsOn07 target2 = new HandsOn07("JavaDo", "札幌");
    log.info("target1: " + target1.toString());
    log.info("target2: " + target2.toString());
    log.info("contains: " + target1.equals(target2));
  }

}
