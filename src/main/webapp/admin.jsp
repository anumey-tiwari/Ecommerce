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
            </div><!--/.navbar-collapse -->
        </div>
    </nav>

    <br/><br/><br/><br/>
    <div class="container">
        <div class="row">
            <div class="col-lg-3"></div>
            <div class="col-lg-6">
                <div>
                    <p>
                        Upload information of product :  ${result}
                        <%-- <%
                            String result = request.getParameter("result");
                        %>
                        
<%= result %> --%>
                    </p>
                </div>
                    <form action="upload" method="post">
                    <div class="form-group">
                        <label for="name">Name</label>
                        <input type="text" class="form-control" name="name" placeholder="Name">
                    </div>
                    <div class="form-group">
                        <label for="price">Price</label>
                        <input type="number" class="form-control" name="price" placeholder="Price">
                    </div>
                    <div class="form-group">
                        <label for="company">Company</label>
                        <input type="text" class="form-control" name="company" placeholder="Company">
                    </div>
                    <div class="form-group">
                        <label for="quantity">Quantity</label>
                        <input type="number" class="form-control" name="quantity" placeholder="Quantity">
                    </div>
                    <div class="dropdown btn-block" >
                        <select name="product">
                            <option value="book">Book</option>
                            <option value="laptop">Laptop</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="productImage">Product Image </label>
                        <input type="file" id="productImage">
                        <p class="help-block">Upload image of product</p>
                    </div>
                    <button type="submit" class="btn btn-primary btn-sm btn-block">Submit</button>
                </form>
            </div>
            <div class="col-lg-3"></div>
        </div>


        <footer>
            <p>&copy; 2017 Anumey.</p>
        </footer>
    </div> <!-- /container -->
</body>
</html>