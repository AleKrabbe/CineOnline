<%-- 
    Document   : cart
    Created on : 18/11/2018, 17:59:38
    Author     : palmeiira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>

<!doctype html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link href="plugins/fontawesome/css/all.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="css/esquema.css"/>
        <link rel="stylesheet" type="text/css" href="css/cart.css"/>

        <script src="plugins/fontawesome/js/all.js"></script>
        <title>CineOnline</title>
    </head>
    <body>
        <jsp:useBean id="cart" scope="session" type="model.entities.Cart" />
        <%@include file="includes/nav.jsp" %>

        <div class="container cart-container">
            <div class="row">
                <div class="col">
                    <h2>Cart</h2>
                </div>
            </div>
            <div class="row">                
                <div class="col">
                    <table class="table">
                        <thead class="thead-dark">
                            <tr>
                                <th scope="col">Title</th>
                                <th scope="col">Price</th>
                                <th scope="col">Remove</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:choose>
                                <c:when test="${empty sessionScope.cart.movies}">
                                    <tr>
                                        <td colspan="3">No items in the cart</td>
                                    </tr>
                                </c:when>
                                <c:otherwise>
                                    <c:forEach var="movie" items="${sessionScope.cart.movies}">
                                        <tr>
                                            <td><a href="movie?id=${movie.id}">${movie.title}</a></td>
                                            <td>${movie.price}</td>
                                            <td>
                                                <form method="post">
                                                    <input type="hidden" value="${movie.id}" name="delete_movie_id">
                                                    <button type="submit" class="transparent-btn">
                                                        <i class="fal fa-trash-alt"></i>
                                                    </button>
                                                </form>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </c:otherwise>
                            </c:choose>
                            <tr>
                                <td></td>
                                <td>U$ ${sessionScope.cart.subTotal} (subtotal)</td>
                                <td></td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
            <div class="row">
                <div class="col">
                    <div class="float-right">
                        <form method="post" class="form-inline">
                            <div class="form-group mb-2">
                                <input id="cuppon" type="text" name="cuppon" class="form-control" placeholder="discount code">
                                <input type="submit" class="btn btn-success ml-1" value="Apply">
                            </div>                        
                        </form>
                    </div>                    
                </div>
            </div>
            <div class="row">
                <div class="col">
                    <div class="float-right">
                        <form method="post">
                            <input type="reset" value="clear" name="clear" class="btn btn-dark">
                            <input type="submit" value="checkout" name="checkout" class="btn btn-success ml-auto">
                        </form>                        
                    </div>
                </div>
            </div>

    </body>
</html>
