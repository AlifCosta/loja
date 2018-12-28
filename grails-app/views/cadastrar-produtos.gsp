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
                    <g:uploadForm controller="produto">
                        <h2>Registro <small>Cadastre os produtos aqui</small></h2>
                        <hr class="colorgraph">
                        <div class="row">
                            <div class="form-group">
                                <g:textField name="nome" id="name" class="form-control input-lg" placeholder="Nome" tabindex="4"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <input type="number" name="preco" id="email" class="form-control input-lg" placeholder="Valor" tabindex="4"/>
                        </div>
                        <div class="form-group">
                            <input type="number" name="estoque" class="form-control input-lg" placeholder="Estoque" tabindex="4"/>
                        </div>
                        <div class="form-group">
                            <g:select class="form-control" from="${loja.Categoria.list()}" name="categoria.nome" optionKey="nome" optionValue="nome"/>
                        </div>
                        <div class="form-group">
                            <input type="file" name="arquivo" accept=".jpg, .jpeg, .png" data-max-size="120000"
                                   class="form-control"/>
                        </div>
                        <div class="row">
                            <div class="col-xs-4 col-sm-3 col-md-3">
                                <span class="button-checkbox">
                                    <button type="button" class="btn" data-color="info" tabindex="7">I Agree</button>
                                    <input type="checkbox" name="t_and_c" id="t_and_c" class="hidden" value="1">
                                </span>
                            </div>
                            <div class="col-xs-8 col-sm-9 col-md-9">
                                By clicking <strong class="label label-primary">Register</strong>, you agree to the <a href="#" data-toggle="modal" data-target="#t_and_c_m">Terms and Conditions</a> set out by this site, including our Cookie Use.
                            </div>
                        </div>

                        <hr class="colorgraph">
                        <div class="row">
                            <div class="col-xs-12 col-md-6"><g:actionSubmit action="salvar" value="Registrar" class="btn btn-theme btn-block btn-lg" tabindex="7"/></div>
                        </div>
                    </g:uploadForm>
                </div>
            </div>
            <!-- Modal -->
            <div class="modal fade" id="t_and_c_m" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog modal-lg">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                            <h4 class="modal-title" id="myModalLabel">Termos e condições</h4>
                        </div>
                        <div class="modal-body">
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Similique, itaque, modi, aliquam nostrum at sapiente consequuntur natus odio reiciendis perferendis rem nisi tempore possimus ipsa porro delectus quidem dolorem ad.</p>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Similique, itaque, modi, aliquam nostrum at sapiente consequuntur natus odio reiciendis perferendis rem nisi tempore possimus ipsa porro delectus quidem dolorem ad.</p>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-primary" data-dismiss="modal">Eu aceito</button>
                        </div>
                    </div>
                    <!-- /.modal-content -->
                </div>
                <!-- /.modal-dialog -->
            </div>
            <!-- /.modal -->
        </div>
    </section>


</div>
<a href="#" class="scrollup"><i class="fa fa-angle-up active"></i></a>

</body>

</html>
