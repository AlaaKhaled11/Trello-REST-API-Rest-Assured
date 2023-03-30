import io.restassured.RestAssured;

public class GetLists {
    public static void main(String[] args) {
        RestAssured.given().baseUri("https://api.trello.com/1/boards/63b9e993b215d90108464eb3/").
                queryParam("key","625b00e82d7a1e3f9a281c151b0fc62a").
                queryParam("token","ATTAfbf2c0c4ed5d513d79c889ec06840e34af19a7826b00bc683395b6b9e7acfe34FCE7D36A").
                header("Content-Type","application/json").
                get().prettyPrint();
    }
}
