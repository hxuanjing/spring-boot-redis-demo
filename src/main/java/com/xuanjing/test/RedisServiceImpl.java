package com.xuanjing.test;

import org.springframework.stereotype.Service;

@Service
public class RedisServiceImpl extends RedisService<RedisModel> {
	private static final String REDIS_KEY = "NAME";

	@SuppressWarnings({ "static-access" })
	@Override
	protected String getRedisKey() {
		return this.REDIS_KEY;
	}

}
