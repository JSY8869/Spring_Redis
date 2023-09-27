package spr.redis;

import jakarta.persistence.Id;
import lombok.Getter;
import org.springframework.data.redis.core.RedisHash;

import java.time.LocalDateTime;

@Getter
@RedisHash(value = "table", timeToLive = 30)
public class Table {

    @Id
    private Long id;
    private Long price;
    private LocalDateTime createdAt;

    public Table(Long id, Long price, LocalDateTime createdAt) {
        this.id = id;
        this.price = price;
        this.createdAt = createdAt;
    }
}