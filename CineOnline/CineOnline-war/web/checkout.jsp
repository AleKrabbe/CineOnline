<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link href="plugins/fontawesome/css/all.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="css/esquema.css"/>
        <link rel="stylesheet" type="text/css" href="css/checkout.css"/>

        <script src="plugins/fontawesome/js/all.js"></script>
        <title>CineOnline</title>
    </head>
    <body>
        <jsp:useBean id="cart" scope="session" type="model.entities.Cart" />
        <%@include file="includes/nav.jsp" %>

        <div class="container">
            <div class="row">
                <div class="col">
                    <h2>Produtos</h2>
                </div>
            </div>

            <div class="row mt-2">
                <div class="col">
                    <div class="card">
                        <div class="card-header">
                            Filmes Selecionados <i class="fas fa-ticket"></i>
                        </div>
                        <div class="card-body">

                            <div class="container m-0">
                                <div class="row">
                                    <div class="col-6">
                                        <div class="album">
                                            <div class="container my-0">
                                                <div class="row">
                                                    <c:forEach var="movie" items="${cart.movies}">
                                                        <div class="movie-card col-4">
                                                            <div class="card mb-4 shadow-sm">
                                                                <img class="image card-img-top" src="media/poster/${movie.poster}" data-holder-rendered="true">
                                                                <div class="container card-body my-0">
                                                                    <div class="row">
                                                                        <div class="col-12 pl-0">
                                                                            <a href="movie?id=${movie.id}">${movie.title}</a>
                                                                        </div>                                                    
                                                                    </div>                                   
                                                                </div>
                                                            </div>
                                                        </div> 
                                                    </c:forEach>
                                                </div>
                                            </div>                                
                                        </div>
                                    </div>
                                    <div class="col-6">
                                        <table class="table">
                                            <thead>
                                                <tr>
                                                    <th scope="col">#</th>
                                                    <th scope="col">Título</th>
                                                    <th scope="col">Preço</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <c:choose>
                                                    <c:when test="${empty sessionScope.cart.movies}">
                                                        <tr>
                                                            <td colspan="3">N&atilde;o h&aacute; filmes selecionados.</td>
                                                        </tr>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <c:forEach var = "j" begin = "0" end = "${fn:length(cart.movies)-1}">
                                                            <tr>
                                                                <th scope="row">${j+1}</th>
                                                                <td><a href="movie?id=${cart.movies[j].id}">${cart.movies[j].title}</a></td>
                                                                <td>R$ ${cart.movies[j].price}</td>
                                                            </tr>
                                                        </c:forEach>
                                                    </c:otherwise>
                                                </c:choose>
                                                <tr>
                                                    <td class="pb-0"></td>                                                    
                                                    <td class="pb-0 text-right pr-0">Subtotal =</td>
                                                    <td class="pb-0 pl-0">&nbsp;R$ ${cart.subTotal}</td>
                                                </tr>
                                                <tr>
                                                    <td class="border-top-0 py-0"></td>                                                    
                                                    <td class="border-top-0 py-0 text-right pr-0">Descontos =</td>
                                                    <td class="border-top-0 py-0 pl-0">&nbsp;R$ ${cart.discount}</td>
                                                </tr>
                                                <tr>
                                                    <td class="border-top-0 py-0"></td>                                                    
                                                    <td class="border-top-0 py-0 text-right pr-0">Total =</td>
                                                    <td class="border-top-0 py-0 pl-0">&nbsp;R$ ${cart.subTotal - cart.discount}</td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>


                        </div>
                    </div>
                </div>
            </div>

            <hr>

            <div class="row my-3">
                <div class="col">
                    <h2>Método de Pagamento</h2>
                </div>
            </div>

            <div class="row my-3">
                <div class="col">
                    <div class="card">
                        <div class="card-header">
                            CineOnline Wallet <i class="fas fa-wallet ml-2"></i>
                        </div>
                        <div class="card-body">
                            <h5 class="card-title">Pague com o saldo da sua conta</h5>
                            <p class="card-text">O CineOnline agora permite que você aluge filmes sem ter que usar um cartão de crédito!</p>
                            <form method="post">
                                <input type="submit" name="pay-wallet" value="Pagar agora" class="btn btn-primary" disabled="true">
                            </form>
                        </div>
                    </div>
                </div>
            </div>

            <div class="row my-3">
                <div class="col">
                    <div class="card">
                        <div class="card-header">
                            Cartão de Crédito <i class="fas fa-credit-card-front ml-2"></i>
                        </div>
                        <div class="card-body">
                            <h5 class="card-title">Pague com cartão de crédito</h5>
                            <p class="card-text">Pague utilizando um de seus cartões cadastrados, ou adicione um novo cartão.</p>
                            <hr>
                            <form method="post">

                                <div class="form-group">
                                    <c:forEach var = "i" begin = "0" end = "${fn:length(user.cards)-1}">
                                        <div class="form-check form-check-inline">
                                            <input class="form-check-input" type="radio" name="inlineCardOptions" id="inlineRadio${i}" value="${i}">
                                            <label class="form-check-label" for="inlineRadio${i}">                                           

                                                <c:choose>
                                                    <c:when test = "${user.cards[i].flag == 1}">
                                                        <i class="fab fa-cc-visa card-icon"></i>
                                                    </c:when>

                                                    <c:otherwise>
                                                        <i class="fab fa-cc-mastercard card-icon"></i>
                                                    </c:otherwise>
                                                </c:choose>

                                                ${user.cards[i].endsWith}

                                            </label>
                                        </div>
                                    </c:forEach>  
                                </div>

                                <div class="form-group">
                                    <input type="submit" name="pay-checkout" value="Pagar" class="btn btn-primary">
                                </div>       

                            </form>                    
                        </div>
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="col">
                    <form method="post">
                        <input type="submit" name="cancel-checkout" value="Cancelar" class="btn btn-secundary float-right">
                    </form>
                </div>
            </div>

        </div>
    </body>
</html>
