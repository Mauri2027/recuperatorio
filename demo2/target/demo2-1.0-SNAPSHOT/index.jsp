<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>

    <title>JSP - Hello World</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<button id="botonpdf" onclick="extraer()" type="button">PDF </button>
<script>(function ($){
        var url='/informacion';
        $.ajax({
            url:url,
            success:function(response){
                console.log(response);
                $('#js-container').html(response.text);
            }
        })
    });
</script>
<script>
    function extraer(){
        console.log("se toco boton para imprimir: ")
    }
</script>

</body>
</html>