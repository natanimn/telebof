package io.github.natanimn;

import io.github.natanimn.telebof.Util;
import org.junit.Test;
import static org.junit.Assert.*;

public class UtilTest {

    @Test
    public void isCommand() {
        assertTrue(Util.isCommand("/start"));
        assertTrue(Util.isCommand("/start@mybot"));
        assertFalse(Util.isCommand("!start"));
    }

    @Test
    public void extractCommand() {
        assertEquals("start", Util.extractCommand("/start"));
        assertEquals("start", Util.extractCommand("/start@mybot"));
        assertEquals("start", Util.extractCommand("/start hello"));
    }

    @Test
    public void extractText() {
        assertEquals("hello", Util.extractText("/start hello"));
        assertEquals("hello", Util.extractText("/start@mybot hello"));
        assertNotEquals("hello", Util.extractText("/start .hello"));
    }

    @Test
    public void escapeHtml() {
        String txt = "<b>Hello, World</b>";
        assertFalse(Util.escapeHtml(txt).startsWith("<b>"));
        assertTrue(Util.escapeHtml(txt).startsWith("&lt;"));
        assertTrue(Util.escapeHtml(txt).endsWith("&gt;"));
        assertNull(Util.escapeHtml(null));
        assertEquals("&lt;b&gt;Hello, World&lt;/b&gt;", Util.escapeHtml(txt));
    }

}