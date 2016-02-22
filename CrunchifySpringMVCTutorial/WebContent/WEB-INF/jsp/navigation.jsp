<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mark Learn</title>
<style type="text/css">
	#LightBlue { background-color: lightblue;}
	#Yellow { background-color: yellow;}
	a:link {    	 
    	 color: red;
    	 text-decoration: none;    	 
	}

	/* visited link */
	a:visited {
	    color: red;
	    text-decoration: none;
	}
	
	/* mouse over link */
	a:hover {
	     color: blue;
	     text-decoration: underline;
	}
	
	/* selected link */
	a:active {
	     color: red;
	     text-decoration: none;
	}
</style>
</head>
<body>			
	<div id="LightBlue">Model and View</div>
	<div id="">
		<a href="/MarkLearn/mark.html">Mark Controller</a>
	</div>
	<br/>
	<div id="LightBlue">Rest WS</div>
	<div>
		<a href="/MarkLearn/rest/greeting/Mark" target="_blank">Greeting Service Spring 4</a>
	</div>
	<div id="">
		<a href="/MarkLearn/rest/speak"  target="_blank">Speak Service Spring 3</a>
	</div>
	<br/>
	<div id="LightBlue">Return XML</div>
	<div>
	<a href="/MarkLearn/returnXML/coffee/Vanilla" target="_blank">Return XML</a>
	</div>
	<br/>
	<div id="LightBlue">JAX B</div>
	<div>
	<a href="/MarkLearn/jaxBee/jax">Marshall Unmarshall</a>
	</div>			
</body>
</html>