package stepDefinations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class UserRegistrationSteps {

    @Given("User is on Registration page")
    public void user_is_on_registration_page() {
        System.out.println("User is on Registration page");
    }
    @When("User enters following user details")
    public void user_enters_following_user_details(DataTable dataTable) {

        //List<List<E>> implemented
        //Here asLists return list of String type list as we pass (String.class)
        List<List<String> > list = dataTable.asLists(String.class);
        for (List<String> tempList : list)
        {
            System.out.println(tempList);
        }
    }

    @When("User enters following user details with column")
    public void user_enters_following_user_details_with_column(DataTable dataTable) {
       //List<Map<K,V>>
        //dataTable.asMaps(<Key> == String.class,<value>===String.class)
        List<Map <String,String>> mapList =  dataTable.asMaps(String.class,String.class);

        //Simple way
        //output [{name=Sankalp, profile=Automation, email=sankalp@gmail.com, mobile=92222, city=Pune},
        // {name=Harish, profile=QA, email=hb@gmail.com, mobile=33222, city=Gonda},
        // {name=Vikalp, profile=Dev, email=vk@gmail.com, mobile=92222, city=Bangalore}]
        //System.out.println(mapList);

        for (Map tMap : mapList)
        {
            System.out.println(tMap.get("name"));
            System.out.println(tMap.get("profile"));
            System.out.println(tMap.get("email"));
            System.out.println(tMap.get("mobile"));
            System.out.println(tMap.get("city"));
        }
    }

    @Then("User Registration should be successful")
    public void user_registration_should_be_successful() {
        System.out.println("User Registration should be successful");
    }

}
