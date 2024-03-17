package trhotels.oop;

import java.util.List;
import java.util.stream.Collectors;

public class ReviewService {
    private List<Review> reviews;

    public ReviewService(List<Review> reviews) {
        this.reviews = reviews;
    }

    public Review addReview(Review newReview) {
        reviews.add(newReview);
        return newReview;
    }

    public List<Review> getUserReviews(User user) {
        return reviews.stream()
            .filter(review -> review.getUser().equals(user))
            .collect(Collectors.toList());
    }

    public boolean deleteReview(Review review) {
        return reviews.remove(review);
    }
}
