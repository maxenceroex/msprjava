package com.company;

public class FicheAgentsToHtml {

    public String render( Agent agents) {

        StringBuilder html = new StringBuilder();
        html.append( "<!doctype html>\n" );
        html.append( "<html lang='en'>\n" );

        html.append( "<head>\n" );
        html.append( "<meta charset='utf-8'>\n" );
        html.append( "<title>Fiche Agent</title>\n" );
        html.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
        html.append("<link href=\"https://netdna.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
        html.append("<link rel=\"stylesheet\" href=\"../stylesheet.css\">\n");
        html.append("</head>\n");
        html.append("<header>\n");
        html.append("    <div id=\"header\">\n");
        html.append("        <h4 id=\"titre\">FICHE AGENT</h4>\n");
        html.append("        <img src=\"../images/logo.png\" alt=\"\" id=\"logo\" width=\"171\" />\n ");
        html.append("        <a href=\"../index.html\"><img id=\"accueil\" width=\"80\" src=\"../images/accueil.png\"/></a>\n");
        html.append("    </div>\n");
        html.append("</header>\n");
        html.append("<body>\n");
        html.append("<div class=\"container\">\n");
        html.append("<div id=\"content\" class=\"content p-0\">\n");
        html.append("    <div class=\"profile-header\">\n");
        html.append("        <div class=\"profile-header-cover\"></div>\n");
        html.append("        <div class=\"profile-header-content\">\n");
        html.append("            <div class=\"profile-header-img\">\n");
        String ID = agents.getPrenom().charAt(0) + agents.getNom();
        html.append("                <img src=\"../images/"+ ID.toLowerCase() +".jpg\" alt=\"\" />\n");
        html.append("            </div>\n");
        html.append("            <div class=\"profile-header-info\">\n");
        html.append("                <h4 class=\"m-t-sm\">"+agents.getNom()  +" "+  agents.getPrenom()+"</h4>\n");
        html.append("            </div>\n");
        html.append("        </div>\n");
        html.append("    </div>\n");
        html.append("    <div class=\"profile-container\">\n");
        html.append("        <div class=\"row row-space-20\">\n");
        html.append("            <div class=\"col-md-8\" id=\"tableau\">\n");
        html.append("                <div class=\"tab-content p-0\">\n");
        html.append("                    <div class=\"tab-pane active show\" id=\"profile-about\">\n");
        html.append("                        <table class=\"table table-profile\">\n");
        html.append("                            <thead>\n");
        html.append("                                <tr>\n");
        html.append("                                    <th colspan=\"2\">Matériels</th>\n");
        html.append("                                </tr>\n");
        html.append("                            </thead>\n");
        html.append("                            <tbody>\n");
        for ( String objet : agents.getObjet()) {
            html.append( "                           <tr>\n" +
                    "                                    <td ><img id=\"case\" src=\"../images/case.png\"/></td>\n" +
                    "                                    <td>"+ objet +"</td>\n" +
                    "                                </tr>\n" );
        }
        html.append("                            </tbody>\n");
        html.append("                        </table>\n");
        html.append("                    </div>\n");
        html.append("                </div>\n");
        html.append("            </div>\n");
        html.append("        </div>\n");
        html.append("    </div>\n");
        html.append("</div>\n");
        html.append("</div>\n");
        html.append("<script src=\"https://code.jquery.com/jquery-1.10.2.min.js\"></script>\n");
        html.append("<script src=\"https://netdna.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\n");
        html.append("<script type=\"text/javascript\">\n");
        html.append("</script>\n");
        html.append("</body>\n");
        html.append("</html>\n");
        return html.toString();
    }
}
