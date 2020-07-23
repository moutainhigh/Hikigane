package me.stevenkin.hikigane.core.extension;

import org.junit.Assert;
import org.junit.Test;

public class ExtensionTest {
    @Test
    public void test() {
        me.stevenkin.hikigane.core.extension.Test test = ExtensionLoader.getExtensionLoader(me.stevenkin.hikigane.core.extension.Test.class).getExtension("test2");
        Assert.assertEquals("test2", test.hello());
    }
}
