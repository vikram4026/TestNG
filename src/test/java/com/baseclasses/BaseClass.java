package com.baseclasses;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static Actions act;
	public static Robot rob;
	public static Select index;
	public static Select value;
	public static Select visibletext;
	public static Select option;
	public static Select sValue;
	public static JavascriptExecutor js = (JavascriptExecutor) driver;

	public static void launchBrowse() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mr White Devil\\eclipse-workspace\\TestngFrameWork\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	public static void toPassUrl(String url) {

		driver.get(url);

	}

	public static void maxWindow() {
		driver.manage().window().maximize();
	}

	public static void currentUrl() {
		String currentUrl = driver.getCurrentUrl();

	}

	public static void getTitleWebpage(String titletext) {
		String title = driver.getTitle();
		System.out.println(titletext);
	}

	public static void closeAllWindow() {
		driver.quit();
	}

	public static void closeWindow() {
		driver.close();
	}

	public static void toInput(WebElement webElement, String string) {
		webElement.sendKeys(string);
	}

	public static void clickBtn(WebElement webElement) {

		webElement.click();

	}

	public static void clickMethod(String locator) {
		WebElement findElement = driver.findElement(By.xpath(locator));
		findElement.click();
	}

	public static String getAttributeMethod(WebElement webElement) {
		String attribute = webElement.getAttribute("value");
		return attribute;
	}

	public static void getTextMethod(WebElement webElement) {
		String text = webElement.getText();
		System.out.println(text);
	}

	public static void waitMethod(int secounds) throws InterruptedException {
		Thread.sleep(secounds);
	}

	public static void dragElement(String src, String target) {

		act = new Actions(driver);

		WebElement findElement = driver.findElement(By.xpath(src));
		WebElement findElement2 = driver.findElement(By.xpath(target));
		act.dragAndDrop(findElement, findElement2).perform();
	}

	public static void mouseHover(String place) {

		WebElement findElement = driver.findElement(By.xpath(place));
		act.moveToElement(findElement);
	}

	public static void doubleClickMethod(String locator) {
		WebElement findElement = driver.findElement(By.xpath(locator));
		act.doubleClick().perform();
	}

	public static void rightClick(String locator) {
		WebElement findElement = driver.findElement(By.xpath(locator));
		act.contextClick().perform();
	}

	public static void actsendKey(String locator, String key) {
		WebElement findElement = driver.findElement(By.xpath(locator));
		act.sendKeys(findElement, key);
	}

	public static void controlV() throws AWTException {
		rob = new Robot();
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_V);

	}

	public static void controlA() {
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_A);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_A);
	}

	public static void keyUp() {
		rob.keyPress(KeyEvent.VK_UP);
		rob.keyRelease(KeyEvent.VK_UP);
	}

	public static void keyDown() {
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void keyLeft() {
		rob.keyPress(KeyEvent.VK_LEFT);
		rob.keyRelease(KeyEvent.VK_LEFT);
	}

	public static void keyRight() {
		rob.keyPress(KeyEvent.VK_RIGHT);
		rob.keyRelease(KeyEvent.VK_RIGHT);
	}

	public static void keyEnter() {
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void tabKey() {
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyRelease(KeyEvent.VK_TAB);
	}

	public static void okAlert() {
		driver.switchTo().alert().accept();
	}

	public static void cancelAlert() {
		driver.switchTo().alert().dismiss();
	}

	public static void sendkeyAlert(String string) {
		driver.switchTo().alert().sendKeys(string);
	}

	public static void screenShot(String fileName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Vikram\\eclipse-workspace\\Day7\\ScrrenShot\\" + fileName + ".png");
		FileUtils.copyFile(src, dest);
	}

	public static void indexFrame(int index) {
		driver.switchTo().frame(index);
	}

	public static void stringFrame(String string) {
		driver.switchTo().frame(string);
	}

	public static void refFrame(String refName) {
		driver.switchTo().frame(refName);
	}

	public static void valueSelectdBy(WebElement element, String string) {
		sValue = new Select(element);
		sValue.selectByValue(string);
	}

	public static void dropByIndex(String locator, int indexnum) {
		WebElement findElement = driver.findElement(By.xpath(locator));
		index = new Select(findElement);
		index.selectByIndex(indexnum);
	}

	public static void dropByText(String locator, String text) {
		WebElement findElement = driver.findElement(By.xpath(locator));
		value = new Select(findElement);
		value.selectByVisibleText(text);

	}

	public static void dropByValue(String locator, String text) {
		WebElement findElement = driver.findElement(By.xpath(locator));
		visibletext = new Select(findElement);
		visibletext.selectByValue(text);

	}

	public static void windowHandle(int index) {
		String parantWindow = driver.getWindowHandle();
		Set<String> allwindowId = driver.getWindowHandles();
		List<String> li = new ArrayList();
		li.addAll(allwindowId);
		driver.switchTo().window(li.get(index));
	}

	public static void javaSendKey(String locator, String key) {
		WebElement findElement = driver.findElement(By.xpath(locator));
		js.executeScript("aruments[0].setAttribute('value'," + key + ")", findElement);
	}

	public static void javaGetKey(String locator, String key) {
		WebElement findElement = driver.findElement(By.xpath(locator));
		js.executeScript("aruments[0].setAttribute('value'," + key + ")", findElement);
		Object e1 = js.executeScript("return arguments[0].getAttribute('value')", findElement);
		System.out.println(e1);

	}

	public static void javaClick(String locator) {
		WebElement findElement = driver.findElement(By.xpath(locator));
		js.executeScript("arguments[0].click()", findElement);
	}

	public static void implitWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.NANOSECONDS);
	}

	public static void excelWrite(int r, int c, String string) throws IOException {
		File file = new File("C:\\Users\\Mr White Devil\\eclipse-workspace\\PomPro\\data\\PomPro.xlsx");

		Workbook w = new XSSFWorkbook();
		Sheet createSheet = w.createSheet("Sheet2");
		Row row = createSheet.createRow(r);
		Cell createCell = row.createCell(c);
		createCell.setCellValue(string);

		FileOutputStream f = new FileOutputStream(file);
		w.write(f);
	}

	public static String excelRead(int row, int cell) throws IOException {
		File file = new File("C:\\Users\\Mr White Devil\\eclipse-workspace\\PomPro\\data\\PomPro.xlsx");
		FileInputStream f = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(f);
		Sheet sheet = w.getSheet("Sheet2");

		Row row2 = sheet.getRow(row);
		Cell cell2 = row2.getCell(cell);

		int cellType = cell2.getCellType();

		String value;

		if (cellType == 1) {
			value = cell2.getStringCellValue();

		} else if (DateUtil.isCellDateFormatted(cell2)) {
			Date dateCellValue = cell2.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat();
			value = sim.format("dd-mm-yyyy");

		} else {
			double numericCellValue = cell2.getNumericCellValue();
			long l = (long) numericCellValue;
			value = String.valueOf(l);
		}

		return value;

	}

}
