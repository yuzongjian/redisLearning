/**
 * 
 */
package jedis.demo;

import redis.clients.jedis.Jedis;

/**
 * @author yuzongjian
 *
 * This is a project for the power supply bureau.
 */
public class redisTest {

	public static void main(String[] args) {
		Jedis jedis =new Jedis("193.112.87.119",6379);
		jedis.auth("yuzongjian12345");
		jedis.set("name", "余宗键的Java学习"); // 设置值
        String value=jedis.get("name"); // 获取值
        String value1=jedis.get("name1234"); // 获取值
        System.out.println(value);
        System.out.println(value1);
        jedis.close(); // 释放连接资源
	}
}
