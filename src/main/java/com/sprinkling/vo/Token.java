package com.sprinkling.vo;

import com.sprinkling.entity.UuidBase;
import com.sprinkling.vo.Uuid.Uuid;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Date;
import java.util.UUID;

public class Token {
    private static final String headerStr = "JWT";
    private String secretKey = "jwtSecretKey";
    private byte[] apiKey = DatatypeConverter.parseBase64Binary(secretKey);
    private SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

    private final Key KEY = new SecretKeySpec(apiKey, signatureAlgorithm.getJcaName());
    private String token;

    public String createToken(UuidBase uuid){
        token = Jwts.builder()
                .setHeaderParam("type", "JWT")
                .setSubject(uuid.toString())
                .claim("uuid", uuid.toString())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 10))   // 10분
                .signWith(KEY, signatureAlgorithm)
                .compact();

        return token;
    }
}
