package pl.tomaszdziurko;

import org.testng.annotations.Test;

/**
 * TODO Update javadoc for this class
 */
@Test(dependsOnGroups = {"group2"})
public class TestDependingOnGroup2 {

    @Test
    public void shouldTest1InTestDependingOnGroup1() throws Exception {

        // given


        // when


        // then

    }

    @Test(dependsOnMethods = "shouldTest1InTestDependingOnGroup1")
    public void shouldTest2InTestDependingOnGroup1_DEPENDS_ON_METHOD() throws Exception {

        // given


        // when


        // then

    }
}
