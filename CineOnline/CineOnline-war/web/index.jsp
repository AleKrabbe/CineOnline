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
        <link rel="stylesheet" type="text/css" href="css/esquema.css"/>
        <link rel="stylesheet" type="text/css" href="css/home.css"/>

        <script src="plugins/fontawesome/js/all.js"></script>
        <title>CineOnline</title>
    </head>
    <body>
        <jsp:useBean id="cart" scope="session" type="model.entities.Cart" />
        <%@include file="includes/nav.jsp" %>

        <div class="album py-5">
            <div class="container">
                <div class="row">
                    <div class="search col-md-9">
                        <input class="form-control" type="text" placeholder="Buscar" aria-label="Search" id="searchInput">
                    </div>                    
                </div>
                <div class="movies-container row">

                    <c:choose>
                        <c:when test="${empty lista}">
                            <p>- N&atilde;o h&aacute; filmes registrados </p>
                        </c:when>
                        <c:otherwise>
                            <c:forEach var="movie" items="${lista}">
                                <c:if test="${not fn:contains(sessionScope.cart.movies, movie)}">
                                    <div class="movie-card col-md-3">
                                        <div class="card mb-4 shadow-sm">
                                            <img class="image card-img-top" src="media/poster/${movie.poster}" data-holder-rendered="true">
                                            <div class="play-btn">
                                                <form method="post">
                                                    <input type="hidden" value="${movie.id}" name="movie_id">
                                                    <button type="submit" class="transparent-btn">
                                                        <i class="add-cart-btn-ico fas fa-cart-arrow-down"></i>
                                                    </button>
                                                </form>                                            
                                            </div>
                                            <div class="container card-body">
                                                <div class="row">
                                                    <div class="col-12 pl-0">
                                                        <a href="movie?id=${movie.id}">${movie.title}</a>
                                                    </div>                                                    
                                                </div>
                                                <div class="row">
                                                    <div class="col-8 pl-0">
                                                        <small class="text-muted">${movie.duration} mins</small>
                                                    </div>
                                                    <div class="col-4 rating">
                                                        <small class="text-muted">${movie.rating} <i class="fas fa-star"></i></small>
                                                    </div>
                                                </div>                                                
                                            </div>
                                        </div>
                                    </div> 
                                </c:if>
                            </c:forEach>
                        </c:otherwise>
                    </c:choose>

                </div>

                <div id="error-container" class="row">
                    <div class="notfound">
                        <div class="notfound-404">
                            <h1>OPS...</h1>
                        </div>
                        <h2>Nenhum resultado encontrado</h2>
                    </div>
                </div>

            </div><!--container-->
        </div>

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
        <script src="js/home.js" type="text/javascript"></script>

    </body>
</html>
