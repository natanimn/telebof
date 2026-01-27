package io.github.natanimn;

import com.google.gson.Gson;

import io.github.natanimn.telebof.types.chat_and_user.User;
import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DeJSONTest {
    Gson gson;

    @Before
    public void setUp(){
        gson = new Gson();
    }

    @Test
    public void testUser(){
        var json = """
                {
                    "id": 8063030489,
                    "is_bot": true,
                    "first_name": "testBot",
                    "username": "test123Bot",
                    "can_join_groups": true,
                    "can_read_all_group_messages": false,
                    "supports_inline_queries": false,
                    "can_connect_to_business": false,
                    "has_main_web_app": false
                  }""";
        var user = gson.fromJson(json, User.class);
        assertEquals(8063030489L, user.getId());
        assertFalse(user.getHasMainWebApp());
        assertTrue(user.getIsBot());
        assertFalse(user.getCanReadAllGroupMessages());
        assertTrue(user.getCanJoinGroups());
        assertFalse(user.getSupportsInlineQueries());
        assertFalse(user.getCanConnectToBusiness());
        assertEquals("testBot", user.getFirstName());
    }

    @Test
    public void testMessage(){
        String json = """
                {
                
                
                
                
                
                
                
                }
                """;
    }
}
