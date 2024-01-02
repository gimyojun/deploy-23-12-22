package com.ll.deploy231219;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest
@ActiveProfiles("test")
class Deploy231219ApplicationTests {

    @Test
    void contextLoads() {
        assertThat(1).isEqualTo(1);
    }

}
