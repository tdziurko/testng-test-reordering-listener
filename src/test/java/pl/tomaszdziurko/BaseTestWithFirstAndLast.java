package pl.tomaszdziurko;

import org.testng.annotations.Test;
import pl.softwaremill.common.test.util.reorder.FirstTest;
import pl.softwaremill.common.test.util.reorder.LastTest;

/**
 * Base class to test annotations in scenario with inheritance
 */
public abstract class BaseTestWithFirstAndLast {

    @Test
    @LastTest
    public void testLast() throws Exception {

        // given


        // when


        // then

    }

    @Test
    @FirstTest
    public void testFirst() throws Exception {

        // given


        // when


        // then

    }
}
