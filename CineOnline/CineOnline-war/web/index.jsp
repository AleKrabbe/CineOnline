<%-- 
    Document   : home
    Created on : 18/11/2018, 17:57:08
    Author     : palmeiira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>

<!doctype html>

<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link href="plugins/fontawesome/css/all.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="css/home.css"/>

        <script src="plugins/fontawesome/js/all.js"></script>
        <title>CineOnline</title>
    </head>
    <body>
        <%@include file="includes/nav.html" %>

        <div class="album py-5">
            <div class="container">
                <div class="row">

                    <c:choose>
                        <c:when test="${empty lista}">
                            <p>- N&atilde;o h&aacute; filmes registrados </p>
                        </c:when>
                        <c:otherwise>
                            <c:forEach var="movie" items="${lista}">

                                <div class="col-md-3">
                                    <div class="card mb-4 shadow-sm">
                                        <img class="image card-img-top" src="media/poster/${movie.poster}" data-holder-rendered="true">
                                        <div class="play-btn">
                                            <i class="play-btn-ico fas fa-play"></i>
                                        </div>
                                        <div class="card-body">
                                            <p class="card-text">${movie.title}</p>
                                            <small class="text-muted">${movie.duration} mins</small>
                                        </div>
                                    </div>
                                </div>                               
                            </c:forEach>
                        </c:otherwise>
                    </c:choose>

                </div>
            </div><!--container-->
        </div>

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </body>
</html>
