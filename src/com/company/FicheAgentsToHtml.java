package com.company;

public class FicheAgentsToHtml {

    public String render( Agent agents) {

        StringBuilder html = new StringBuilder();
        html.append( "<!doctype html>\n" );
        html.append( "<html lang='en'>\n" );

        html.append( "<head>\n" );
        html.append( "<meta charset='utf-8'>\n" );
        html.append( "<title>Fiche Agent</title>\n" );
        html.append( "<link rel=\"stylesheet\" href=\"stylesheet.css\">" );
        html.append( "</head>\n\n" );
        html.append( "<body>\n" );
        String ID = agents.getPrenom().charAt(0) + agents.getNom();
        html.append("<h1> "+
                 agents.getNom()  + agents.getPrenom() +"\n" +
                "<img class=\"photo\" src=\"images/"+ ID.toLowerCase() +".jpg\" />\n" +
                "\n" +
                "</h1>");
        html.append("<div id=\"materiel\">");
        html.append("<table id=\"tablemateriel\">");
        html.append("<tr>\n" +
                "\t    <th width=\"250\"></td>\n" +
                "\t    <th width=\"50\"></td>\n" +
                "\t  </tr>");
        for ( String objet : agents.getObjet()) {
            html.append( "<tr> <td> "+ objet + "</td> <td><img id=\"case\" src=\"images/image2.png\"/> </td> </tr>\n" );
        }
        html.append( "</ul>\n" );
        html.append( "</body>\n\n" );
        html.append( "</html>" );

        return html.toString();
    }
}
