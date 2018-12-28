<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Loja</title>
</head>

<body>
<g:if test="${compras}">
    <button type="button" class="btn btn-labeled btn-success center-block">
        <span class="btn-label">
            <i class="fa fa-check"></i>
        </span>
        Compra efetuada com sucesso (COD.: ${compras.id})
    </button>
</g:if>
<g:render template="/layouts/featured"/>
<g:render template="/layouts/callaction"/>
<g:render template="/layouts/content"/>
</body>
</html>
