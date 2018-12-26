<!DOCTYPE html>
<html lang="en">

<head>
    <meta name="layout" content="main"/>
    <title>Cadastrar</title>
</head>

<body>



<div id="wrapper">
    <section id="inner-headline">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <ul class="breadcrumb">
                        <li><a href="#"><i class="fa fa-home"></i></a><i class="icon-angle-right"></i></li>
                        <li><a href="#">Features</a><i class="icon-angle-right"></i></li>
                        <li class="active">Register</li>
                    </ul>
                </div>
            </div>
        </div>
    </section>
    <section id="content">
        <div class="container">

            <div class="row">
                <div class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
                    <g:form controller="Usuario">
                        <h2>Entre <small>It's free and always will be.</small></h2>
                        <hr class="colorgraph">
                        <div class="form-group">
                            <g:textField name="email" id="email" class="form-control input-lg" placeholder="Email" tabindex="4"/>
                        </div>
                        <div class="form-group">
                            <g:passwordField name="senha" id="email" class="form-control input-lg" placeholder="Senha" tabindex="4"/>
                        </div>
                        <hr class="colorgraph">
                        <div class="row">
                            <div class="col-xs-12 col-md-6"><g:actionSubmit action="entrar" value="Entar" class="btn btn-theme btn-block btn-lg" tabindex="7"/></div>
                            <div class="col-xs-12 col-md-6">Ainda não possui uma conta? <g:link controller="menu" action="cadastro">Cadastrar</g:link></div>
                        </div>
                    </g:form>
                </div>
            </div>
        </div>
    </section>
</div>
</body>
</html>
