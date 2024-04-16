package org.example.exo1;

import org.example.exo1.User;
import org.example.exo1.UserRepository;
import org.example.exo1.UserService;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    void testGetUserById() {
        // Création d'un objet mock pour le UserRepository
        UserRepository userRepositoryMock = mock(UserRepository.class);

        // Création d'un utilisateur de test
        User testUser = new User(1, "testUser", "test@example.com");

        // Définition du comportement du mock pour la méthode findUserById
        when(userRepositoryMock.findUserById(1)).thenReturn(testUser);

        // Création d'une instance de UserService avec le mock UserRepository
        UserService userService = new UserService(userRepositoryMock);

        // Appel de la méthode getUserById avec l'ID de test
        User retrievedUser = userService.getUserById(1);

        // Vérification que l'utilisateur récupéré correspond à celui de test
        assertEquals(testUser, retrievedUser);
    }
}
