package designpatterns;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class SingletonTest {
    @Test
    void getInstance() {
        assertNotNull(Singleton.getInstance("Hello"));
    }
}
