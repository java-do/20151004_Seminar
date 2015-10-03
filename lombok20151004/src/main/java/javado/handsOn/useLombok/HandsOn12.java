package javado.handsOn.useLombok;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.val;
import lombok.extern.slf4j.Slf4j;

/**
 * finalなローカル変数（コード例）
 */
@Slf4j
@AllArgsConstructor
@Data
public class HandsOn12 {

  private String name;
  private String state;

  public static void main(String[] args) {
    val jugs = Stream.of(
            new HandsOn12("Java Do", "札幌"),
            new HandsOn12("渋谷Java", "東京"),
            new HandsOn12("Java勉強会 in 秋葉原", "東京"),
            new HandsOn12("関ジャバ", "大阪"),
            new HandsOn12("岡山Javaユーザ会", "岡山"),
            new HandsOn12("広島JUG", "広島"),
            new HandsOn12("熊本Java勉強会", "熊本")
    ).collect(Collectors.toList());
    jugs.stream().forEach(item -> log.info(item.toString()));
  }

}
