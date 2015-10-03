package javado.handsOn.useLombok;

import java.util.Random;

import lombok.ToString;
import lombok.experimental.ExtensionMethod;
import lombok.extern.slf4j.Slf4j;

/**
 * あるクラスのstaticメソッドを、そのメソッドの第一引数の型クラスのメソッドとして使える（コード例）
 * 
 * 黒魔術っぽい
 */
@Slf4j
@ToString
@ExtensionMethod(Extentions.class)
public class HandsOn21 {

  public static void main(String[] args) {

    Integer arg0 = new Random().nextInt(100);
    Integer arg1 = new Random().nextInt(100);

    log.info("A is " + arg0);
    log.info("B is " + arg1);
    log.info(arg0.measure(arg1));
  }

}

class Extentions {
  public static String measure(Integer left, Integer right) {
    if (left.intValue() == right.intValue()) {
      return "Drow!";
    }
    if (left.intValue() > right.intValue()) {
      return "A is Bigger!";
    }
    return "B is Bigger!";
  }
}
