package org.sid.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Data
@NoArgsConstructor
public class Envoie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @CreatedDate
    private Date dateEnvoi;
    private Double montant;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Emetteur emetteur;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Recepteur recepteur;

    public Envoie(long id, Date dateEnvoi, Double montant, Emetteur emetteur, Recepteur recepteur) {
        this.id = id;
        this.dateEnvoi = dateEnvoi;
        this.montant = montant;
        this.emetteur = emetteur;
        this.recepteur = recepteur;
    }

}