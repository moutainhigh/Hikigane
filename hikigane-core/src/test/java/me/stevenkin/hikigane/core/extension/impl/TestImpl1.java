package me.stevenkin.hikigane.core.extension.impl;

import me.stevenkin.hikigane.core.extension.SpiImp;
import me.stevenkin.hikigane.core.extension.Test;

@SpiImp(name = "test1")
public class TestImpl1 implements Test {
    @Override
    public String hello() {
        return "test1";
    }
}
