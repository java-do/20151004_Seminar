package javado.handsOn.vanilla;

import java.util.ArrayList;
import java.util.List;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * Builderパターンの構築
 */
@Slf4j
@ToString
// TODO: lombok.Builder アノテーション
public class HandsOn16 {

  private String name;
  // TODO: lombok.Singula rアノテーション
  private List<String> seminars;

  // TODO: コンストラクタを削除を削除
  HandsOn16(String name, List<String> seminars) {
    this.name = name;
    this.seminars = seminars;
  }

  // TODO: メソッドを削除
  public static HandsOn16Builder builder() {
    return new HandsOn16Builder();
  }

  // TODO: Builderクラスを削除
  public static class HandsOn16Builder {

    private String name;
    private List<String> seminars;

    HandsOn16Builder() {
    }

    public HandsOn16Builder name(String name) {
      this.name = name;
      return this;
    }

    public HandsOn16Builder seminar(String seminar) {
      if (seminars == null) {
        seminars = new ArrayList<>();
      }
      seminars.add(seminar);
      return this;
    }

    public HandsOn16Builder seminars(List<String> seminars) {
      if (seminars == null) {
        seminars = new ArrayList<>();
      }
      seminars.addAll(seminars);
      return this;
    }

    public HandsOn16 build() {
      return new HandsOn16(name, seminars);
    }

  }

  public static void main(String[] args) {
    HandsOn16Builder builder = HandsOn16.builder();
    HandsOn16 target = builder.name("JavaDo")
        .seminar("Apache Wicket")
        .seminar("Stream&Lambda")
        .seminar("wake")
        .seminar("lombok")
        .build();
    log.info(target.toString());
  }

}
