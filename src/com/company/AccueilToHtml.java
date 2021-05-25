package com.company;

public class AccueilToHtml {

        public String render( String[] IDAgents) {


                StringBuilder html = new StringBuilder();
                html.append("<!DOCTYPE html>\n");
                html.append("<html lang=\"fr\">\n");
                html.append("<head>\n");
                html.append("    <meta charset=\"utf-8\">\n");
                html.append("    <title>ACCUEIL</title>\n");
                html.append("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
                html.append("    <link href=\"https://netdna.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
                html.append("    <link rel=\"stylesheet\" href=\"stylesheet.css\">\n");
                html.append("</head>\n");
                html.append("<header>\n");
                html.append("    <div id=\"header\">\n");
                html.append("        <h4 id=\"titre\">ACCUEIL</h4>\n");
                html.append("        <img src=\"../images/logo.png\" alt=\"\" id=\"logo\" width=\"171\" />\n");
                html.append("        <a href=\"#\"><img id=\"accueil\" width=\"80\" src=\"../images/accueil.png\"/></a>\n");
                html.append("    </div>\n");
                html.append("</header>\n");
                html.append("<body>\n");
                html.append("<div class=\"container\">\n");
                html.append("<div id=\"content\" class=\"content p-0\">\n");
                html.append("    <div class=\"profile-header\">\n");
                html.append("        <div class=\"profile-header-cover\"></div>\n");
                html.append("        <div class=\"profile-header-content1\">\n");
                html.append("            <div class=\"profile-header-info\">\n");
                html.append("                <h4 class=\"m-t-sm\">Liste des agents</h4>\n");
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
                html.append("                                    <th colspan=\"2\">Agents</th>\n ");
                html.append("                                </tr>\n");
                html.append("                            </thead>\n");
                html.append("                            <tbody>\n");
                for ( String idagent : IDAgents) {
                        html.append( "<tr>\n" +
                                "        <td><a href= \"html/" + idagent + ".html\">"+ idagent + "</a></td>\n" +
                                "</tr>\n" );
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