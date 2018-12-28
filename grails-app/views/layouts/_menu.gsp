<%@ page import="loja.Carrinho" %>
<header>
    <div class="top">
        <div class="container">
            <div class="row">
                <div class="col-md-6">
                    <ul class="topleft-info">
                        <li><i class="fa fa-phone"></i> +62 088 999 123</li>
                    </ul>
                </div>

                <div class="col-md-6">
                    <div id="sb-search" class="sb-search">
                        <form>
                            <input class="sb-search-input" placeholder="Enter your search term..." type="text" value=""
                                   name="search" id="search">
                            <input class="sb-search-submit" type="submit" value="">
                            <span class="sb-icon-search" title="Click to start searching"></span>
                        </form>
                    </div>

                </div>
            </div>
        </div>
    </div>

    <div class="navbar navbar-default navbar-static-top">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html"><asset:image src="img/logo.png" width="199" height="52"/></a>
            </div>

            <div class="navbar-collapse collapse ">
                <ul class="nav navbar-nav">
                    <g:if test="${session.usuario}">
                        <li class="dropdown active">
                            <a href="#" class="dropdown-toggle " data-toggle="dropdown" data-hover="dropdown" data-delay="0" data-close-others="false"><span style="color: #6D0C1F">${session.usuario.nome}</span><i class="fa fa-angle-down"></i></a>
                            <ul class="dropdown-menu">
                                <li><g:link controller="menu" action="logout">Sair</g:link></li>
                                <g:set var="soma" value="${0}"/>
                                <g:set var="total" value="${(loja.Carrinho.findByUsuario(session.usuario)).produtos.collect {soma+=it.preco}}"/>
                                <g:if test="${soma}"><li><g:link controller="compras" action="comprar">Comprar (${soma} R$)</g:link></li></g:if>
                                <g:if test="${session.usuario.administrador}">
                                    <li class="dropdown-submenu">
                                    <a href="#" class="dropdown-toggle " data-toggle="dropdown" data-hover="dropdown">Area do gerente</a>
                                    <ul class="dropdown-menu">
                                        <li><g:link controller="menu" action="cadastrarCategoria">Registrar categoria</g:link></li>
                                        <li><g:link controller="menu" action="cadastrarAdministrador">Registrar gerente</g:link></li>
                                        <g:if test="${loja.Categoria.list()}">
                                        <li><g:link controller="menu" action="cadastrarProdutos">Registrar produto</g:link></li>
                                        </g:if>
                                    </ul>
                                </li>
                                </g:if>
                            </ul>
                        </li>
                    </g:if>

                    <li><g:link controller="Menu">Home</g:link></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle " data-toggle="dropdown" data-hover="dropdown" data-delay="0"
                           data-close-others="false">Produtos <i class="fa fa-angle-down"></i></a>
                        <ul class="dropdown-menu">
                            <g:set var="categorias"/>
                            <g:each in="${loja.Categoria.list()}" var="c">
                                <li><g:link controller="Categoria" action="listar" id="${c.id}">${c.nome}</g:link></li>
                            </g:each>
                        </ul>
                    </li>
                    <li><g:link controller="Menu" action="contatar">Contato</g:link></li>
                    <li><g:link controller="Menu" action="cadastro">Cadastrar-se</g:link></li>
                    <li><g:link controller="Menu" action="login">Entrar</g:link></li>
                </ul>
            </div>
        </div>
    </div>
</header>