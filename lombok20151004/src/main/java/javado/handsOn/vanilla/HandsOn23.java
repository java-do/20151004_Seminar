package javado.handsOn.vanilla;

import java.util.stream.IntStream;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * Synchronized ブロックの自動生成
 */
@Slf4j
public class HandsOn23 {

  public static Counter counter = new Counter();

  public static void main(String[] args) {
    IntStream.range(0, 10).parallel().forEach(i -> counter.countUp());
    log.info("Counter.count : " + counter.getCount());
  }
}

class Counter {
  @Getter
  private int count;

  // TODO:削除
  private final Object lock = new Object[0];

  // TODO:lombok.Synchronized アノテーション
  void countUp() {
    // TODO: synchronizedのブロック部分のみ解除
    synchronized (lock) {
      System.out.print("[");
      int n = count; // カウンターを読み出して
      System.out.print(".");
      count = n + 1; // 加算して書き戻す
      System.out.println("]");
    }
  }
}
