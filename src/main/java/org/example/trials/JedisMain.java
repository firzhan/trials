package org.example.trials;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.Optional;

public class JedisMain {

    public static JedisPool createPool(String host, int port){
        JedisPoolConfig poolConfig=new JedisPoolConfig();

        poolConfig.setMaxWaitMillis(1000);
        poolConfig.setMaxTotal(100);
        poolConfig.setMaxIdle(50);
        poolConfig.setMinIdle(10);
        poolConfig.setTestOnBorrow(true);
        poolConfig.setTestOnReturn(true);
        poolConfig.setTestWhileIdle(true);
        poolConfig.setNumTestsPerEvictionRun(10);
        poolConfig.setTimeBetweenEvictionRunsMillis(60000);
        return new JedisPool(poolConfig,host,port,
                1000,/*"Passw0rd1234567890",*/ true);


       /* poolConfig.setMaxWaitMillis(timeout);
        poolConfig.setMaxTotal(resources);
        poolConfig.setMaxIdle(5);
        poolConfig.setMinIdle(1);
        poolConfig.setTestOnBorrow(true);
        poolConfig.setTestOnReturn(true);
        poolConfig.setTestWhileIdle(true);
        poolConfig.setNumTestsPerEvictionRun(10);
        poolConfig.setTimeBetweenEvictionRunsMillis(60000);
        if (password != null) {
            return new JedisPool(poolConfig,host,port,timeout,password, ssl);
        }

        return new JedisPool(poolConfig,host,port,timeout, ssl);*/

    }

    public static void main(String[] args) {

        JedisPool jedisReadPool = createPool("xxxxxx", 6379);
        JedisPool jedisWritePool = createPool("xxxxxxx", 6379);

        try (Jedis jedisWrite = jedisWritePool.getResource()) {
            String [] arg = {"apple", "orange", "tea"};
            jedisWrite.sadd("test2", arg);
            jedisWrite.expire("test2", 300);
        }

        try (Jedis jedisRead = jedisReadPool.getResource()) {
            System.out.println(jedisRead.smembers("test4").isEmpty() + "" + jedisRead.smembers("test4").size());
        }
       //jedisWrite.set("events/city/rome", "32,15,223,828");

    }
}
