package tomcatdemo;

import java.util.Random;

public class Utility {
  private static Random random = new Random();

  static void sleep(double second) {
    int randomValue2 = random.nextInt(1000);
    // offset秒だけsleep時間が変動
    double offset = (-500 + randomValue2) / 10000.0;
    try {
      Thread.sleep((int) ((second + offset) * 1000));
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  static void sleep(double second1, double second2, int probability) {
    int randomValue1 = random.nextInt(100);
    // probability / 100 の確率で second2秒だけsleepする
    if (randomValue1 < probability) {
      sleep(second2);
    } else {
      sleep(second1);
    }
  }
}
