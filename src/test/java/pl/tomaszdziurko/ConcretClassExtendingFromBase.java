package pl.tomaszdziurko;

import org.testng.annotations.Test;
import pl.softwaremill.common.test.util.reorder.TestOrder;

/**
 * Concrete class to test annotations in scenario with inheritance
 */
@Test
public class ConcretClassExtendingFromBase extends BaseTestWithFirstAndLast {

    @Test
    @TestOrder(order = 2)
    public void should2() throws Exception {

        // given


        // when


        // then

    }


    @Test
    @TestOrder(order = 3)
    public void should3() throws Exception {

        // given


        // when


        // then

    }

    @Test
    @TestOrder(order = 1)
    public void should1() throws Exception {

        // given


        // when


        // then

    }

}
