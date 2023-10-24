package com.example.Hackaton;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Hackaton {
    @Id
    @GeneratedValue
    private Integer idHackaton;
    private String nomHackathon;
    private String Description;
    private Date dateDebut;
    private Date dateFin;
    private Integer nbMaxEquipes;
    private Date dateCreation;

}
