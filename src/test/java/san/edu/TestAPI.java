package san.edu;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import san.edu.tables.FemaleFullName;
import san.edu.tables.FemaleLastName;
import san.edu.tables.MaleFullName;
import san.edu.tables.MaleLastName;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TestAPI {

    Random random = new Random();

    @LocalServerPort
    private int port;

    @Test
    void femaleFullNameTest() {
        Response allNamesResponse = RestAssured.given().port(port)
                .get("/api/female/fullName/getAll");

        assertThat(allNamesResponse.getStatusCode()).isEqualTo(200);

        List<FemaleFullName> allNamesList = Arrays.stream(allNamesResponse.as(FemaleFullName[].class)).toList();

        assertThat(allNamesList.size()).isGreaterThan(0);

        String fullName = allNamesList.get(random.nextInt(allNamesList.size())).getFullName();

        Response response = RestAssured.given().port(port)
                .param("fullName",fullName)
                .get("/api/female/fullName/");

        assertThat(response.getStatusCode()).isEqualTo(200);

        List<FemaleFullName> responseList = response.getBody().jsonPath().getList("");

        assertThat(responseList.size()).isGreaterThan(0);

    }


    @Test
    void femaleLastNameTest() {
        Response allNamesResponse = RestAssured.given().port(port)
                .get("/api/female/lastName/getAll");

        assertThat(allNamesResponse.getStatusCode()).isEqualTo(200);

        List<FemaleLastName> allNamesList = Arrays.stream(allNamesResponse.as(FemaleLastName[].class)).toList();

        assertThat(allNamesList.size()).isGreaterThan(0);

        String lastName = allNamesList.get(random.nextInt(allNamesList.size())).getLastName();

        Response response = RestAssured.given().port(port)
                .param("lastName",lastName)
                .get("/api/female/lastName/");

        assertThat(response.getStatusCode()).isEqualTo(200);

        List<FemaleLastName> responseList = response.getBody().jsonPath().getList("");

        assertThat(responseList.size()).isGreaterThan(0);
    }

    @Test
    void maleFullNameTest() {
        Response allNamesResponse = RestAssured.given().port(port)
                .get("/api/male/fullName/getAll");

        assertThat(allNamesResponse.getStatusCode()).isEqualTo(200);

        List<MaleFullName> allNamesList = Arrays.stream(allNamesResponse.as(MaleFullName[].class)).toList();

        assertThat(allNamesList.size()).isGreaterThan(0);

        String fullName = allNamesList.get(random.nextInt(allNamesList.size())).getFullName();

        Response response = RestAssured.given().port(port)
                .param("fullName",fullName)
                .get("api/male/fullName/");

        assertThat(response.getStatusCode()).isEqualTo(200);

        List<MaleFullName> responseList = response.getBody().jsonPath().getList("");

        assertThat(responseList.size()).isGreaterThan(0);
    }

    @Test
    void maleLastNameTest() {
        Response allNamesResponse = RestAssured.given().port(port)
                .get("/api/male/lastName/getAll");

        assertThat(allNamesResponse.getStatusCode()).isEqualTo(200);

        List<MaleLastName> allNamesList = Arrays.stream(allNamesResponse.as(MaleLastName[].class)).toList();

        assertThat(allNamesList.size()).isGreaterThan(0);

        String lastName = allNamesList.get(random.nextInt(allNamesList.size())).getLastName();

        Response response = RestAssured.given().port(port)
                .param("lastName",lastName)
                .get("api/male/lastName/");

        assertThat(response.getStatusCode()).isEqualTo(200);

        List<MaleLastName> responseList = response.getBody().jsonPath().getList("");

        assertThat(responseList.size()).isGreaterThan(0);
    }
}
