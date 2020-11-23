package com.sprinkling.entity;

import com.sprinkling.vo.Token;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@NoArgsConstructor
@Data
@Entity
public abstract class TokenBase extends UuidBase {
    @Column(nullable = false)
    private String token;

    @Builder
    public TokenBase(UuidBase uuid, Token token){
        super(uuid.getUuid());
        this.token = token.createToken(uuid);
    }
}
