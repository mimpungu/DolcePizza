# DolcePizza - Gestion de Pizzeria
# by Deo, Sileye, Youba, Nedhal

## Introduction

Ce projet de gestion de pizzeria vise à créer une application web complète qui permet de gérer efficacement les pizzas, les recettes, les moyens de livraison et les commandes. L'application est construite en utilisant les technologies suivantes :
- **Frontend** : HTML, CSS, JavaScript
- **Backend** : Java avec Spring Boot
- **Serveur d'Application** : Apache Tomcat

L'application offre une solution robuste et évolutive pour la gestion des pizzas et des commandes. Elle intègre une API RESTful pour effectuer des opérations CRUD (Créer, Lire, Mettre à jour, Supprimer) et utilise **localStorage** pour persister les données entre les sessions de navigation.

## Fonctionnalités Principales

### 1. Gestion des Pizzas
- **Ajouter une Pizza** : Permet à l'utilisateur d'ajouter une nouvelle pizza avec son nom, taille et ingrédients.
- **Afficher les Pizzas** : Liste toutes les pizzas ajoutées.
- **Modifier une Pizza** : Permet de modifier les détails d'une pizza existante.
- **Supprimer une Pizza** : Permet de supprimer une pizza.

### 2. Gestion des Recettes
- **Ajouter une Recette** : Permet d'ajouter une nouvelle recette avec les ingrédients et les étapes de préparation.
- **Associer une Recette à une Pizza** : Associe une recette spécifique à une pizza.
- **Afficher les Recettes** : Liste toutes les recettes disponibles.

### 3. Gestion des Moyens de Livraison
- **Ajouter un Moyen de Livraison** : Permet d'ajouter un moyen de livraison (ex. livraison à domicile).
- **Associer un Moyen de Livraison à une Commande** : Associe un moyen de livraison à une commande spécifique.
- **Afficher les Moyens de Livraison** : Liste tous les moyens de livraison disponibles.

### 4. Gestion des Commandes
- **Créer une Commande** : Permet de créer une nouvelle commande en sélectionnant des pizzas.
- **Modifier une Commande** : Permet de modifier une commande existante.
- **Annuler une Commande** : Permet d'annuler une commande.
- **Afficher l'Historique des Commandes** : Affiche l'historique de toutes les commandes passées.

### 5. API RESTful avec Spring Boot
L'application expose des endpoints pour effectuer des opérations CRUD sur les pizzas, recettes, moyens de livraison et commandes. Par exemple :
- **POST /api/pizzas** : Ajouter une pizza.
- **GET /api/pizzas** : Récupérer la liste des pizzas.
- **PUT /api/pizzas/{id}** : Modifier une pizza.
- **DELETE /api/pizzas/{id}** : Supprimer une pizza.

### 6. Persistance des Données
L'application utilise **localStorage** pour stocker les données côté client, permettant ainsi une persistance des informations entre les sessions de navigation.

### 7. Interface Utilisateur
L'application propose une interface utilisateur simple avec :
- **Formulaire d'Ajout** : Permet d'ajouter une pizza, recette, moyen de livraison ou commande.
- **Liste Dynamique** : Affiche les éléments comme les pizzas et les recettes.
- **Boutons d'Action** : Pour ajouter, modifier et supprimer des éléments.

## Contraintes Techniques

### 1. Technologies Utilisées
- **Frontend** : HTML, CSS, JavaScript
- **Backend** : Java avec Spring Boot
- **Serveur** : Apache Tomcat
- **Stockage** : localStorage

### 2. Compatibilité
- L'application doit être compatible avec les navigateurs modernes comme **Chrome**, **Firefox**, **Safari**, **Edge**.

### 3. Performance
- L'application doit être réactive et capable de gérer un nombre raisonnable d'éléments sans dégradation des performances.

## Livrables

### 1. Code Source
- Fichiers HTML, CSS, JavaScript pour le frontend.
- Code Java pour l'API backend Spring Boot.
- Documentation du code.

### 2. Documentation
- **Manuel Utilisateur** : Guide pour utiliser l'application.
- **Documentation Technique** : Explications sur les choix techniques et l'architecture de l'application.
- **Documentation de l'API** : Description des endpoints et des formats de données.
- **Javadoc** : Documentation générée pour le code backend.

### 3. Tests
- **Tests manuels** pour vérifier le bon fonctionnement de l'application.
- **Tests unitaires** pour l'API backend.

## Planning

### 1. Phase 1 : Conception
- Définir les fonctionnalités et l'architecture.
- Créer des maquettes de l'interface.

### 2. Phase 2 : Développement
- Développer les fonctionnalités de gestion des pizzas, recettes, commandes, etc.
- Implémenter l'API RESTful avec Spring Boot.

### 3. Phase 3 : Tests
- Effectuer des tests fonctionnels et unitaires.
- Corriger les bugs.

### 4. Phase 4 : Documentation
- Rédiger la documentation utilisateur et technique.

### 5. Phase 5 : Livraison
- Livraison du code source et documentation.

## Bonus

### 1. Fonctionnalités Avancées
- Ajouter des catégories de pizzas (végétarienne, végane).
- Permettre la gestion des recettes associées aux pizzas.
- Ajouter un système de notation pour les pizzas.

### 2. Interface Améliorée
- Ajouter des animations et des transitions pour améliorer l'expérience utilisateur.
- Utiliser **Bootstrap** pour un design moderne.

## Modèle MVC

Le projet suit le modèle MVC (Modèle-Vue-Contrôleur) pour séparer les responsabilités :
- **Model** : Entités comme Pizza, Recette, Commande, Livraison.
- **View** : Interface utilisateur frontend (HTML/CSS/JS).
- **Controller** : Contrôleurs REST pour gérer les requêtes HTTP et les opérations sur les données.

## Conclusion
Ce projet vise à fournir une solution de gestion de pizzeria efficace, évolutive et performante, tout en respectant les bonnes pratiques de développement et les contraintes techniques imposées.
