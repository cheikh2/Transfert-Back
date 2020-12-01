package org.sid.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
public class Recepteur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomRec;
    private String prenomRec;
    private String telephoneRec;
    @JsonIgnore
    @OneToMany(mappedBy = "recepteur", fetch = FetchType.LAZY)
    private Collection<Envoie> envoies;

    public Recepteur(long id, String nomRec, String prenomRec, String telephoneRec, Collection<Envoie> envoies) {
        this.id = id;
        this.nomRec = nomRec;
        this.prenomRec = prenomRec;
        this.telephoneRec = telephoneRec;
        this.envoies = envoies;
    }
}
