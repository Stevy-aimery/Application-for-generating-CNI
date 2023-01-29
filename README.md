# Application-for-generating-CNI

#### Dans l'optique de mettre en pratique les notions d' HMI vu en classe lors des cours et TPs durant ce semestre, nous avons décidé de mettre un projet en place. Ce projet consiste à la mise en oeuvre d'une application de génération des Cartes Nationales d'Identités. Pour ce premier projet nous avons pris le cas du Gabon. Car ce dernier accuse un retard dans le développement du secteur des serivces numerisés. D'où la motivation de notre choix de projet.

Les outils utilisés pour mener à bien ce projet sont :

```  ECLIPSE (IDE) ```
```ECLIPSE (IDE)
javafx (framework et une bibliothèque d'interface utilisateur issue du projet OpenJFX)
SceneBuilder (outil interactif de conception d'interface graphique pour JavaFX) 
```

#### NB: _Ce projet reste ouvert à toute personne désireuse y prendre part pour l'amélioration de cette première version 1.0_.



### Illustration des interfaces graphiques de l'application.


### Partie 1 : Interfaces coté Demandeur

####     a) Page de réference de l'application coté demandeur

![Page Accueil CNI User Demandeur](https://user-images.githubusercontent.com/94086398/215351219-2e596ade-789e-446d-8829-9faf36f3f869.png)

Cette page accueil des opérateurs desirant faire des demandes de CNI.
Elle admet une Barre de navigation (NavBar) pour faciliter l'acces à d'autres pages de l'application.


####     b) Page A propos de l'application coté demandeur

![Page Apropos](https://user-images.githubusercontent.com/94086398/215352254-d456372a-2251-446f-9861-92276d4b794d.png)

Cette page apparait quant l'utilisateur clic sur le button A propos de la bar de menu.


####     C ) Menu Button de l'application coté demandeur

![Menu bouttons ](https://user-images.githubusercontent.com/94086398/215352385-dd95e612-b840-424e-bc67-50976ae1d6ce.png)

Ce Menu contient des liens vers la page de Création de demande et celle qui permet de faire le suivie de sa demande.


####     d ) Page de Création de la demande

![Page Create demande](https://user-images.githubusercontent.com/94086398/215352606-8fef2226-6a9d-46cc-b6a1-8e43d08bf01b.png)

Permet à un demandeur d'effectué sa demande via le button create demande de la page d'accueil ou via le lien contenu dans le MenuButton de la NavBar.


####     e ) Page Pour le suivie de la demande

![Page Authentification demandeur](https://user-images.githubusercontent.com/94086398/215353019-8d992312-fdd2-4e82-9d20-3e233395d249.png)


####     f ) Page d'accueil du demandeur ayant effuctué une demande

![Page Accueil User Demandeur](https://user-images.githubusercontent.com/94086398/215353527-baa0709c-8fbc-40a9-a988-0a5b66c9662d.png)

Cette page apparait quand le demandeur a bien saisie son Numero de demande qui lui sert d'identifiant. Grace sa session l'utilisateur pourra suivre les etapes de l'état de sa demande à toute instant.


####     g) Page dédié à la Foire Aux Questions

![Page FAQ](https://user-images.githubusercontent.com/94086398/215353446-01a962b9-d369-401b-b9cd-e7fb2f310c6f.png)

Permet à l'utilisateur d'avoir certaines réponses  aux questions sur des informations en rapports avec l'utilité et role de la Carte Nationale d'identité.


### Partie 2 : Interfaces graphiques coté Agent

#### a) Page de réference des Agents.

![Page Connexion demandeur](https://user-images.githubusercontent.com/94086398/215354354-d0ff01a2-ee7c-4351-9e9e-8962afa18e1f.png)

Elle permet à l'agent de se connecter à sa session personnel pour suivre et valider les demandes des demandeurs.

#### b) Page d'accueil tableau de bord de l'Agent.

![Page Accueil agent_](https://user-images.githubusercontent.com/94086398/215354476-debdeb76-38e2-47a2-92a0-5aff51a4cb93.png)

Elle apparait quand l'agent a fourni son login et son mot de passe pour se connecter à sa session.
Elle permet à l'agent de suivre et valider les demandes effectuées par des demandeurs.

#### c) Page de Validation des démandes .

![Page de Verification   validation demande](https://user-images.githubusercontent.com/94086398/215354699-3a21ab8b-023b-4d3f-a8ed-a9f4ec75c850.png)

Elle apparait quand l'agent a selectionné un enregistrement(une demande) et click sur le button qui permet d'afficher les détails liés à la demande. Afin de valider ou rejeter les demandes effectuées par les demandeurs.

