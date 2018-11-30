<%-- 
    Document   : nav
    Created on : 30/11/2018, 02:05:32
    Author     : Alexandre Krabbe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>

<nav class="navbar navbar-expand-md navbar-dark bg-dark">
    <a class="navbar-brand" href="./">CineOnline <i class="fal fa-film-alt"></i></a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbar" aria-controls="navbar" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbar">
        <ul class="navbar-nav mr-auto">
<!--            <li class="nav-item active">
                <a class="nav-link" href="./">Home <span class="sr-only">(current)</span></a>
            </li>-->
        </ul>
        <!--        <form class="form-inline my-2 my-md-0">
                    <input class="form-control" type="text" placeholder="Search">
                </form>-->
        <a id="nav-btn" href="cart">
            <div class="shoppingcart">
                <i class="fal fa-shopping-cart"></i>
                <div class="cartitems align-middle">${fn:length(sessionScope.cart.movies)}</div>
            </div>           
        </a>
        <a id="nav-btn" href="account"><i class="fal fa-user-circle"></i></a>
    </div>

</nav>
