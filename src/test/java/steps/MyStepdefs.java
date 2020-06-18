package steps;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.DataTableType;
import io.cucumber.java.DocStringType;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MyStepdefs {

    private static ObjectMapper objectMapper = new ObjectMapper();

    @DataTableType(replaceWithEmptyString = "[blank]")
    public UserInfo convert(Map<String, String> entry) {
        return new UserInfo(
          entry.get("username"),
          entry.get("password").concat("@#$@#$@#@#$")
        );
    }

    @Given("I login as admin")
    public void iLoginAsAdmin(List<UserInfo> userInfoList) {

        System.out.println("UserName - " + userInfoList.get(0).username + " Password - "+ userInfoList.get(0).password);

    }


    @ParameterType("[^\"]*")
    public List<String> book(String bookName) {
        return Arrays.asList(bookName.split(","));
    }

    @And("I have few books in hand such as {book}")
    public void iHaveFewBooksInHandSuchAsJavaJsCsharp(List<String> books) {

        System.out.println(books.get(2));

    }


    @DocStringType
    public JsonNode json(String docString) throws JsonProcessingException {
        return objectMapper.readTree(docString);
    }


    @Given("some more information")
    public void someMoreInformation(JsonNode jsonNode) {

        JsonNode name = jsonNode.get("Name");
        JsonNode company = jsonNode.get("Company");

        System.out.println("Name " + name + ", Company " + company);

    }


    private class UserInfo {
        public String username;
        public String password;

        public UserInfo(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }

}
