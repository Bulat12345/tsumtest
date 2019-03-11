import org.junit.Test;
import org.openqa.selenium.By;

public class test extends qwerty {

    //Позитивный кейс на авторизацию при условии что учетная запись test@gmail.com есть
    @Test
    public void testos() {
        driver.get("https://www.tsum.ru/");
        driver.findElement(By.className("header__private")).click();
        driver.findElement(By.cssSelector("input[formcontrolname='Email']")).sendKeys("test@gmail.com");
        driver.findElement(By.cssSelector("input[formcontrolname='password']")).sendKeys("test");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
    }
    //Негативный кейс на авторизацию
    @Test
    public void testos2(){
        driver.get("https://www.tsum.ru/");
        driver.findElement(By.className("header__private")).click();
        driver.findElement(By.cssSelector("input[formcontrolname='Email']")).sendKeys("test");
        driver.findElement(By.cssSelector("input[formcontrolname='password']")).sendKeys("test");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
    }
}
