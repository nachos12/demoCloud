package fr.formation.cloud.demo.utilisateurs;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UtilisateurRepository extends MongoRepository<Utilisateur, String> {
}
