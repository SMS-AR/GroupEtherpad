package com.swu.test;

import java.util.Date;
import java.util.Map;

import net.gjerull.etherpad.client.EPLiteClient;
import net.gjerull.etherpad.client.EPLiteConnection;

public class MyTest {
	public static void main(String[] args) {
		EPLiteClient client = new EPLiteClient("http://10.74.184.60:9001", "8f2f95ba0babc4a151d970b8acfbc00869cf3dce5b5ca6893343303d86049cd8");
		Map groupMap = client.createGroupIfNotExistsFor("hahagroup111444");
		for (Object a : groupMap.keySet()) {
			System.out.println(a.toString());
			System.out.println(groupMap.get(a));
		}
		Map groupPadMap = client.createGroupPad(groupMap.get("groupID").toString(), "haha111", "哈哈小组的pad初始内容");
		for (Object a : groupPadMap.keySet()) {
			System.out.println(a.toString());
			System.out.println(groupPadMap.get(a));
		}
		Map authorMap = client.createAuthorIfNotExistsFor("123415", "哈哈11");
		for (Object a : authorMap.keySet()) {
			System.out.println(a.toString());
			System.out.println(authorMap.get(a));
		}
		Map sessionMap = client.createSession("g.DXYsftlZG8BZn3Sz", "a.ltPauhlLiGzaVtLe", (int)new Date().getTime()/1000);
		for (Object b : sessionMap.keySet()) {
			System.out.println(b.toString());
			System.out.println(sessionMap.get(b));
		}
		
	}
}
