<HTML>
<HEAD>
<TITLE>Concours Rayman DC US/ Ubi Soft</TITLE>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</HEAD>

<body bgcolor="#488000" TOPMARGIN=0 LEFTMARGIN=0 MARGINWIDTH=0 MARGINHEIGHT=0 link="Yellow" vlink="yellow">

<?PHP
if (empty($firstname)||empty($lastname)||empty($email)||empty($address)||empty($zip)||empty($state)||empty($city)){
   	print("<P>
	 	<FONT FACE=\"ARIAL\" SIZE=3 color=\"yellow\">
		 Sorry some information are missing
		 <BR>
		 <A HREF=\"javascript: self.close()\" ><font size=1 face=\"Arial\">Return</font></A>
		 </BODY>
		 </HTML>");
		}
elseif (!ereg("[@]","$email")||!ereg("[\.]","$email")){print("<P>
	 	<FONT FACE=\"ARIAL\" SIZE=3 color=\"yellow\">
		Please enter a real e-mail address
		 <BR>
		 <A HREF=\"javascript: self.close()\" ><font size=1 face=\"Arial\">Return</font></A>
		 </BODY>
		 </HTML>");
		 }
elseif (!ereg("\.com","$email")&&!ereg("\.us","$email")&&!ereg("\.edu","$email")&&!ereg("\.net","$email")&&!ereg("\.org","$email")){print("<P>
	 	<FONT FACE=\"ARIAL\" SIZE=3 color=\"yellow\">
		Sorry but you must live in America to participate.
		 <BR>
		 <A HREF=\"javascript: self.close()\" ><font size=1 face=\"Arial\">Return</font></A>
		 </BODY>
		 </HTML>");
		 }		 
elseif (ereg("[\|\*\\~\$]","$lastname")){print("<P>
	 	<FONT FACE=\"ARIAL\" SIZE=3 color=\"yellow\">Please enter only letters in your last name
		 <BR>
		 <A HREF=\"javascript: self.close()\" ><font size=1 face=\"Arial\">Return</font></A>
		 </BODY>
		 </HTML>");
	   	 }
elseif (ereg("[\|\*\\~\$]","$firstname")){print("<P>
	 	<FONT FACE=\"ARIAL\" SIZE=3 color=\"yellow\">Please enter only letters in your first name
		 <BR>
		 <A HREF=\"javascript: self.close()\" ><font size=1 face=\"Arial\">Return</font></A>
		 </BODY>
		 </HTML>");
	   	 }
elseif (ereg("[\|\*\\~\$]","$city")){print("<P>
	 	<FONT FACE=\"ARIAL\" SIZE=3 color=\"yellow\">Please enter only letters in the city field !
		 <BR>
		 <A HREF=\"javascript: self.close()\" ><font size=1 face=\"Arial\">Return</font></A>
		 </BODY>
		 </HTML>");
	   	 }
elseif (ereg("[\|\*\\~\$]","$state")){print("<P>
	 	<FONT FACE=\"ARIAL\" SIZE=3 color=\"yellow\">Please enter only letters in the state field !
		 <BR>
		 <A HREF=\"javascript: self.close()\" ><font size=1 face=\"Arial\">Return</font></A>
		 </BODY>
		 </HTML>");
	   	 }
elseif (ereg("[\|\*\\~\$]","$zip")){print("<P>
	 	<FONT FACE=\"ARIAL\" SIZE=3 color=\"yellow\">Invalid characters in the zip field !
		 <BR>
		 <A HREF=\"javascript: self.close()\" ><font size=1 face=\"Arial\">Return</font></A>
		 </BODY>
		 </HTML>");
	   	 }
elseif (empty($answer1)||empty($answer2)||empty($answer3)|empty($track)){
   	print("<P>
	 	<FONT FACE=\"ARIAL\" SIZE=3 color=\"yellow\">
		 Go back and give all the answers !
		 <BR>
		 <A HREF=\"javascript: self.close()\" ><font size=1 face=\"Arial\">Return</font></A>
		 </BODY>
		 </HTML>");
	}
elseif (ereg("[\|\*\\~\$]","$answer1")){print("<P>
	 	<FONT FACE=\"ARIAL\" SIZE=3 color=\"yellow\">Invalid characters in the first question !
		 <BR>
		 <A HREF=\"javascript: self.close()\" ><font size=1 face=\"Arial\">Return</font></A>
		 </BODY>
		 </HTML>");
	   	 }
elseif (ereg("[\|\*\\~\$]","$answer2")){print("<P>
	 	<FONT FACE=\"ARIAL\" SIZE=3 color=\"yellow\">Invalid characters in the second question !
		 <BR>
		 <A HREF=\"javascript: self.close()\" ><font size=1 face=\"Arial\">Return</font></A>
		 </BODY>
		 </HTML>");
	   	 }
elseif (ereg("[\|\*\\~\$]","$answer3")){print("<P>
	 	<FONT FACE=\"ARIAL\" SIZE=3 color=\"yellow\">Invalid characters in the third question !
		 <BR>
		 <A HREF=\"javascript: self.close()\" ><font size=1 face=\"Arial\">Return</font></A>
		 </BODY>
		 </HTML>");
	   	 }
elseif (ereg("Select first color","$answer1")){print("<P>
	 	<FONT FACE=\"ARIAL\" SIZE=3 color=\"yellow\">Please answer the first color of the first question !
		 <BR>
		 <A HREF=\"javascript: self.close()\" ><font size=1 face=\"Arial\">Return</font></A>
		 </BODY>
		 </HTML>");
	   	 }
elseif (ereg("Select second color","$answer12")){print("<P>
	 	<FONT FACE=\"ARIAL\" SIZE=3 color=\"yellow\">Please answer the second color of the first question !
		 <BR>
		 <A HREF=\"javascript: self.close()\" ><font size=1 face=\"Arial\">Return</font></A>
		 </BODY>
		 </HTML>");
	   	 }
elseif (ereg("Select an answer","$answer2")){print("<P>
	 	<FONT FACE=\"ARIAL\" SIZE=3 color=\"yellow\">Please answer the second question !
		 <BR>
		 <A HREF=\"javascript: self.close()\" ><font size=1 face=\"Arial\">Return</font></A>
		 </BODY>
		 </HTML>");
	   	 }	 
elseif (ereg("Select an answer","$answer3")){print("<P>
	 	<FONT FACE=\"ARIAL\" SIZE=3 color=\"yellow\">Please answer the third question !
		 <BR>
		 <A HREF=\"javascript: self.close()\" ><font size=1 face=\"Arial\">Return</font></A>
		 </BODY>
		 </HTML>");
	   	 }		 
elseif (ereg("[\|\*\\~\$]","$track")){print("<P>
	 	<FONT FACE=\"ARIAL\" SIZE=3 color=\"yellow\">Invalid characters in the question !
		 <BR>
		 <A HREF=\"javascript: self.close()\" ><font size=1 face=\"Arial\">Return</font></A>
		 </BODY>
		 </HTML>");
	   	 }
else {

	 /* enregistrement du concours */
	 $conn = mysql_connect("arakn.ubisoft.fr","sqluser","U53r4sQl");
	 if (!$conn) { echo "Could not connect\n"; exit;} 
   	 mysql_select_db("concours",$conn);  
	 
	 $address=addslashes("$address");
	 $answer1=addslashes("$answer1");
	 $answer2=addslashes("$answer2");
	 $answer3=addslashes("$answer3");
	 $track=addslashes("$track");
	 
	 $SQL_string  = "INSERT into raymandc_usa (lastname,firstname,address,city,state,zip,email,answer1,answer12, answer2,answer3,track)"; 
	 $SQL_string .= " VALUES ('$lastname','$firstname','$address','$city','$state','$zip','$email','$answer1','$answer12','$answer2','$answer3','$track')";  

	 $insert_string = mysql_query($SQL_string); 
	 if (!$insert_string) { echo "Une erreur est survenue. $SQL_string"; exit;}

	 $days=335-date(z); //on suppose que les resultats sont le 31 mai
	 
	 /* page web si tous les champs remplis: */	 
	  print("<CENTER>
	 		 	 <TABLE WIDTH=500 BORDER=0 height=100%>
	 		 	 <TR>
	 		 	 <TD>
	 		 	 <CENTER>
	 		 	 <IMG BORDER=0 ALT=\"Concours Rayman DC\" SRC=\"images/logodc.gif\" BORDER=\"0\">
	 		 	 <P>
	 		 	 <FONT FACE=\"ARIAL\" SIZE=3 color=\"yellow\">
	 		 
	 		 	 Thank you,<BR>
	 		 	 Results to be known in $days days
	 		 	 <BR>
	 		 	 <P>
	 		 	 See you soon !
	 		 	 <P>
	 		 	 <A HREF=\"javascript: self.close()\" ><font size=1 face=\"Arial\">Return</font></A>
	 		 	 </CENTER>
	 		 	 </TD>
	 		 	 </TR>
	 		 	 </TABLE>
	 		 	 </CENTER>
	 		 	</BODY>
		</HTML>");
	}
?>