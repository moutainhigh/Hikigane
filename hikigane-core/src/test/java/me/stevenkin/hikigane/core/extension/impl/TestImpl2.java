package me.stevenkin.hikigane.core.extension.impl;

import me.stevenkin.hikigane.core.extension.SpiImp;
import me.stevenkin.hikigane.core.extension.Test;

@SpiImp(name = "test2")
public class TestImpl2 implements Test {
    @Override
    public String hello() {
        return "test2";
    }
}
