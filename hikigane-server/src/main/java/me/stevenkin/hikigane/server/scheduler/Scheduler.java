package me.stevenkin.hikigane.server.scheduler;

import me.stevenkin.hikigane.core.extension.Spi;

@Spi
public interface Scheduler {
    boolean schedule()
}
