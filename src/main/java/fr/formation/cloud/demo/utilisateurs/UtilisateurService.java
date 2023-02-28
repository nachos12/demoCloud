package fr.formation.cloud.demo.utilisateurs;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UtilisateurService {

    private final UtilisateurRepository repository;

    public UtilisateurService(UtilisateurRepository repository) {
        this.repository = repository;
    }

    public List<Utilisateur> findAll() {
        return repository.findAll();
    }

    public Utilisateur save(Utilisateur entity) {
        return repository.save(entity);
    }

    public Utilisateur findById(String id) {
        return repository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Utilisateur non trouvé"));
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
