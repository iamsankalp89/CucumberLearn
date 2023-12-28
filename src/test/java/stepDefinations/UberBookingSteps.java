package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingSteps {

    @Given("User want to select a car type {string} from uber app")
    public void user_want_to_select_a_car_type_from_uber_app(String carType) {
        System.out.println("Step 1: User want to select a car type: " +carType+" from uber app");
       
    }
    @When("User select car {string} and pick up point is {string} and drop location is {string}")
    public void user_select_car_and_pick_up_point_is_and_drop_location_is(String carType, String pickLocation, String dropLocation) {
        System.out.println("Step 2: User select car: "+carType+" and pick up point is: "+pickLocation+" and drop location is "+dropLocation);
    }
    @Then("Driver start the journey")
    public void driver_start_the_journey() {
        System.out.println("Driver start the journey");
    }
    @Then("Driver end the journey")
    public void driver_end_the_journey() {
        System.out.println("Driver end the journey");
    }
    @Then("User pays {int} money")
    public void user_pays_the_money(int amount) {
        System.out.println("Uber pays the money: "+amount);
    }

}
