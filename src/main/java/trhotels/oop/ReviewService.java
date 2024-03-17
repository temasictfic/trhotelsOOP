package trhotels.oop;

import java.util.List;
import java.util.stream.Collectors;

public class ReviewService implements IReviewManager{
    private List<AReview> reviews;

    public ReviewService(List<AReview> reviews) {
        this.reviews = reviews;
    }

    @Override
    public AReview addReview(AReview newReview) {
        reviews.add(newReview);
        return newReview;
    }
    
    @Override
    public boolean deleteReview(AReview review) {
        return reviews.remove(review);
    }

    public List<AReview> getUserReviews(User user) {
        return reviews.stream()
            .filter(review -> review.getUser().equals(user))
            .collect(Collectors.toList());
    }

}
