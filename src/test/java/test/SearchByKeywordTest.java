package test;

import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import steps.EndUserSteps;

@RunWith(SerenityRunner.class)
public class SearchByKeywordTest extends BaseTest{

    @Steps
    public EndUserSteps userSTeps;
    
    @Test
    public void searching_by_keyword_apple_should_display_the_corresponding_article() {
        userSTeps.looks_for("apple");
        userSTeps.should_see_definition("A common, round fruit produced by the tree Malus domestica, cultivated in temperate climates.");

    }

    @Test
    public void searching_by_keyword_banana_should_display_the_corresponding_article() {
        userSTeps.looks_for("pear");
        userSTeps.should_see_definition("xxxxxx");
    }

    @Pending @Test
    public void searching_by_ambiguious_keyword_should_display_the_disambiguation_page() {
    }
} 