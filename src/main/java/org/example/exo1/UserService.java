package org.example.exo1;

public class UserService {
    private UserRepository userRepository;

    // Constructeur
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Méthode pour récupérer un utilisateur par son ID
    public User getUserById(long id) {
        return userRepository.findUserById(id);
    }
}