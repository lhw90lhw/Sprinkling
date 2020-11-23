package com.sprinkling.vo;

import com.sprinkling.entity.SprinklingEntity;
import com.sprinkling.entity.UuidBase;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
@Builder
public class Sprinkling {
    private final UuidBase uuid;
    private final Money money;
    private final int peopleCnt;
    private final Token token;

    public SprinklingEntity mappingToEntity(Sprinkling sprinkling){
        return SprinklingEntity.builder()
                .uuid(uuid)
                .token(token)
                .money(money)
                .peopleCnt(peopleCnt)
                .build();
    }
}
