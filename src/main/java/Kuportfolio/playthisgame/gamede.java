package Kuportfolio.playthisgame;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity
@Table(name = "game")
public class gamede{

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int story;
    private int challenge;
    private int collect;
    private int tech;
    private int casual;
    private int collabo;

}
