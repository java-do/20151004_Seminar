package javado.handsOn.useLombok;

import java.util.stream.IntStream;

import lombok.Getter;
import lombok.Synchronized;
import lombok.extern.slf4j.Slf4j;

/**
 * Synchronized ブロックの自動生成（コード例）
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

  @Synchronized
  void countUp() {
    System.out.print("[");
    int n = count; // カウンターを読み出して
    System.out.print(".");
    count = n + 1; // 加算して書き戻す
    System.out.println("]");
  }
}
