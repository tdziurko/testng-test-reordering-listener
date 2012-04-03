package pl.tomaszdziurko;

import org.testng.annotations.Test;
import pl.softwaremill.common.test.util.reorder.FirstTest;
import pl.softwaremill.common.test.util.reorder.LastTest;
import pl.softwaremill.common.test.util.reorder.TestOrder;


/**
 * TODO Update javadoc for this class
 */
@Test(groups = {"group1"})
public class TestWithGroup {

    
    @Test
    @TestOrder(order = 2)
    public void should2() throws Exception {

        // given


        // when


        // then

    }


    @Test
    @TestOrder(order = 8)
    public void should8() throws Exception {

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

    @Test
    @LastTest
    public void testLast() throws Exception {

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
    @FirstTest
    public void testFirst() throws Exception {

        // given


        // when


        // then

    }

    @Test
    public void noAnnotations() throws Exception {

        // given


        // when


        // then

    }


}
