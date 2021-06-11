package edu.smu.M2ChallengeSpringberryMercury.controller;

import edu.smu.M2ChallengeSpringberryMercury.models.Definition;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class DefinitionController {

    private static int idCounter = 1;
    private static List<Definition> definitionList = initWordList();


    @GetMapping(value = "/word")
    @ResponseStatus(HttpStatus.OK)
    public Definition getRandomWordAndDefinition() {

        Random rand = new Random();
        return definitionList.get(rand.nextInt(definitionList.size()));

    }

    private static List<Definition> initWordList() {
        List<Definition> definitionList = new ArrayList<>();
        definitionList.add(new Definition("Bean", "an edible seed, typically kidney-shaped, growing in long pods on certain leguminous plants", idCounter++));
        definitionList.add(new Definition("Java", "a large island in the Malay Archipelago that forms part of Indonesia", idCounter++));
        definitionList.add(new Definition("Public", "of or concerning the people as a whole", idCounter++));
        definitionList.add(new Definition("Private", "belonging to or for the use of one particular person or group of people only", idCounter++));
        definitionList.add(new Definition("Controller", "a person or thing that directs or regulates something", idCounter++));
        definitionList.add(new Definition("Rest", "cease work or movement in order to relax, refresh oneself, or recover strength", idCounter++));
        definitionList.add(new Definition("Status", "the relative social, professional, or other standing of someone or something", idCounter++));
        definitionList.add(new Definition("Idea", "a thought or suggestion as to a possible course of action", idCounter++));
        definitionList.add(new Definition("Code", "a system of words, letters, figures, or other symbols substituted for other words, letters, etc., especially for the purposes of secrecy", idCounter++));
        definitionList.add(new Definition("Commit", "carry out or perpetrate (a mistake, crime, or immoral act)", idCounter++));

        return definitionList;

    }

}
