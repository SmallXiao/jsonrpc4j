package com.dianru.test;

import com.dianru.util.Base64;
import com.dianru.util.HttpUtil;
import com.googlecode.jsonrpc4j.JsonRpcHttpClient;

import java.net.URL;

import org.junit.Test;

public class TestUserService {
	
	@Test
	public void testGetMobile() {
		String params=Base64.encode("[]");
		String url = "http://192.168.199.205:80/jsonrpc?method=getMobilenum&id=1&params=" + params;
		String result = HttpUtil.get(url);
		System.out.println(result);
	}
	
	@Test
	public void testGetVcode() {
		String params = Base64.encode("[\"13539022645\"]");
		String url = "http://192.168.199.205:80/jsonrpc?method=getVcode&id=1&params=" + params;
		String result = HttpUtil.get(url);
		System.out.println(result);
	}
	
	@Test
	public void testGet() {
		String param = Base64.encode("[\"张三\",\"李四\"]");
		String url = "http://192.168.199.205:80/jsonrpc?method=helloName&id=3325235235235&params=" + param;
		String result = HttpUtil.get(url);
		System.out.println(result);
	}
	
	@Test
	public void testPost() {
		try {
			 JsonRpcHttpClient client = new JsonRpcHttpClient(
		                new URL("http://localhost:80/jsonrpc"));
			 
			 String a = client.invoke("helloName", new Object[]{"王五", "赵六"}, String.class);
		     System.out.println(a);

//		        User user = client.invoke("createUser", new Object[] { "bob", "бобик","the builder" }, User.class);
//		        System.out.println(user);
		//
//		        String word = client.invoke("printWord",new Object[]{"dima"},String.class);
//		        System.out.println(word);
		//
		//
//		        List<String> wordList = new ArrayList<String>();
		//
//		        wordList.add("dima");
//		        wordList.add("vasia");
		//
//		        StringBuilder words = client.invoke("printWordArray",new Object[]{wordList},StringBuilder.class);
//		        System.out.println(words);

//		        Integer count = client.invoke("getUserCount",new Object[]{},Integer.class);
//		        System.out.println("count: " + count);

		       
			
		} catch (Exception e) {
			e.printStackTrace();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
	}
	
}