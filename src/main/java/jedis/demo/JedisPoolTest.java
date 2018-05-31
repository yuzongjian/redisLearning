package jedis.demo;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisPoolTest {

	public static void main(String[] args) {
		JedisPoolConfig config=new JedisPoolConfig();
		config.setMaxTotal(100); // 设置最大连接数
		config.setMaxIdle(10); // 设置最大空闲连接数
		
		JedisPool jedisPool=new JedisPool(config,"193.112.87.119",6379);
		Jedis jedis=null;
		try{
			jedis=jedisPool.getResource();		
			jedis.auth("yuzongjian12345");
			jedis.set("name1234", "java知识分享网");
			String value=jedis.get("name1234");
			System.out.println(value);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(jedis!=null){
				jedis.close();
			}
			if(jedisPool!=null){
				jedisPool.close();
			}
		}
	}
}
