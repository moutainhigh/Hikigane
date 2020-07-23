package me.stevenkin.hikigane.core.extension;

import java.lang.annotation.*;

/**
 * 扩展点实现类标记注解
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface SpiImp {
    String name() default "";
}
