package edu.smu.M2ChallengeSpringberryMercury.controller;

import edu.smu.M2ChallengeSpringberryMercury.models.Answer;
import edu.smu.M2ChallengeSpringberryMercury.models.Question;
import edu.smu.M2ChallengeSpringberryMercury.models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class EightBallController {

    private static int idCounter = 1;

    private static List<Answer> answersList = new ArrayList<>(Arrays.asList(
            new Answer( "It is Certain." , idCounter++ ),
            new Answer( "It is decidedly so." , idCounter++ ),
            new Answer( "Without a doubt." , idCounter++ ),
            new Answer( "Yes definitely." , idCounter++ ),
            new Answer( "You may rely on it. " , idCounter++ ),
            new Answer( "As I see it, yes." , idCounter++ ),
            new Answer( "Most likely." , idCounter++ ),
            new Answer( "Outlook good." , idCounter++ ),
            new Answer( "Yes." , idCounter++ ),
            new Answer( "Signs point to yes." , idCounter++ ),
            new Answer( "Reply hazy, try again." , idCounter++ ),
            new Answer( "Ask again later." , idCounter++ ),
            new Answer( "Better not tell you now." , idCounter++ ),
            new Answer( "Cannot predict now." , idCounter++ ),
            new Answer( "Concentrate and ask again." , idCounter++ ),
            new Answer( "Don't count on it." , idCounter++ ),
            new Answer( "My reply is no." , idCounter++ ),
            new Answer( "My sources say no." , idCounter++ ),
            new Answer( "Outlook not so good." , idCounter++ ),
            new Answer( "Very doubtful. " , idCounter++ )
    ) );

    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    public Answer spinTheEightBall(@RequestBody @Valid Question question){
        Random rand = new Random();
        Answer returnItem = answersList.get(rand.nextInt(answersList.size()));
        returnItem.setQuestion(question.question);
        return returnItem;
    }
}
