package com.lc.projects.redis;

import java.util.Set;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;


public class TestRedis {
	public static void main(String[] args) throws Exception {
		Jedis jedis = new Jedis("192.168.0.105");
		System.out.println("Redis is connected:"+jedis.ping()); //PONG
		Set<String> keys = jedis.keys("*");
		System.out.println(keys);
		System.out.println("user: "+jedis.hgetAll("user"));
		
		System.out.println("list: "+jedis.lrange("list", 0, 10));
		
		System.out.println("slit: "+jedis.smembers("slist"));
			
		for(String key : keys){
			System.out.println(key + "--"+jedis.type(key));
		}
	
		Transaction tx = jedis.multi();
	}
}
