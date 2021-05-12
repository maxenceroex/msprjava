package com.company;

public class AccueilToHtml {

public String render( String[] IDAgents) {

        StringBuilder html = new StringBuilder();
        html.append( "<!doctype html>\n" );
        html.append( "<html lang='en'>\n" );
        html.append( "<head>\n" );
        html.append( "<meta charset='utf-8'>\n" );
        html.append( "<title>Report of Reports</title>\n" );
        html.append( "</head>\n\n" );
        html.append( "<body>\n" );
        html.append( "<h1>Liste des Agents</h1>\n" );
        // Make a list in HTML
        html.append( "<ul>\n" );
        // Loop the list of reports passed as argument.
        for ( String idagent : IDAgents) {
            html.append( "<li> <a href= \"html/" + idagent + ".html\">"+ idagent + "</a>  </li>\n" );
        }
        html.append( "</ul>\n" );
        html.append( "</body>\n\n" );
        html.append( "</html>" );

        return html.toString();
    }
}