package fr.formation.cloud.demo.utilisateurs;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Utilisateur {
    @Id
    private String id;
    private String nom;
    private String prenom;
}
