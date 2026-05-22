package io.github.natanimn.telebof;

/**
 * Handler record.
 * @param clazz A class that contains handlers
 * @param priority priority order of the class. A class with lower priority is registered before those class with higher number.
 * @author Natanim
 * @since 2.0.0
 * @version 2.0.0
 */
public record Handler(Object clazz, int priority) {
    public static Handler withDefault(Object clazz){
        return new Handler(clazz, 0);
    }
}
