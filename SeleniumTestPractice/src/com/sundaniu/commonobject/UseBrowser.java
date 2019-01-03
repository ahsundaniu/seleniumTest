package com.sundaniu.commonobject;

import java.util.concurrent.TimeUnit;

import org.apache.regexp.recompile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * �����࣬�����������ص�
 * @author sundaniu
 *
 */
public class UseBrowser {
	
	WebDriver driver;
	
	//����Chrome�����
	public WebDriver setupChrome(String test_url){
		//ָ������·��
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		
		//ʵ�����ȸ����������
		driver=new ChromeDriver();
		
		//��ҳ��
		driver.get( test_url);
		
		//���������������ʾ���
		driver.manage().window().maximize();
	
		//�������ӳ�ʱ��Ӧʱ��
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
		

		
	}
	
	
	//����Fierfox
	public WebDriver setupFierfox(String test_url){
		//ָ������·��
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
				
				//ʵ�����ȸ����������
				driver=new FirefoxDriver();
				
				//��ҳ��
				driver.get( test_url);
				
				//���������������ʾ���
				driver.manage().window().maximize();
			
				//�������ӳ�ʱ��Ӧʱ��
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
				return driver;
	}
	
	
	//�ر������
	public void closeBrowser(){
	
		driver.close();
		
	}
	
	

}
