package org.example.vikas.pratice.folder1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MobileAppHighestRatingCalculator {

    public RatingsResult calculate(List<MobileApp> mobileApps) {

        RatingsResult ratingsResult = new RatingsResult();

        // group by category
        // find the highest rated app in each category
        // add comments to resultant app
        mobileApps.stream()
                .collect(Collectors.groupingBy(mobileApp -> mobileApp.category))
                .forEach((category, apps) -> {
                            MobileApp resultApp = apps.stream().max(Comparator.comparingInt(app -> app.ratings))
                                    .get();
                            resultApp.comments = "You're picked";
                            ratingsResult.result.add(resultApp);
                        }
                );

        return ratingsResult;
    }
}

