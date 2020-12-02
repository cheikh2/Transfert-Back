package org.sid.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
public class Emetteur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomEme;
    private String prenomEme;
    private String telephoneEme;
    private String cni;
    @JsonIgnore
    @OneToMany(mappedBy = "emetteur", fetch = FetchType.LAZY)
    private Collection<Envoie> envoies;

    public Emetteur(Long id, String nomEme, String prenomEme, String telephoneEme, String cni) {
        this.id = id;
        this.nomEme = nomEme;
        this.prenomEme = prenomEme;
        this.telephoneEme = telephoneEme;
        this.cni = cni;
        this.envoies = envoies;
    }
}
