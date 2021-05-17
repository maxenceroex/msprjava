package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static Agent[] creationAgent() {
        try {
            //Ouverture de l'accès en lecture au fichier staff.txt
            //Récupération des ID de chagues agents dans le fichier staff.txt
            //Dans un tableau de chaine de caractère
            BufferedReader FE = new BufferedReader(new FileReader("infotxt/staff.txt"));
            String ligne = null;
            //On créer une liste d'agent pour y stocker toutes les instances Agent qu'on crééra par la suite
            List<String> listeIdAgents = new ArrayList<>();
            while ((ligne = FE.readLine()) != null) {
                listeIdAgents.add(ligne);
            }
            List<Agent> listAgent = new ArrayList<>();
            //On parcours la liste des ID et pour chacun d'eux on lit le fichier se nommant <ID>.txt
            //contenue dans le dossier "infotxt"
            for (String idAgent : listeIdAgents) {
                //Ouverture en lecture du fichier <ID>.txt
                FE = new BufferedReader(new FileReader("infotxt/"+idAgent + ".txt"));
                String prenomAgent = null;
                String nomAgent = null;
                List<String> objetsAgent = new ArrayList<>();
                boolean flag = false;
                int i = 0;
                // On parcours le fichier <ID>.txt ligne par ligne afin de connaitre les données souhaité de l'agent
                //qu'on placera dans des variables temporaire
                while ((ligne = FE.readLine()) != null) {
                    i++;
                    if (i == 1) prenomAgent = ligne;
                    if (i == 2) nomAgent = ligne;
                    try {
                        if (flag == true) objetsAgent.add(ligne);
                        if (ligne.equals("")) flag = true;
                    }catch (NullPointerException e){
                        System.out.println("erreur NullPointerException");
                    }
                }
                //On récupère les différentes variables et on instancie notre objet Agents
                Agent agent = new Agent(prenomAgent, nomAgent, objetsAgent);
                //On ajoute l'agent nouvellement créé dans la liste d'agent
                listAgent.add(agent);
            }
            //On ferme le fichier en lecture
            FE.close();
            // On retourne la liste de tout les agents créé
            Agent[] myListeAgent = new Agent[listAgent.size()];
            return listAgent.toArray(myListeAgent);
        } catch (FileNotFoundException e) {
            System.out.println("Le fichier n'existe pas");
        } catch (IOException e) {
            System.out.println("erreur lecture de fichier");
        }
        return null;
    }

    public static void main(String[] args) {
        List<String> listeDesgents = new ArrayList<>();
        PrintWriter FS = null;
        try {
            FS = new PrintWriter(new FileOutputStream("index.html"));
        } catch (FileNotFoundException e) {
            System.out.println("erreur d'ouverture de index.html");
            System.exit(0);
        }
        // récupération des id des agents via le fichier staff.txt
        try {
            BufferedReader FE = new BufferedReader(new FileReader("infotxt/staff.txt"));

            String ligne = null;
            while ((ligne = FE.readLine()) != null) listeDesgents.add(ligne);
            FE.close();
        } catch (FileNotFoundException e) {
            System.out.println("Le fichier staff.txt n'existe pas");
        } catch (IOException e) {
            System.out.println("erreur lecture staff.txt");
        }
        AccueilToHtml accueilToHtml = new AccueilToHtml();
        String listeDesAgentsEnHtml = accueilToHtml.render((listeDesgents.toArray(new String[listeDesgents.size()])));
        FS.print(listeDesAgentsEnHtml);
        FS.close();
        Agent [] agentsInfos = creationAgent();
        PrintWriter FSFicheAgent = null;
        int idx = 0;
        for (String IDAgent : listeDesgents) {
            try {
                FSFicheAgent = new PrintWriter(new FileOutputStream("html/" +IDAgent + ".html"));
            } catch (FileNotFoundException e) {
                System.out.println("errreur d'ouverture "+ IDAgent +".html");
                System.exit(0);
            }
            FicheAgentsToHtml ficheAgentsToHtml = new FicheAgentsToHtml();
            String htmlFiche = ficheAgentsToHtml.render(agentsInfos[idx]);
            FSFicheAgent.print(htmlFiche);
            FSFicheAgent.close();
            idx++;
        }
        try {
            FS = new PrintWriter(new FileOutputStream("stylesheet.css"));
        } catch (FileNotFoundException e) {
            System.out.println("errreur d'ouverture de stylesheet.css");
            System.exit(0);
        }
        FicheCSS steelsheet   = new FicheCSS();
        String css = steelsheet.render();
        FS.print(css);
        FS.close();
    }
}

