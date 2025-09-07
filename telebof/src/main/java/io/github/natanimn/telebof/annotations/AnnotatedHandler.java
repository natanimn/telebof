package io.github.natanimn.telebof.annotations;

import java.lang.invoke.MethodHandle;

public class AnnotatedHandler {
    final MethodHandle methodHandle;
    final Object annotation;
    final int order;

    public AnnotatedHandler(MethodHandle methodHandle, Object annotation, int order) {
        this.methodHandle = methodHandle;
        this.annotation = annotation;
        this.order = order;
    }

    public MethodHandle getMethodHandle() {
        return methodHandle;
    }

    public Object getAnnotation() {
        return annotation;
    }

    public int getOrder() {
        return order;
    }
}
