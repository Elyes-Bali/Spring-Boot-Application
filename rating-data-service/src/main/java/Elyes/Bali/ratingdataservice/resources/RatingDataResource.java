package Elyes.Bali.ratingdataservice.resources;

import Elyes.Bali.ratingdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Elyes.Bali.ratingdataservice.models.Rating;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingDataResource {

    @RequestMapping("/{movieId}")
    public Rating gestRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 4);
    }


        @RequestMapping("users/{userId}")
        public UserRating gestUserRating(@PathVariable("userId") String userId){
           List <Rating> ratings= Arrays.asList(
                   new Rating("123456",4),
                   new Rating("5678",3)
           );
           UserRating userRating=new UserRating();
           userRating.setUserRating(ratings);
           return userRating;



    }
}
