package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewsList = new HashMap<>();

    public ReviewRepository() {
        Review johnPKee = new Review(1L, "Strength", "John P Kee & The New Life Community Choir", "/images/praise-jpk.jpg", "Praise", "With crowd favorites such as Clap Your Hands, Stand and Turn Around, John P. Kee never fails to give you just want you needed. Strength is the type of song that you can listen to every day (Especially in the morning). The catchy tune and empowering adlibs pull you up from a bad mood and remind you of the promises of God. People from all ages can enjoy this song and Praise The Lord. \n" +
                "\n" +
                "If I ever find myself down, I am thankful that I can always turn on Strength to give me that needed spiritual boost. Like the good book says, God inhabits the praises of his people.\n" +
                "\n" +
                "Go ahead and listen! Can you hold the notes as long as the choir?!\n");
        Review fredHammond = new Review(2L, "Please Don't Pass Me By", "Fred Hammond and Radical for Christ","/images/worship-fh.jpg", "Worship", "I've been guilty of constantly having my hand out asking for things during my interactions with God. At times it's necessary to take a step back from everything that's on your plate and focus on Him. Please Don't Pass Me By is the perfect song for that journey into the Lord's presence.\n" +
                "\n" +
                "Fred Hammond and Radical For Christ tenderly sing the story of many of us; bogged down with guilt and shame, we desperately look to Christ for our help. You can't help but be thankful for the opportunity to truly be whole.\n" +
                "\n" +
                "I encourage you to check it out when you have a chance. You never know, it may change your life! ");
        Review kirkFranklin = new Review(3L, "Love Theory", "Kirk Franklin and The Family","/images/workout-kf.jpg", "Exercise", "Kirk Franklin and The Family have always been at the forefront of progressive gospel music. From upbeat tempos to features with secular artists, they have taught us that we all have can have a way to get to God. \n" +
                "\n" +
                "Working out is hard enough. Being able to vibe to these tunes gives you that extra bump to take it to the next level. You'll finish refreshed, encouraged and possibly ready for a bit more.\n" +
                "\n" +
                "Add this song to your workout list. You'll be glad that you did!");

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
