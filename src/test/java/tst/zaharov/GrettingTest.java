package tst.zaharov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrettingTest {

    @Test
    public void test(){

        assertEquals("Hello", new Gretting().getGreeting());
    }

}