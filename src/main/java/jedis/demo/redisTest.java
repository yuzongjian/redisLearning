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
		jedis.set("name", "���ڼ���Javaѧϰ"); // ����ֵ
        String value=jedis.get("name"); // ��ȡֵ
        String value1=jedis.get("name1234"); // ��ȡֵ
        System.out.println(value);
        System.out.println(value1);
        jedis.close(); // �ͷ�������Դ
	}
}
