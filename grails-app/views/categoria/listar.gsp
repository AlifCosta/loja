<%@ page import="loja.Categoria" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Produtos</title>
</head>

<body>
<div class="row">
    <div class="col-lg-4">
        <aside class="left-sidebar">
            <div class="widget">
                <h5 class="widgetheading">Categorias</h5>
                <ul class="cat">
                    <g:each in="${loja.Categoria.list()}" var="c">
                        <li><g:link controller="Categoria" action="listar" id="${c.id}">${c.nome}</g:link></li>
                    </g:each>
                </ul>
            </div>
        </aside>
    </div>

    <div class="col-lg-8">
        <g:each in="${loja.Produto.findAllByCategoria(categoria)}" var="produto" status="i">
            <div class="col-lg-6 col-sm-6 ">
                <div class="thumbnail">
                    <asset:image src="img/Produtos/${produto.foto}"/>
                    <div class="caption">
                        <h3>${produto.nome}</h3>

                        <p>Preço: ${produto.preco} R$</p>

                        <p>Estoque: ${produto.estoque}</p>

                        <p><g:if test="${session.usuario}"><g:link controller="produto" action="adicionarCarrinho" id="${produto.id}"
                                   class="btn btn-primary"><i
                                    class="fa fa-shopping-cart fa-fw"></i> Add ao Carrinho</g:link></g:if>
                            <g:if test="${!session.usuario}"><g:link controller="menu" action="login" id="${produto.id}"
                                                                     class="btn btn-primary"><i
                                        class="fa fa-shopping-cart fa-fw"></i> Add ao Carrinho</g:link></g:if>
                        </p>
                    </div>
                </div>
            </div>
        </g:each>
    </div>
</div>
</body>
</html>