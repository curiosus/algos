package me.curiosus.algos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by jepeterson@gmail.com on 3/18/14.
 * curiosus.me
 */

@RunWith(JUnit4.class)
public class HighLevelArrayTest {

    private HighLevelArray highLevelArray;

    @Before
    public void setUp() {
       highLevelArray = new HighLevelArray(String.class, 6);
    }

    @Test
    public void insert() {
        highLevelArray.insert("AAA");
        highLevelArray.insert("BBB");
		highLevelArray.insert("ABC");
        assertEquals(3, highLevelArray.size());
        assertEquals("BBB", highLevelArray.find("BBB"));
    }

    @Test
    public void find() {

    }

    @Test
    public void delete() {

    }
}
