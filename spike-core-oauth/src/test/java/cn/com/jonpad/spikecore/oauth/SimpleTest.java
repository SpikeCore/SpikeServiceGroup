package cn.com.jonpad.spikecore.oauth;

import org.junit.jupiter.api.Test;

/**
 * @author Jon Chan
 * @date 2020/4/12 18:33
 */
public class SimpleTest {
  @Test
  public void testAddOperation(){
    byte i = 15;
    int j = 8;
    int k = i + j;
  }

  @Test
  public void testAddAddOpt(){
    int i = 1;
    i++;
    int j = 1;
    ++i;

    int x1 = 10;
    int x2 = x1++;

    int x3 = 10;
    int x4 = ++x3;


    int y1 = 10;
    y1 = y1++;
    int y2 = 10;
    y2 = ++y2;

    int z1 = 10;
    int z2 = z1 ++ + ++ z1;
  }
}
