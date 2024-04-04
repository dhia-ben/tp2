package org.exo2;

import com.google.javascript.jscomp.deps.ServiceException;

public interface UtilisateurApi {
    void creerUtilisateur(Utilisateur utilisateur) throws ServiceException;
}