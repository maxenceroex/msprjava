package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static Agent[] creationAgent() {
        try {
            BufferedReader FE = new BufferedReader(new FileReader("infotxt/staff.txt"));
            String ligne = null;
            List<String> listeIdAgents = new ArrayList<>();
            while ((ligne = FE.readLine()) != null) {
                listeIdAgents.add(ligne);
            }
            List<Agent> listAgent = new ArrayList<>();
            for (String idAgent : listeIdAgents) {
                FE = new BufferedReader(new FileReader("infotxt/"+idAgent + ".txt"));
                String prenomAgent = null;
                String nomAgent = null;
                List<String> objetsAgent = new ArrayList<>();
                boolean flag = false;
                int i = 0;
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
                Agent agent = new Agent(prenomAgent, nomAgent, objetsAgent);
                listAgent.add(agent);
            }
            FE.close();
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

