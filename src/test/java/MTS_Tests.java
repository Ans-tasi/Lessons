import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MTS_Tests {

    public static MTS mts;
    public static WebDriver driver;
    public static final String PAGE_URL = "http://mts.by";

    @BeforeAll
    static void before() {
        driver = new ChromeDriver();
        mts = new MTS(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(PAGE_URL);
        mts.clickCookieCancelBtn();
    }

    @AfterAll
    static void after() {
        driver.quit();
    }

    @Test
    @DisplayName("Заголовок формы")
    public void title() {
        String name = "Заголовок";
        try {
            String actualValue = mts.getPaySectionTitle();
            assertEquals("Онлайн пополнение без комиссии", actualValue);
            System.out.println(name + " совпадает: " + actualValue);
        } catch (NoSuchElementException e) {
            assertTrue(false, name + " не найден");
        }
    }

    @ParameterizedTest
    @DisplayName("Картинки платежных систем")
    @ValueSource(strings = {"visa.svg", "visa-verified.svg", "mastercard.svg", "mastercard-secure.svg", "belkart.svg"})
    void payPics(String src) {
        try {
            assertTrue(mts.isDisplayedImg(src));
            System.out.println("Картинка " + src + " отображается");
        } catch (NoSuchElementException e) {
            assertTrue(false, "Картинка " + src + " не найдена");
        }
    }

    @Test
    @DisplayName("Ссылка 'Подробнее о сервисе'")
    void detailLink() {
        String urlLink = null;
        try {
            urlLink = mts.getLinkUrl();
            int linkResponseCode = mts.getRespCode(urlLink);
            assertTrue(linkResponseCode < 400);
            System.out.println("Ссылка " + urlLink + " рабочая (код: " + linkResponseCode + ")");
        } catch (NoSuchElementException e) {
            assertTrue(false, "Нет ссылки");
        } catch (MalformedURLException e) {
            assertTrue(false, "Не корректный url: " + urlLink);
        } catch (IOException e) {
            assertTrue(false, "Проблема с соединением");
        }
    }

    @Test
    @DisplayName("Работа кнопки 'Продолжить'")
    void payForm() {
        String name = "Окно оплаты";
        try {
            mts.setPhoneField("297777777");
            mts.setSumField("300");
            mts.clickPayBtn();
            String actualValue = mts.getFrameLink();
            assertEquals("https://checkout.bepaid.by/widget_v2/index.html", actualValue);
            System.out.println(name + " открылось");
        } catch (NoSuchElementException e) {
            assertTrue(false, "Элемент не найден");
        }
    }
}

