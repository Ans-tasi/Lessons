import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MTSTests {

    public static WebDriver driver;
    public static MTS mts;
    public static String PAGE_URL = "https://mts.by";

    @BeforeAll
    static void before() {
        driver = new ChromeDriver();
        mts = new MTS(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(PAGE_URL);
        mts.clickCookieCancel();
    }

    @AfterAll
    static void after() {
        driver.quit();
    }

    @ParameterizedTest
    @DisplayName("Тест 1: Проверка плейсхолдеров формы оплаты на главной странице")
    @CsvSource({
            "connection-phone, Номер телефона",
            "connection-sum, Сумма",
            "connection-email, E-mail для отправки чека",
            "internet-phone, Номер абонента",
            "internet-sum, Сумма",
            "internet-email, E-mail для отправки чека",
            "score-instalment, Номер счета на 44",
            "instalment-sum, Сумма",
            "instalment-email, E-mail для отправки чека",
            "score-arrears, Номер счета на 2073",
            "arrears-sum, Сумма",
            "arrears-email, E-mail для отправки чека"
    })
    public void checkPlaceholders(String id, String expectedPlaceholder) {
        try {
            String actualPlaceholder = "";
            switch (id) {
                case  ("connection-phone"):
                    actualPlaceholder = mts.getConnectionPhonePlaceholder();
                    break;
                case ("connection-sum"):
                    actualPlaceholder = mts.getConnectionSumPlaceholder();
                    break;
                case ("connection-email"):
                    actualPlaceholder = mts.getConnectionEmailPlaceholder();
                    break;
                case  ("internet-phone"):
                    actualPlaceholder = mts.getInternetPhonePlaceholder();
                    break;
                case ("internet-sum"):
                    actualPlaceholder = mts.getInternetSumPlaceholder();
                    break;
                case ("internet-email"):
                    actualPlaceholder = mts.getInternetEmailPlaceholder();
                    break;
                case  ("score-instalment"):
                    actualPlaceholder = mts.getInstalmentScorePlaceholder();
                    break;
                case ("instalment-sum"):
                    actualPlaceholder = mts.getInstalmentSumPlaceholder();
                    break;
                case ("instalment-email"):
                    actualPlaceholder = mts.getInstalmentEmailPlaceholder();
                    break;
                case  ("score-arrears"):
                    actualPlaceholder = mts.getArrearsScorePlaceholder();
                    break;
                case ("arrears-sum"):
                    actualPlaceholder = mts.getArrearsSumPlaceholder();
                    break;
                case ("arrears-email"):
                    actualPlaceholder = mts.getArrearsEmailPlaceholder();
                    break;
            }
            assertEquals(actualPlaceholder, expectedPlaceholder);
            System.out.println(id + " плейсхолдер соответствует");
        } catch (NoSuchElementException e) {
            assertTrue(false, id + " плейсхолдер не найден");
        }
    }
    public class StepTest {

        private static final String GLOBAL_PARAMETER = "global value";

        @Test
        public void annotatedStepTest() {
            annotatedStep("local value");
        }

        @Test
        public void lambdaStepTest() {
            final String localParameter = "parameter value";
            Allure.step(String.format("Parent lambda step with parameter [%s]", localParameter), (step) -> {
                step.parameter("parameter", localParameter);
                Allure.step(String.format("Nested lambda step with global parameter [%s]", GLOBAL_PARAMETER));
            });
        }

        @Step("Parent annotated step with parameter [{parameter}]")
        public void annotatedStep(final String parameter) {
            nestedAnnotatedStep();
        }

        @Step("Nested annotated step with global parameter [{this.GLOBAL_PARAMETER}]")
        public void nestedAnnotatedStep() {

        }

    }
}