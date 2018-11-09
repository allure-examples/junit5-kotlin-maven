package io.qameta.junit5;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.junit.jupiter.api.*;

/**
 * eroshenkoam
 * 24.10.17
 */
public class SimpleTest {

    @Test
    @Feature("Some feature")
    @Severity(SeverityLevel.CRITICAL)
    public void testOutput() {
        firstStep();
    }

    @Step
    public void firstStep() {

    }

    @Test
    void skippedTest(){
        Assumptions.assumeTrue(false);
    }

    @Test
    void failedTest(){
        Assertions.assertTrue(true);
    }
}
