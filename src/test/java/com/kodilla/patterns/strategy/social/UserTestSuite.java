package com.kodilla.patterns.strategy.social;
import org.junit.Assert;
import org.junit.Test;


public class UserTestSuite {

    @Test
    public void testDefaultInvestingStrategies() {
        //Given
        User joanna = new Millenials("Joanna Krupa");
        User anna = new YGeneration("Anna Nowak");
        User jan = new ZGeneration("Jan Kowalski");

        //When
        String joannaPost = joanna.sharePost();
        System.out.println(joannaPost);
        String annaPost = anna.sharePost();
        System.out.println(annaPost);
        String janPost = jan.sharePost();
        System.out.println(janPost);

        //Then
        Assert.assertEquals("Facebook published", joannaPost);
        Assert.assertEquals("Twitter published", annaPost);
        Assert.assertEquals("Snapchat published", janPost);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User aleksander = new Millenials("Aleks Kowalski");

        //When
        String aleksanderPost = aleksander.sharePost();
        System.out.println(aleksanderPost);
        aleksander.checkSharePost(new SnapchatPublisher());
        aleksanderPost= aleksander.sharePost();
        System.out.println(aleksanderPost);

        //Then
        Assert.assertEquals("Snapchat published", aleksanderPost);
    }
}

