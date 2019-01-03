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
public class HomePageObject extends PageElementPath{

	//�����˺�
	public void sendKeysUserName(WebDriver driver,String loginUserName){
		WebElement userNameElement = driver.findElement(By.xpath(userName));
		//�����˺�
		userNameElement.sendKeys(loginUserName);
		
	}
	
	public void sendKeysPassWord(WebDriver driver,String loginUserPass){
		
		WebElement passWordElement = driver.findElement(By.xpath(passWord));
		//��������
		passWordElement.sendKeys(loginUserPass);
		
	}
	
	//�����½��ť
	public void clickLoginButton(WebDriver driver){
		WebElement loginElement = driver.findElement(By.xpath(login));
		
		loginElement.click();
		
	}
	
	//���
	public void addStudent(WebDriver driver,String Studentname,String studentAge){
		WebElement addStudentElement = driver.findElement(By.linkText(addStudent));
		addStudentElement.click();
		
		
		WebElement addNameElement = driver.findElement(By.xpath(addName));
		addNameElement.sendKeys(Studentname);

		WebElement addAgeElement = driver.findElement(By.xpath(addAge));
		addAgeElement.sendKeys(studentAge);
		
		driver.findElement(By.xpath(sub)).click();
		
		
	}
	
	//������ѯ
	public void queryName(WebDriver driver,String studentName){
		WebElement queryNameElement = driver.findElement(By.xpath(queryName));
		queryNameElement.sendKeys(studentName);
		
	}
	
	//��ѯ��ť
	public void querySub(WebDriver driver){
		driver.findElement(By.xpath(querySub)).click();
	}
	
	//�Ա��ѯ
	public void querySex(WebDriver driver,int userSex){
		WebElement querySexElement = driver.findElement(By.xpath(querySex));
		
		Select select=new Select(querySexElement);
		select.selectByIndex(userSex);
		
		
	}
	
	//�޸�
	public void eidtStudent(WebDriver driver,String eidtname,String eidtAge){
		
		driver.findElement(By.linkText(eidtStudent)).click();
		
		WebElement addNameElement = driver.findElement(By.xpath(addName));
		addNameElement.clear();
		addNameElement.sendKeys(eidtname);

		WebElement addAgeElement = driver.findElement(By.xpath(addAge));
		addAgeElement.clear();
		addAgeElement.sendKeys(eidtAge);
		
		driver.findElement(By.xpath(sub)).click();
		
	}
	
	
	//ɾ��
	
	public void delectStudent(WebDriver driver){
		driver.findElement(By.linkText(delectStudent)).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
}
