package com.company;

public class FicheCSS {
    public String render() {

        StringBuilder html = new StringBuilder();
        html.append( "@import url('https://fonts.googleapis.com/css2?family=Roboto:wght@100&display=swap%27');\n" +
                "@import url('https://fonts.googleapis.com/css2?family=Roboto:wght@500&display=swap');\n" +
                "\n" +
                "\n" +
                "\n" +
                "#case {\n" +
                "\twidth:15px;\n" +
                "}\n" +
                "img.photo {\n" +
                "\n" +
                "max-width: 15%;\n" +
                "float: right;\n" +
                "margin-right: 40px;\n" +
                "\n" +
                "}\n" +
                "\n" +
                "button {\n" +
                "\n" +
                "font-size : 26px;\t\n" +
                "font-weight: normal;\n" +
                "margin-left: 40px;\n" +
                "}\n" +
                "\n" +
                "p{\n" +
                "\n" +
                " font-weight: lighter;\n" +
                "font-family: 'Roboto', sans-serif;\n" +
                " text-align: center;\n" +
                " font-size : 20px;\n" +
                " height: 600px;\n" +
                "}\n" +
                "\n" +
                "#materiel{\n" +
                "\tmargin-top: 23%;\n" +
                "\ttext-align: right;\n" +
                "\tdisplay: block;\n" +
                "}\n" +
                "\n" +
                "table{\n" +
                "\tmargin: auto;\n" +
                "}\n" +
                "\n" +
                "body {\n" +
                " text-align: bottom;\n" +
                " font-family: 'Roboto', sans-serif;\n" +
                " font-weight: bold;\n" +
                "}" );


        return html.toString();
    }

}
