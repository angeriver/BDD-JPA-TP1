package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
public class UserEntity {
    @Id
    private Long idUser;

    private Boolean sSO;

    private OffsetDateTime lastConnexion;

    @OneToOne
    private SessionEntity git;

}
