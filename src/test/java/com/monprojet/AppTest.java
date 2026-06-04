package com.monprojet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

  @Test
  void appShouldNotBeNull() {
    App app = new App();
    assertNotNull(app);
  }

  @Test
  void onePlusTwoShouldBeThree() {
    int result = 1 + 2;
    assertEquals(3, result);
  }
}