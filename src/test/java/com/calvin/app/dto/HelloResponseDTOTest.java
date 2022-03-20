package com.calvin.app.dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDTOTest {

    @Test
    public void 롬복_가능_테스트() {
        String name = "test";
        int amount = 1000;

        HelloResponseDTO dto = new HelloResponseDTO(name, amount);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }

}

