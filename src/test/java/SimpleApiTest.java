import org.junit.Test;
import io.restassured.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.core.IsEqual.*;
import org.hamcrest.core.*;


public class SimpleApiTest {

    String holidaysArr[] = new String[]{"Новый год"};
    //int arrLength = holidaysArr.length;

    @Test
    public void testNewYear() {
        when().get("https://date.nager.at/api/v3/publicholidays/2017/RU").
                then().statusCode(200).body("[0].localName", equalTo("Новый год"));
    }

    @Test
    public void testNewYearHolidays() {
        when().get("https://date.nager.at/api/v3/publicholidays/2017/RU").
                then().statusCode(200).body("[1].localName", equalTo("Новогодние каникулы"));
    }
}
