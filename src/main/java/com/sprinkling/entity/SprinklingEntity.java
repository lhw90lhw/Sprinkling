package com.sprinkling.entity;

import com.sprinkling.vo.Money;
import com.sprinkling.vo.Token;
import lombok.*;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "sprinkling", indexes = {@Index(columnList = "uuid", unique = true)})
public class SprinklingEntity extends TokenBase {
    @Column(nullable = false)
    private int money;
    @Column(nullable = false)
    private int peopleCnt;

    @Builder
    public SprinklingEntity(UuidBase uuid, Token token, Money money, int peopleCnt){
        super(uuid, token);
        this.money = money.getMoney();
        this.peopleCnt = peopleCnt;
    }

}
