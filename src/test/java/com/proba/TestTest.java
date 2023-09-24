package com.proba;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTest {
    @Test
    public void testDateHelper() throws Exception {
        Assertions.assertEquals("java 9", VersionedClass.check());
    }
}
