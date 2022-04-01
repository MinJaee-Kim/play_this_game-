package Kuportfolio.playthisgame.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
public class GameDTO {
    private int story;
    private int challenge;
    private int collect;
    private int tech;
    private int casual;
    private int collabo;

    public GameDTO(int story, int challenge, int collect, int tech, int casual, int collabo) {
        this.story = story;
        this.challenge = challenge;
        this.collect = collect;
        this.tech = tech;
        this.casual = casual;
        this.collabo = collabo;
    }

    public int getStory() {
        return story;
    }

    public void setStory(int story) {
        this.story = story;
    }

    public int getChallenge() {
        return challenge;
    }

    public void setChallenge(int challenge) {
        this.challenge = challenge;
    }

    public int getCollect() {
        return collect;
    }

    public void setCollect(int collect) {
        this.collect = collect;
    }

    public int getTech() {
        return tech;
    }

    public void setTech(int tech) {
        this.tech = tech;
    }

    public int getCasual() {
        return casual;
    }

    public void setCasual(int casual) {
        this.casual = casual;
    }

    public int getCollabo() {
        return collabo;
    }

    public void setCollabo(int collabo) {
        this.collabo = collabo;
    }
}
