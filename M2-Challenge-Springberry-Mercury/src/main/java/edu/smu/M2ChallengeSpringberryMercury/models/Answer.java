package edu.smu.M2ChallengeSpringberryMercury.models;

import java.util.Objects;

public class Answer {
    public String question;
    public String answer;
    public int id;

    public Answer(String answer, int id) {
        this.answer = answer;
        this.id = id;
    }

    public Answer(){

    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answer answer = (Answer) o;
        return id == answer.id && Objects.equals(question, answer.question) && Objects.equals(this.answer, answer.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question, answer, id);
    }

    @Override
    public String toString() {
        return "Eightball{" +
                "question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", id=" + id +
                '}';
    }
}
