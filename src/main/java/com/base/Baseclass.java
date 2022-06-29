package com.base;



	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.io.IOException;
	import java.sql.Driver;
	import java.time.Duration;
	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.List;
	import java.util.Set;

	import javax.lang.model.element.Element;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.FluentWait;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.Wait;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import net.bytebuddy.asm.Advice.Return;

	public class Baseclass {



		
			public static WebDriver driver;




			public static WebDriver launchBrowser(String browserName) {
			if (browserName.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver","C:\\Users\\UMAR SALMAN.SK\\eclipse-workspace\\Selinium_Class\\Driver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

			driver.manage().window().maximize();

			}

			else if (browserName.equalsIgnoreCase("edge")) {

			System.setProperty("webdriver.edge.driver","C:\\Users\\raghu\\eclipse-workspace\\Selenium_Concept\\driver\\edgedriver_win64\\msedgedriver.exe");

			driver = new EdgeDriver();

			driver.manage().window().maximize();

			}
			return driver;

			}

			public static void getUrl(String url) {

			driver.get(url);

			}

			public static void quit() {

			driver.quit();

			}

			public static void close() {
			driver.close();
			}

			public static void refresh() {
			driver.navigate().refresh();
			}

			public static void back() {
			driver.navigate().back();
			}
			public static void forward() {
			driver.navigate().forward();
			}
			public static void navigateTo(String url) {
			driver.navigate().to(url);
			}

			public static void getTitle() {
			String title = driver.getTitle();
			System.out.println(title);
			}

			public static void getCurrentUrl() {
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
			}

			public static void click(WebElement element) {

			element.click();

			}

			public static void sendKeys(WebElement element,String value) {
			element.sendKeys(value);
			}

			public static void getText(WebElement element) {
			String text = element.getText();
			System.out.println("text");
	}
			public static void isEnabled(WebElement element) {

			boolean enabled = element.isEnabled();
			System.out.println("enabled");
			}

			public static void isDisplayed(WebElement element) {

			boolean displayed = element.isDisplayed();
			System.out.println("displayed");
			}
			public static void isSelected(WebElement element) {

			boolean selected = element.isSelected();
			System.out.println("selected");
			}

			public static void takeingValues(WebElement element,String value) {

			if (value.equalsIgnoreCase("name")) {

			String attribute = element.getAttribute("name");
			System.out.println(attribute);

			}

			else if (value.equalsIgnoreCase("value")) {



			String attribute = element.getAttribute("value");
			System.out.println(attribute);
			}
			}

			public static void clear(WebElement element) {
			element.clear();
			}

			public static void handleAlert(String option) {

			Alert alert = driver.switchTo().alert();

			if (option.equalsIgnoreCase("ok")) {
			alert.accept();
			}
			else if (option.equalsIgnoreCase("cancel")) {
			alert.dismiss();
			}

			else if (option.equalsIgnoreCase("gettext")) {
			String text = alert.getText();
			System.out.println(text);
			}

			}
			public static void singleDropdown(WebElement object,String options,String value) {

			Select s = new Select(object);

			if (options.equalsIgnoreCase("value")) {
			s.selectByValue(value);
			}

			else if (options.equalsIgnoreCase("index")) {
			int parseInt = Integer.parseInt(value);
			s.selectByIndex(parseInt);
			}

			else if (options.equalsIgnoreCase("notext")) {
			s.deselectByVisibleText(value);
			}

			else if (options.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);

			}
			}
			// action
			public static void action(WebElement element,String action) {
			Actions act=new Actions(driver);
			if (action.equalsIgnoreCase("move")) {
			act.moveToElement(element).build().perform();
			}
			else if (action.equalsIgnoreCase("click")) {
			act.click().build().perform();
			}
			else if (action.equalsIgnoreCase("rightclick")) {
			act.contextClick().build().perform();
			}}
			//Robot

			public static void robot(String option) throws AWTException {
			Robot r = new Robot();

			if (option.equalsIgnoreCase("down")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			}
			else if (option.equalsIgnoreCase("up")) {
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
			}

			else if (option.equalsIgnoreCase("enter")) {
			r.keyPress(KeyEvent.VK_ENTER);
			}
			}

			// Scroll up and Down

			public static void scroll(WebElement element) {

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("arguments[0].scrollIntoView();", element);
			         

			}
			// wait implicity wait

			public static void implicityWait(int secs) {

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(secs));

			// Explicity Wait

			}
			public static void explicity(int secs) {



			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(secs));
			Alert until = wait.until(ExpectedConditions.alertIsPresent());
			until.accept();

			}

			// Fluent Wait
			public static void fluentWait(int secs,int polling) {

			Wait w = new FluentWait(driver).withTimeout(Duration.ofSeconds(secs)).pollingEvery(Duration.ofSeconds(polling)).ignoring(Exception.class);

			}

			//multipledropdown

			public static void IsMultiple(WebElement element) {
			Select s = new Select(element);

			boolean multiple = s.isMultiple();
			System.out.println(multiple);
			}
			           
			//multialloption and allselect
			public static void multiAllOption(String option,WebElement element) {

			Select s = new Select(element);
			if (option.equalsIgnoreCase("alloption")) {
			                    System.out.println("alloption");
			List<WebElement> options = s.getOptions();
			for (WebElement alloptions : options) {
			String text = alloptions.getText();
			System.out.println(text);
			}
			}
			else if (option.equalsIgnoreCase("allselected")) {
			System.out.println("allselected");
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for (WebElement alloptions : allSelectedOptions) {
			String text = alloptions.getText();
			System.out.println(text);
			}
			}
			}
			//multi first select option

			public static void multiFirstSelect(WebElement element) {
			Select s = new Select(element);
			System.out.println("first selected option");
			WebElement firstSelectedOption = s.getFirstSelectedOption();
			String text = firstSelectedOption.getText();
			System.out.println(text);
			}

			//Takescreenshot

			public static void screenshot(String location) throws IOException {

			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(location);
			FileUtils.copyFile(src, dest);
			}

			// Frame

			public static void frame(String option,WebElement element) {

			if (option.equalsIgnoreCase("innerframe")) {
			driver.switchTo().frame(element);
			}
			else if (option.equalsIgnoreCase("defaultcontent")) {
			driver.switchTo().defaultContent();

			}
			}

			// Window Handles by title

			public static void windowHandleTitle(WebElement element,String value) {
			Set<String> windowHandles = driver.getWindowHandles();
			for (String allwindows : windowHandles) {
			String text= driver.switchTo().window(allwindows).getTitle();
			System.out.println(text);

			}
			String expectedtitle=(value);

			for (String allwindows : windowHandles) {

			if (driver.switchTo().window(allwindows).getTitle().equals(expectedtitle)) {

			break;
			}
			}
			}
			// Window handles by heading

			public static void windowHandleHeading(String value) {

			String windowHandle = driver.getWindowHandle();
			System.out.println(windowHandle);

			Set<String> windowHandles = driver.getWindowHandles();
			List<String> li = new ArrayList<String>();

			li.addAll(windowHandles);
			int parseInt = Integer.parseInt(value);
			driver.switchTo().window(li.get(parseInt));
			String title2 = driver.getTitle();

			System.out.println(title2);


			
			



		}

	}



