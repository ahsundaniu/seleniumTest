package com.sundaniu.pagepath;

public class PageElementPath {

	//登陆账号输入框
	public String userName ="/html/body/div/ul/li/div[1]/input";
	
	//密码输入框
	public String passWord="/html/body/div/ul/li/div[2]/input";
	
	
	//登陆div
	public String login ="/html/body/div/ul/li/input";
	
	//条件搜索框
	public String queryName="/html/body/form/input[1]";
	
	//搜索按钮
	public String querySub="/html/body/form/input[2]";
	
	//性别搜索
	public String querySex="/html/body/form/select";
	
	//添加
	public String addStudent="添加";
	
	//添加用户姓名
	public String addName="/html/body/form/table/tbody/tr[1]/td[2]/input";
	
	//添加用户性别
	public String addSex="//*[@id=\"female\"]";
	
	
	//添加用户年龄
	public String addAge="/html/body/form/table/tbody/tr[3]/td[2]/input";
	
	//提交按钮
	public String sub="//input[@type='submit']";
	
	//修改按钮
	public String eidtStudent="修改";
	
	//删除按钮
	public String delectStudent="删除";
	
	
	
	
	
}
