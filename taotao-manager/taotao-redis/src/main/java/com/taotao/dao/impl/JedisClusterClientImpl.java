package com.taotao.dao.impl;

import com.taotao.dao.JedisClient;

import redis.clients.jedis.JedisCluster;


public class JedisClusterClientImpl implements JedisClient{

	
	private JedisCluster jedisCluster;
	
	public JedisCluster getJedisCluster() {
		return jedisCluster;
	}

	public void setJedisCluster(JedisCluster jedisCluster) {
		this.jedisCluster = jedisCluster;
	}

	@Override
	public String get(String key) {
		return jedisCluster.get(key);
	}

	@Override
	public void set(String key, String value) {
		// TODO Auto-generated method stub
		jedisCluster.set(key, value);
	}
	
}
