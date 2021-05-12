package com.company;

public class FicheCSS {
    public String render() {

        StringBuilder html = new StringBuilder();
        html.append( "/* import fonts */\n" +
                "@font-face {\n" +
                "    font-family: \"RobotoMedium\";\n" +
                "    src: url('https://fonts.googleapis.com/css2?family=Roboto:wght@100&display=swap%27');\n" +
                "}\n" +
                "\n" +
                "@font-face {\n" +
                "    font-family: \"RobotoLight\";\n" +
                "    src: url('https://fonts.googleapis.com/css2?family=Roboto:wght@500&display=swap');\n" +
                "}\n" +
                "\n" +
                "body{\n" +
                "    background: #eaeaea;\n" +
                "    margin-top:20px;\n" +
                "    font-family: 'RobotoLight', sans-serif;\n" +
                "}\n" +
                "\n" +
                "header{\n" +
                "    width: 100%;\n" +
                "    margin-bottom: 2%;\n" +
                "    border-bottom: 2px black solid;\n" +
                "    height: 100px;\n" +
                "}\n" +
                "\n" +
                "/* image check */\n" +
                "#case {\n" +
                "    width:15px;\n" +
                "}\n" +
                "\n" +
                "/* image logo entreprise */\n" +
                "#logo {\n" +
                "    float: left;\n" +
                "    margin-top: -3%;\n" +
                "}\n" +
                "\n" +
                "/* titre fiche agent */\n" +
                "#titre{\n" +
                "    text-align: center;\n" +
                "    font-family: 'RobotoLight', sans-serif;\n" +
                "}\n" +
                "\n" +
                "/* image home */\n" +
                "#accueil {\n" +
                "    float: right;\n" +
                "    padding-top: 1%;\n" +
                "    padding-right: 1%;\n" +
                "    margin-top: -3%; \n" +
                "}\n" +
                "\n" +
                "/* nom */\n" +
                "h4 {\n" +
                "font-size : 32px;\n" +
                "font-family: 'RobotoLight', sans-serif;\n" +
                "}\n" +
                "\n" +
                "/* matériels */\n" +
                "table {\n" +
                "    margin: auto;\n" +
                "    color: #659224;\n" +
                "}\n" +
                "\n" +
                "#materiel{\n" +
                "    margin-top: 20%;\n" +
                "    text-align: left;\n" +
                "    display: block;\n" +
                "    font-size : 26px;    \n" +
                "}\n" +
                "\n" +
                "#tableau {\n" +
                "     margin : auto;\n" +
                "}\n" +
                "\n" +
                ".container{\n" +
                "    border : 2px black solid;\n" +
                "    padding: 0;\n" +
                "}\n" +
                "\n" +
                ".table.table-profile th {\n" +
                "    border: none;\n" +
                "    color: #000;\n" +
                "    padding-bottom: 0.3125rem;\n" +
                "    padding-top: 0;\n" +
                "\n" +
                "}\n" +
                ".table.table-profile td {\n" +
                "    border-color: #c8c7cc;\n" +
                "    color: #659224;\n" +
                "}\n" +
                "\n" +
                ".profile-header {\n" +
                "    position: relative;\n" +
                "    overflow: hidden;\n" +
                "}\n" +
                "\n" +
                ".profile-header .profile-header-cover {\n" +
                "    background-color: #379EC1;\n" +
                "    position: absolute;\n" +
                "    left: 0;\n" +
                "    right: 0;\n" +
                "    top: 0;\n" +
                "    bottom: 0;\n" +
                "}\n" +
                "\n" +
                ".profile-header .profile-header-content,\n" +
                ".profile-header-img, .profile-header-img,\n" +
                "body .fc-icon { \n" +
                "    position: relative;\n" +
                "}\n" +
                "\n" +
                ".profile-header .profile-header-content {\n" +
                "    color: #fff;\n" +
                "    padding: 1.25rem;\n" +
                "    height: 200px;\n" +
                "}\n" +
                "\n" +
                ".profile-header-img {\n" +
                "    float: right;\n" +
                "    width: 7.5rem;\n" +
                "    height: 7.5rem;\n" +
                "    margin: 0 1.25rem -1.25rem 0;\n" +
                "    padding: 0.1875rem;\n" +
                "    border-radius: 0.25rem;\n" +
                "    background: #fff;\n" +
                "}\n" +
                "\n" +
                ".profile-header-info h4 {\n" +
                "    font-weight: 500;\n" +
                "    margin-bottom: 0.3125rem;\n" +
                "}\n" +
                "\n" +
                ".profile-container {\n" +
                "    padding: 1.5625rem;\n" +
                "}\n" +
                "\n" +
                "@media (max-width: 967px) {\n" +
                "    .profile-header-img {\n" +
                "        width: 5.625rem;\n" +
                "        height: 5.625rem;\n" +
                "        margin: 0;\n" +
                "    }\n" +
                "\n" +
                "    #logo {\n" +
                "    float: left;\n" +
                "    margin-top: -6%;\n" +
                "    }\n" +
                "\n" +
                "    #accueil {\n" +
                "        float: right;\n" +
                "        padding-top: 1%;\n" +
                "        padding-right: 1%;\n" +
                "        margin-top: -6%; \n" +
                "    }\n" +
                "\n" +
                "    .profile-header{height: 150px;}\n" +
                "}\n" +
                "@media (max-width: 767px) {\n" +
                "    .profile-header-img {\n" +
                "        width: 3.75rem;\n" +
                "        height: 3.75rem;\n" +
                "        margin: 0;\n" +
                "    }\n" +
                "    .profile-header-info {\n" +
                "        margin-left: 4.6875rem;\n" +
                "        padding-bottom: 0.9375rem;\n" +
                "    }\n" +
                "    .profile-header-info h4 {\n" +
                "        margin: 0 0 0.3125rem;\n" +
                "    }\n" +
                "    .profile-container {\n" +
                "        padding: 0.9375rem 0.9375rem 3.6875rem;\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                ".profile-header-img img {\n" +
                "    max-width: 100%;\n" +
                "}\n" +
                ".table.table-profile th {\n" +
                "    border: none;\n" +
                "    color: #000;\n" +
                "    padding-bottom: 0.3125rem;\n" +
                "    padding-top: 0;\n" +
                "}\n" +
                ".table.table-profile td {\n" +
                "    border-color: #c8c7cc;\n" +
                "}" );


        return html.toString();
    }

}
