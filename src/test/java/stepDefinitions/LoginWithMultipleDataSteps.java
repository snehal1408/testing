package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class LoginWithMultipleDataSteps {
    @Given("User is at the login page of the application")
    public void user_is_at_the_login_page_of_the_application() {
        System.out.println("User is at the login page of the application");
//        throw new io.cucumber.java.PendingException();
    }

    @When("User logs in with following username and password")
    public void user_logs_in_with_following_username_and_password(DataTable dataTable) {
        //in older version of cucumber
        //List<List<String>> list_of_rows = dataTable.raw();
        List<List<String>> list_of_rows = dataTable.asLists();
        for (List<String> row : list_of_rows) {
            for (String s : row) {
                System.out.println("data: " + s);
            }
        }
    }

    @Then("User should be able to login with correct username and password")
    public void user_should_be_able_to_login_with_correct_username_and_password() {
        System.out.println("User should be able to login with correct username and password");
        //throw new io.cucumber.java.PendingException();
    }
}
