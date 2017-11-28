package com.taotao.dao;

public interface JedisClient {

	String get(String key);
	void set(String key,String value);
}
