package stepdefinition;
import cucumber.api.java.en.Given;

public class GitRepoStar_HomePageFeature {
	@Given("The Market is ope")
    public void i_have_n_cukes_in_my_belly(int cukes) {
        System.out.format("Cukes: %n\n", cukes);
    }
}


