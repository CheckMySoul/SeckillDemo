package org.seckill.dao;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.Seckill;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器
 * spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SeckillDaoTest {
	
	//注入Dao实现类依赖
	@Resource
	private SeckillDao seckillDao;
	@Test
	public void testReduceNumber() throws Exception {
		Date killTime = new Date();
		int updateCount = seckillDao.reduceNumber(1000, killTime);
		System.out.println("updateCount："+updateCount);
	}
	
	@Test
	public void testQueryById() throws Exception {
		long id = 1000;
		Seckill seckill = seckillDao.queryById(id);
		System.out.println(seckill.getName());
		System.out.println(seckill);
		/**
		 * Seckill 
		 * [seckillId=1000, 
		 * name=1000元秒杀水果7, 
		 * number=100, 
		 * startTime=Sat Dec 24 00:00:00 CST 2016, 
		 * endTime=Sun Dec 25 00:00:00 CST 2016, 
		 * createTime=Mon Dec 26 11:22:01 CST 2016]
		 */
	}
	
	@Test
	public void testQueryAll() throws Exception {
		//java没有保存形参的几率：queryAll(int offset,int limit) =>queryAll(arg0,arg1)
		List<Seckill> seckills = seckillDao.queryAll(0, 100);
		for(Seckill seckill:seckills){
			System.out.println(seckill);
		}
		/**
		 * Seckill [seckillId=1000, name=1000元秒杀水果7, number=100, startTime=Sat Dec 24 00:00:00 CST 2016, endTime=Sun Dec 25 00:00:00 CST 2016, createTime=Mon Dec 26 11:22:01 CST 2016]
			Seckill [seckillId=1001, name=998元秒杀小米mix, number=200, startTime=Sat Dec 24 00:00:00 CST 2016, endTime=Sun Dec 25 00:00:00 CST 2016, createTime=Mon Dec 26 11:22:01 CST 2016]
			Seckill [seckillId=1002, name=9.98元秒杀小米5, number=300, startTime=Sat Dec 24 00:00:00 CST 2016, endTime=Sun Dec 25 00:00:00 CST 2016, createTime=Mon Dec 26 11:22:01 CST 2016]
			Seckill [seckillId=1003, name=5毛秒杀小米note2, number=400, startTime=Sat Dec 24 00:00:00 CST 2016, endTime=Sun Dec 25 00:00:00 CST 2016, createTime=Mon Dec 26 11:22:01 CST 2016]
		 */
	}
}
