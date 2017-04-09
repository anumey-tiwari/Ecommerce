<%-- 
    Document   : index
    Created on : 5 Apr, 2017, 9:02:49 PM
    Author     : Anumey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title> e commerce </title>
        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
    </head>

    <body>

        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">Student Bazzar</a>

                </div>

                <div id="navbar" class="navbar-collapse collapse">
                    <form class="navbar-form navbar-right">
                        <div class="form-group">
                            <input type="text" placeholder="Email" class="form-control">
                        </div>
                        <div class="form-group">
                            <input type="password" placeholder="Password" class="form-control">
                        </div>
                        <button type="submit" class="btn btn-success">Sign in</button>
                        &nbsp;&nbsp;
                        <a class="nav navbar-nav navbar-right" href="#">
                            <img alt="Brand" src="img/cart.png" height="30" width="30">
                        </a>
                    </form>

                </div>



            </div><!--/.navbar-collapse -->
        </div>
    </nav>

    <br/><br/><br/><br/>
    <div class="container">
        <div class="row"> 
            <div class="col-lg-2">

            </div>
            <div class="col-lg-4 right">
                <div class="jumbotron"></div>
            </div>
            <div class="col-lg-4" left>

                <p>Name          :</p>
                <p>Price         :</p>
                <p>Company       :</p>
                <p>Manufacture By: </p>

                <p>
                    <a class="btn btn-primary btn-sm right" href="#" role="button">Check Out</a>
                    <a class="btn btn-primary btn-sm right" href="#" role="button">Add To Cart</a>
                </p>

            </div>
            <div class="col-lg-2">

            </div>
        </div>

        <footer>
            <p>&copy; 2017 Anumey.</p>
        </footer>
    </div> <!-- /container -->

    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>
</html>