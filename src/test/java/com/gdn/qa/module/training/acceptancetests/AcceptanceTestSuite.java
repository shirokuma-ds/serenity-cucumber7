package com.gdn.qa.module.training.acceptancetests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/", glue="com.gdn.qa.module.training", tags = "@WikipediaFeature")
public class AcceptanceTestSuite {}