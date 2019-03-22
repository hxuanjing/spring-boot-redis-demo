package com.xuanjing.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RedisController {
	@Autowired
	private RedisServiceImpl service;

	// 添加
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	@ResponseBody
	public void test() {
		
	}

	// 查询所有对象
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	@ResponseBody
	public Object getAll() {
		return service.getAll();
	}

	// 查询所有key
	@RequestMapping(value = "/getKeys", method = RequestMethod.GET)
	@ResponseBody
	public Object getKeys() {
		return service.getKeys();
	}

	// 根据key查询
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	@ResponseBody
	public Object get() {
		RedisModel m = new RedisModel();
		m.setRedisKey("zhangsanKey02");
		return service.get(m.getRedisKey());
	}

	// 删除
	@RequestMapping(value = "/remove", method = RequestMethod.GET)
	@ResponseBody
	public void remove() {
		RedisModel m = new RedisModel();
		m.setRedisKey("zhangsanKey01");
		service.remove(m.getRedisKey());
	}

	// 判断key是否存在
	@RequestMapping(value = "/isKeyExists", method = RequestMethod.GET)
	@ResponseBody
	public void isKeyExists() {
		RedisModel m = new RedisModel();
		m.setRedisKey("zhangsanKey01");
		boolean flag = service.isKeyExists(m.getRedisKey());
		System.out.println("zhangsanKey01 是否存在: " + flag);
	}

	// 查询当前缓存的数量
	@RequestMapping(value = "/count", method = RequestMethod.GET)
	@ResponseBody
	public Object count() {
		return service.count();
	}

	// 清空所有key
	@RequestMapping(value = "/empty", method = RequestMethod.GET)
	@ResponseBody
	public void empty() {
		service.empty();
	}
}
