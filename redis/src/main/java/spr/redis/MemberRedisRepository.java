package spr.redis;

import org.springframework.data.repository.CrudRepository;

public interface MemberRedisRepository extends CrudRepository<Table, Long> {
}
