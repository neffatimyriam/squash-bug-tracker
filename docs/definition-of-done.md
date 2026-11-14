# Definition of Done de Squash (v0.1)

Statut : validée en discussion le 2026-11-14. Document vivant : il évoluera avec le projet.

S'applique à chaque ticket de travail (GitHub Issue). Un travail est « terminé » quand :

## Code
1. Le code compile et tous les tests existants passent. (automatique en CI)
2. Le code respecte le formatage et l'analyse statique, sans alerte bloquante. (automatique en CI)
3. Aucune vulnérabilité bloquante n'est signalée dans les dépendances. (automatique en CI)

## Tests
4. Les critères d'acceptation du ticket sont couverts par des tests, au bon niveau de la pyramide. (jugement humain)
5. Les cas limites identifiés sont testés, pas seulement le cas nominal. (jugement humain)
6. La couverture reste au-dessus du seuil (80 % de lignes au départ). (automatique en CI)

## Revue et traçabilité
7. Le travail passe par une pull request avec sa checklist remplie, relue avant fusion. (obligation imposée par la protection de la branche `main` ; relecture humaine)
8. Les commits suivent la convention (ex. `feat: ...`, `fix: ...`). (automatisable plus tard)
9. Le ticket GitHub Issue est lié à la pull request. (jugement humain)

## Documentation
10. Le contrat OpenAPI est à jour si l'API a changé, ainsi que le README si l'usage change. (jugement humain)
11. Une décision d'architecture importante est consignée dans une ADR. (jugement humain)

## Remarques
- Critère d'acceptation (propre à une fonctionnalité) ≠ Definition of Done (commune à tous les tickets).
- Une DoD sans vérification automatique finit par ne plus être respectée : on automatise en CI tout ce qui est mesurable (points 1, 2, 3, 6).