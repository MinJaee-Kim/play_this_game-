package Kuportfolio.playthisgame.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "gamede")
public class Game {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String name;
    public int story;
    public int challenge;
    public int collect;
    public int tech;
    public int casual;
    public int collabo;
    public String uri;
//    public String videoURL;
//    public String explain;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }


}
