package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="Features_Registrasi", glue="stepDefinition_Registrasi")

public class TestRunner_Registrasi {

}


