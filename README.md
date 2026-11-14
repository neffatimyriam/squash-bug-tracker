# Squash

Squash est un mini-gestionnaire de bugs. C'est un **projet d'apprentissage** : l'objectif est de construire une application complète (front-end, back-end, base de données, tests, CI/CD, environnements) avec un processus qualité exigeant.

## Statut

En construction. Rien n'est encore déployé : le dépôt contient pour l'instant la documentation de cadrage.

## Version 1 (MVP)

Un ticket de bug avec un titre, une description, un statut (ouvert, en cours, résolu) et une priorité (basse, moyenne, haute). On peut créer, lister, modifier et supprimer des tickets. Pas de comptes utilisateurs au départ.

Évolutions prévues : utilisateurs, rôles, commentaires, historique.

## Stack envisagée

- Back-end : Java, Spring Boot, API REST, Maven
- Base de données : PostgreSQL, Flyway
- Documentation d'API : OpenAPI
- Front-end : React avec Vite
- Conteneurs : Docker, Docker Compose
- CI/CD : GitHub Actions

La stack est une proposition de départ : elle peut évoluer au fil du projet.

## Qualité

- [Stratégie de test](docs/test-strategy.md)
- [Definition of Done](docs/definition-of-done.md)

## Contribuer

- Le travail se fait sur des branches, jamais directement sur `main`.
- Chaque changement passe par une pull request.
- Les commits suivent la convention `type: description` (par exemple `feat: ...`, `fix: ...`, `docs: ...`).

## Licence

[MIT](LICENSE)