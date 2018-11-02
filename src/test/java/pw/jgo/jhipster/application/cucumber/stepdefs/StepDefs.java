package pw.jgo.jhipster.application.cucumber.stepdefs;

import pw.jgo.jhipster.application.PwblogpageApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = PwblogpageApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
