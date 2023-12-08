package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="Features_AddProduct", glue="stepDefinition_AddProduct")

public class TestRunner_AddProduct {

}


