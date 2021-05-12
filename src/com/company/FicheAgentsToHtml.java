package com.company;

public class FicheAgentsToHtml {

    public String render( Agent agents) {

        StringBuilder html = new StringBuilder();
        html.append( "<!doctype html>\n" );
        html.append( "<html lang='en'>\n" );

        html.append( "<head>\n" );
        html.append( "<meta charset='utf-8'>\n" );
        html.append( "<title>Fiche Agent</title>\n" );
        html.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
        html.append("<link href=\"http://netdna.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" rel=\"stylesheet\">");
        html.append("<link rel=\"stylesheet\" href=\"../stylesheet.css\">");
        html.append("</head>");
        html.append("<header>");
        html.append("    <div id=\"header\">");
        html.append("        <h4 id=\"titre\">FICHE AGENT</h4>");
        html.append("        <img src=\"../images/logo.png\" alt=\"\" id=\"logo\" width=\"171\" /> ");
        html.append("        <a href=\"../index.html\"><img id=\"accueil\" width=\"80\" src=\"../images/accueil.png\"/></a>");
        html.append("    </div>");
        html.append("</header>");
        html.append("<body>\n");
        html.append("<div class=\"container\">");
        html.append("<div id=\"content\" class=\"content p-0\">");
        html.append("    <div class=\"profile-header\">");
        html.append("        <div class=\"profile-header-cover\"></div>");
        html.append("        <div class=\"profile-header-content\">");
        html.append("            <div class=\"profile-header-img\">");
        String ID = agents.getPrenom().charAt(0) + agents.getNom();
        html.append("                <img src=\"../images/"+ ID.toLowerCase() +".jpg\" alt=\"\" />");
        html.append("            </div>");
        html.append("            <div class=\"profile-header-info\">");
        html.append("                <h4 class=\"m-t-sm\">"+agents.getNom()  +" "+  agents.getPrenom()+"</h4>");
        html.append("            </div>");
        html.append("        </div>");
        html.append("    </div>");
        html.append("    <div class=\"profile-container\">");
        html.append("        <div class=\"row row-space-20\">");
        html.append("            <div class=\"col-md-8\" id=\"tableau\">");
        html.append("                <div class=\"tab-content p-0\">");
        html.append("                    <div class=\"tab-pane active show\" id=\"profile-about\">");
        html.append("                        <table class=\"table table-profile\">");
        html.append("                            <thead>");
        html.append("                                <tr>");
        html.append("                                    <th colspan=\"2\">Matériels</th>");
        html.append("                                </tr>");
        html.append("                            </thead>");
        html.append("                            <tbody>");
        for ( String objet : agents.getObjet()) {
            html.append( "                           <tr>\n" +
                    "                                    <td ><img id=\"case\" src=\"../images/case.png\"/></td>\n" +
                    "                                    <td>"+ objet +"</td>\n" +
                    "                                </tr>" );
        }
        html.append("                            </tbody>");
        html.append("                        </table>");
        html.append("                    </div>");
        html.append("                </div>");
        html.append("            </div>");
        html.append("        </div>");
        html.append("    </div>");
        html.append("</div>");
        html.append("</div>");
        html.append("<script src=\"http://code.jquery.com/jquery-1.10.2.min.js\"></script>");
        html.append("<script src=\"http://netdna.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>");
        html.append("<script type=\"text/javascript\">");
        html.append("</script>");
        html.append("</body>");
        html.append("</html>");
        return html.toString();
    }
}
