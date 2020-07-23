package me.stevenkin.hikigane.core.extension;

import java.lang.annotation.*;

/**
 * 扩展点标记注解
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Spi {
}
