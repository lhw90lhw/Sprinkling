package com.sprinkling.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sprinkling.entity.UuidBase;
import com.sprinkling.vo.Money;
import com.sprinkling.vo.Sprinkling;
import com.sprinkling.vo.Token;
import com.sprinkling.vo.Uuid.Uuid;
import lombok.*;

import java.util.UUID;

import static org.springframework.web.client.HttpClientErrorException.BadRequest;

@Getter
@RequiredArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
public class SprinklingRequest {
    @JsonIgnore
    private final static String msg = "%,d is inappropriate Value. Please enter as a positive integer.";
    private final Integer money;
    private final Integer peopleCnt;
    private final Token token;
    private final UuidBase uuid;

    @JsonIgnore
    public Sprinkling getSprinkling() throws BadRequest {
        try {
            Money money = new Money(this.money);
            if (money.getMoney() <= 0) {
                throw new IllegalArgumentException(String.format(msg, this.money));
            }

            return Sprinkling.builder()
                    .uuid(uuid)
                    .money(money)
                    .token(token)
                    .build();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}
