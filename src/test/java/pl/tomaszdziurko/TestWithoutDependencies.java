package pl.tomaszdziurko;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * TODO Update javadoc for this class
 */
@Test
public class TestWithoutDependencies {

    @Test
    public void shouldTest1InTestDependingOnNonExistingGroup() throws Exception {

        // given


        // when


        // then
        assertEquals(1, 1);
    }

    @Test(dependsOnGroups = "group2")
    public void shouldTest2InTestDependingOnNonExistingGroup_DEPEND_ON_GROUP() throws Exception {

        // given


        // when


        // then
        assertEquals(1, 1);
    }
}
