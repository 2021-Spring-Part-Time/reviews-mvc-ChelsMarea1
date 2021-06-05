package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewsList = new HashMap<>();

    public ReviewRepository() {
        Review johnPKee = new Review(1L, "Strength", "", "Praise", "");
        Review fredHammond = new Review(2L, "Please Don't Pass Me By", "", "Worship", "");
        Review kirkFranklin = new Review(3L, "Love Theory", "", "Workout", "");

        reviewsList.put(johnPKee.getId(), johnPKee);
        reviewsList.put(fredHammond.getId(), fredHammond);
        reviewsList.put(kirkFranklin.getId(), kirkFranklin);
    }
    public ReviewRepository(Review... reviewsToAdd) {
        for(Review review : reviewsToAdd) {
            reviewsList.put(review.getId(), review);
        }
    }
    public Review findOne(long id) {return reviewsList.get(id);}
    public Collection<Review> findAll() {
        return reviewsList.values();
    }
}
