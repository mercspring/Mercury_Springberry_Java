package edu.smu.M2ChallengeSpringberryMercury.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.smu.M2ChallengeSpringberryMercury.models.Question;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(EightBallController.class)
public class EightBallControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    @Test
    public void shouldReturn200AndSomeContentWhenHit() throws Exception {
        Question questionForTheMightyEightBall = new Question("What time is it?");
        String inputJson = mapper.writeValueAsString(questionForTheMightyEightBall);
        mockMvc.perform(post("/magic")
                .content(inputJson)
                .contentType(MediaType.APPLICATION_JSON)
        )
                .andDo(print())
                .andExpect(status().isAccepted())
                .andExpect(jsonPath("$").isNotEmpty());
    }

    @Test
    public void shouldReturn422IfNoQuestionProvided() throws Exception{
        Question questionForTheMightyEightBall = new Question("");
        String inputJson = mapper.writeValueAsString(questionForTheMightyEightBall);
        mockMvc.perform(post("/magic")
                .content(inputJson)
                .contentType(MediaType.APPLICATION_JSON)
        )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturn422IfQuestionDoesNotEndWithQuestionMark() throws Exception{
        Question questionForTheMightyEightBall = new Question("Will the sun come up tomorrow");
        String inputJson = mapper.writeValueAsString(questionForTheMightyEightBall);
        mockMvc.perform(post("/magic")
                .content(inputJson)
                .contentType(MediaType.APPLICATION_JSON)
        )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }
}