package spr.redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
public class RedisRepositoryTest {

    @Autowired
    private MemberRedisRepository repo;

    @Test
    void test() {
        Table table = new Table(1L, 2000000L, LocalDateTime.now());

        // 저장
        repo.save(table);

        // `keyspace:id` 값을 가져옴
        repo.findById(table.getId());

        // Person Entity 의 @RedisHash 에 정의되어 있는 keyspace (people) 에 속한 키의 갯수를 구함
        repo.count();

        // 삭제
        repo.delete(table);
    }
}