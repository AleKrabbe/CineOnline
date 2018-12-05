<%-- 
    Document   : nav
    Created on : 30/11/2018, 02:05:32
    Author     : Alexandre Krabbe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<jsp:useBean id="user" scope="session" type="model.entities.User" />

<nav class="navbar fixed-top navbar-expand-md navbar-dark bg-dark">
    <a class="navbar-brand" href="./">CineOnline <i class="fal fa-film-alt"></i></a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbar" aria-controls="navbar" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbar">
        <ul class="navbar-nav mr-auto">
        </ul>
        <div class="nav-item-bkg">
            <a class="nav-btn" href="cart">
                <div class="shoppingcart">
                    <i class="fal fa-shopping-cart"></i>
                    <div class="cartitems align-middle">${fn:length(sessionScope.cart.movies)}</div>
                </div>           
            </a>
        </div>
        <div class="nav-item-bkg">
            <a class="nav-btn" href="account">
                <i class="fal fa-user-circle"></i>
                <c:choose>
                    <c:when test="${empty user.fname}">
                        <span>Login</span>
                    </c:when>
                    <c:otherwise>
                        <span>Bem-vindo,<br>${user.fname} ${user.lname}</span>
                    </c:otherwise>
                </c:choose>
            </a>
        </div>

    </div>

</nav>
