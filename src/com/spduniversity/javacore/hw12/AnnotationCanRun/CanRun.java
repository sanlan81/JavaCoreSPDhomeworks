package com.spduniversity.javacore.hw12.AnnotationCanRun;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
 @interface CanRun {
     String text() default "Some default text";
}
