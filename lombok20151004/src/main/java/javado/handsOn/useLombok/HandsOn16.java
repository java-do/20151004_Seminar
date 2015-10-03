package javado.handsOn.useLombok;

import java.util.List;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * Builderパターンの構築
 * 
 * Singular はCollectionのitemを追加するメソッドを提供する
 */
@Slf4j
@ToString
@Builder
public class HandsOn16 {

  private String name;
  @Singular
  private List<String> seminars;

  public static void main(String[] args) {
    HandsOn16Builder builder = HandsOn16.builder();
    HandsOn16 targer = builder.name("JavaDo")
        .seminar("Apache Wicket")
        .seminar("Stream&Lambda")
        .seminar("wake")
        .seminar("lombok")
        .build();
    log.info(targer.toString());
  }

}
