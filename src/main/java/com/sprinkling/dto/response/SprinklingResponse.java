package com.sprinkling.dto.response;

import com.sprinkling.entity.SprinklingEntity;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Getter
@Builder
public class SprinklingResponse {
    private final String uuid;
    private final int money;
    private final String token;

    public SprinklingResponse sprinklingResponse(SprinklingEntity sprinklingEntity){
        return SprinklingResponse.builder()
                .uuid(sprinklingEntity.getUuid())
                .money(sprinklingEntity.getMoney())
                .token(sprinklingEntity.getToken())
                .build();
    }
}
