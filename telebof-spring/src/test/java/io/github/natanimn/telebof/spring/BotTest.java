package io.github.natanimn.telebof.spring;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BotTest {
    @Bot
    static class Message0Handler{}

    @Bot(1)
    static class Message1Handler{}

    @Bot(2)
    static class Message2Handler{}

    @Test
    public void testMessage0handler(){
        Message0Handler handler = new Message0Handler();
        Bot annotation = handler.getClass().getAnnotation(Bot.class);
        assertNotNull(annotation);
        assertEquals(0, annotation.value());
    }

    @Test
    public void testMessage1handler(){
        Message1Handler handler = new Message1Handler();
        Bot annotation = handler.getClass().getAnnotation(Bot.class);
        assertNotNull(annotation);
        assertEquals(1, annotation.value());
    }

    @Test
    public void testMessage2handler(){
        Message2Handler handler = new Message2Handler();
        Bot annotation = handler.getClass().getAnnotation(Bot.class);
        assertNotNull(annotation);
        assertEquals(2, annotation.value());
    }


}
