package com.sundaniu.pageobject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.sundaniu.pagepath.PageElementPath;


/**
 * pageobjectҳ������༰����
 * @author sundaniu
 *
 */
public class HomePageObject {
	WebDriver driver;
	public HomePageObject(WebDriver browserDriver){
		driver=browserDriver;
		
		
	}
	
	//���������
	public void input(String element,String value){
		//��λԪ��
		WebElement findElement = driver.findElement(By.xpath(element));
		//����ı�������
		findElement.clear();
		//��������
		findElement.sendKeys(value);
		
	}
	
	//������ť
	public void click(String element){
		//��λԪ��
		WebElement findElement = driver.findElement(By.xpath(element));
		//�������
		findElement.click();
		
		
	
	}
	
	//��ѡ��ѡ��
	public void select(String element,String text){
		//��λԪ��
		WebElement findElement = driver.findElement(By.xpath(element));
		//����Select����
		Select select=new Select(findElement);
		//�����ı�ѡ����Ӧ����
		select.selectByVisibleText(text);
		
		
	}
	
	//�����
	
	public void alert(){
		//��λԪ��
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		
	}
	
	
}
