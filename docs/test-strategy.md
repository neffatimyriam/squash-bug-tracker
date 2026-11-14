# Stratégie de test de Squash (v0.1)

Statut : validée en discussion le 2026-11-14. Document vivant : il évoluera avec le projet.

## 1. Niveaux de test et outils

### Back-end
| Niveau | Ce qu'on vérifie | Outil | Introduction |
|---|---|---|---|
| Unitaire | Une règle isolée (ex. titre vide refusé) | JUnit 5 + Mockito | Dès le premier code |
| Intégration | Le back-end avec une vraie base | Spring Boot Test + Testcontainers | Quand la base arrive |
| API | L'API vue de l'extérieur (codes HTTP, JSON, contrat OpenAPI) | REST Assured | Après le back-end minimal |
| Performance | Tenue en charge | k6 | Plus tard |
| Mutation | Qualité des tests eux-mêmes | PIT | Plus tard |

### Front-end
| Niveau | Ce qu'on vérifie | Outil | Introduction |
|---|---|---|---|
| Unitaire | Une fonction isolée | Vitest | Après le front minimal |
| Composant | Un composant React qui s'affiche et réagit, API simulée | Vitest + React Testing Library | Après le front minimal |
| E2E | Parcours critiques dans un vrai navigateur, avec le vrai back-end | Cypress | Quand le front existe |

## 2. Principes
- Pyramide de tests : beaucoup d'unitaires, un bon volume d'API et d'intégration, peu d'E2E (parcours critiques : créer, lister, modifier, supprimer un ticket).
- Chaque règle est testée à un seul endroit principal, pour éviter les doublons. Exemple : « titre obligatoire » = unitaire + API côté back ; côté front, test de composant qui vérifie l'affichage du message d'erreur.
- Chaque test crée ses propres données et ne dépend d'aucun autre test.
- Un outil à la fois : on introduit chaque outil au moment où il est nécessaire.

## 3. Techniques de conception
Classes d'équivalence, valeurs aux bornes, cas limites. Exemples : titre absent, vide, uniquement des espaces, trop long ; statut inconnu ; modification d'un ticket inexistant (404) ; double suppression.

## 4. Seuils de qualité
- Couverture JaCoCo minimale bloquante dans la CI : 80 % de lignes au départ (à réviser avec du vrai code).
- Aucune alerte bloquante de l'analyse statique ni de l'analyse des dépendances.
- La couverture est un plancher, pas une preuve de qualité : PIT servira de garde-fou plus tard.