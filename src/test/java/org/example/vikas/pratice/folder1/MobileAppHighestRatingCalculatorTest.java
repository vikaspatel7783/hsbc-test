package org.example.vikas.pratice.folder1;

import org.example.vikas.pratice.folder1.MobileApp;
import org.example.vikas.pratice.folder1.MobileAppHighestRatingCalculator;
import org.example.vikas.pratice.folder1.RatingsResult;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MobileAppHighestRatingCalculatorTest {

    List<MobileApp> mobileApps = new ArrayList<>();
    MobileAppHighestRatingCalculator ratingCalculator = new MobileAppHighestRatingCalculator();

    @Before
    public void setUp() throws Exception {
        mobileApps.add(new MobileApp("App1", "Health", 4, null));
        mobileApps.add(new MobileApp("App2", "Finance", 4, null));
        mobileApps.add(new MobileApp("App3", "Health", 3, null));
        mobileApps.add(new MobileApp("App4", "Finance", 2, null));
        mobileApps.add(new MobileApp("App5", "Education", 5, null));
        mobileApps.add(new MobileApp("App6", "Education", 3, null));
    }

    @Test
    public void calculate() {
        RatingsResult ratingsResult = ratingCalculator.calculate(mobileApps);
        Assert.assertTrue(ratingsResult.result.contains(new MobileApp("App1", "Health", 4, "You're picked")));
        Assert.assertTrue(ratingsResult.result.contains(new MobileApp("App2", "Finance", 4, "You're picked")));
        Assert.assertTrue(ratingsResult.result.contains(new MobileApp("App5", "Education", 5, "You're picked")));
    }
}