package edu.smu.M2ChallengeSpringberryMercury.controller;

import edu.smu.M2ChallengeSpringberryMercury.models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class QuoteController {

    private static int idCounter = 1;

    private static List<Quote> quotesList = new ArrayList<>(Arrays.asList(
            new Quote( "Nassim Nicholas Taleb" , "When you develop your opinions on the basis of weak evidence, you will have difficulty interpreting subsequent information that contradicts these opinions, even if this new information is obviously more accurate.", idCounter++ ),
           new Quote("Nassim Nicholas Taleb", "Remember that you are a Black Swan.", idCounter++),
           new Quote("Nassim Nicholas Taleb", "The problem with experts is that they do not know what they do not know", idCounter++),
           new Quote("Nassim Nicholas Taleb", "We tend to use knowledge as therapy.", idCounter++),
           new Quote("Nassim Nicholas Taleb", "The inability to predict outliers implies the inability to predict the course of history", idCounter++),
            new Quote("Nassim Nicholas Taleb", "I will repeat the following until I am hoarse: it is contagion that determines the fate of a theory in social science, not its validity.", idCounter++),
            new Quote("Nassim Nicholas Taleb", "If you survive until tomorrow, it could mean that either a) you are more likely to be immortal or b) that you are closer to death.", idCounter++),
            new Quote("Nassim Nicholas Taleb", "Prediction, not narration, is the real test of our understanding of the world.", idCounter++),
            new Quote("Nassim Nicholas Taleb", "Believe me, it is tough to deal with the social consequences of the appearance of continuous failure. We are social animals; hell is other people.", idCounter++),
            new Quote("Nassim Nicholas Taleb", "We are quick to forget that just being alive is an extraordinary piece of good luck, a remote event, a chance occurrence of monstrous proportions.", idCounter++)
    ) );

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Quote getRandomQuote(){
        Random rand = new Random();
        return quotesList.get(rand.nextInt(quotesList.size()));
    }
}
