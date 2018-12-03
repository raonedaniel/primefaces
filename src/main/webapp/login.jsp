<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page contentType="text/html; charset=UTF-8" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>CINEMA PERTO DE VOCÊ</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Cache-Control" content="no-cache, no-store, must-revalidate" />
<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Expires" content="0" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"/>
<link href="css/bootstrap.css" rel="stylesheet" />
<link href="css/bootstrap-responsive.css" rel="stylesheet" />
<link href="css/styles.css" rel="stylesheet" />
<script>
	function focar() {
		document.getElementById("usuario").focus();
	}
</script>
</head>
<body>
<form action="j_spring_security_check" method="post">
<div class="wrapper">
	<div class="header">
    	<div class="container">
        	<div class="row branding">
            	<div class="span6">
                	<h1 class="pull-left"><a href="index.html"><strong>CINEMA PERTO DE VOCÊ</strong></a></h1>
                </div>            	
            </div>
            <div class="row navigation">
	           	<div class="span12">
                    <ul class="nav nav-tabs">
                      <li><a data-toggle="tab" href="#tab1" class="tab1">HOME</a></li>
                      <li><a data-toggle="tab" href="#tab2" class="tab2">SOBRE</a></li>
                      <li><a data-toggle="tab" href="#tab3" class="tab3">PROGRAMAÇÃO</a></li>
                      <li><a data-toggle="tab" href="#tab4" class="tab4">FALE CONOSCO</a></li>
                    </ul>
                </div>
            </div>
        </div>        
    </div>
	<div  class="container content">
        <div class="row">
        
        
        <div id="tab1" class="tab-pane fade">
    	<!-- <h2>HOME</h2> -->
    	<div id="tab1" class="span8 leftContent">
            	<div>
            	<h2>FILMES EM CARTAZ</h2>
            	<div class="row">
                	<div class="span4">
                    	<p class="cntPara simpleDesign" align="justify">
                        	<strong class="lead">HALLOWEEN</strong>
							trailer  
						<img src = "imagem/img.jpg" />                   	
                        </p>            	                                                
                    </div>
                    
                  	  <div class="span4">
                    	<p class="cntPara itsFree" align="justify">
                        	<strong class="lead">FÚRIA EM ALTO MAR</strong>
							trailer
						<img src = "imagem/imgF.jpg" />
                       </p>      
                    </div>                                        
                </div>
                <hr/>
                <div class="row">
                	<div class="span4">
                    	<p class="cntPara secureApp"  align="justify">
                        	<strong class="lead">ATIRADOR</strong>
							trailer
							<img src = "imagem/imgA.jpg" />						
                    </div>
                    
                    <div class="span4">
                    	<p class="cntPara easyUse">
                        	<strong class="lead">O REI LEÃO II</strong>
							trailer
							<img src = "imagem/imgR.jpg" />							
                         </p>      
                     </div>                                        
                </div>
                </div>
                
                <hr/>   
                </div>
              
       
    	</div> 
    	<div id="tab2" class="tab-pane fade">
    	<h2>SOBRE</h2>
    	</div>
    	<div id="tab3" class="tab-pane fade">
    	<h2>PROGRAMAÇAO</h2>
    	</div>         
       
  		<div id="tab4" class="tab-pane fade">
    	<h2>FALE CONOSCO</h2>
    	<div class="well quickSignupForm">
                  <h3>Dados:</h3>
				  <label>Nome</label>
                  <input type="text" id="nome" name="j_nome" class="span3"  />
                  <label>Telefone</label>
                  <input type="text" id="telefone" name="j_telefone" class="span3"  />
                  <label>Email</label>
                  <input type="text" id="email" name="j_email" class="span3"  />
                  <label>Digite </label>
                  <input type="blob" id="nome" name="j_nome" class="span3"  />
        </div>
    	</div>
    </div>
    <div>
            	<h2><a href="#" class="btn btn-large btn-warning">Buscar Filme</a></h2>
                <div class="well quickSignupForm">
                  <h3>Comprar Ingresso</h3>
					<%
					if (request.getParameter("msg") != null) {
						out.print("<span style='color: red;font-weight: bold;'>Usuário ou senha incorretos</span>");
					}%>		
                  <label>Login</label>
                  <input type="text" id="usuario" name="j_username" class="span3"  />
                  <label>Senha</label>
                  <input name="j_password" type="password" class="span3" />                  
                  <input class="btn btn-large btn-success btnSignup" type="submit" value="Entrar" />
                
</div>
</body>
</html>








<%-- <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page contentType="text/html; charset=UTF-8" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script><script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"/>

<head>
	<title>CINEMA PERTO DE VOCÊ</title>

    <link href="css/bootstrap.css" rel="stylesheet" />
    <link href="cs<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page contentType="text/html; charset=UTF-8" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>CINEMA PERTO DE VOCÊ</title>

    <link href="css/bootstrap.css" rel="stylesheet" />
    <link href="css/bootstrap-responsive.css" rel="stylesheet" />
    <link href="css/styles.css" rel="stylesheet" />

	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<meta http-equiv="Cache-Control" content="no-cache, no-store, must-revalidate" />
	<meta http-equiv="Pragma" content="no-cache" />
	<meta http-equiv="Expires" content="0" />
	<script>
		function focar() {
			document.getElementById("usuario").focus();
		}
	</script>
</head>
<body>
<form action="j_spring_security_check" method="post">
<div class="wrapper">
	<div class="header">
    	<div class="container">
        	<div class="row branding">
            	<div class="span6">
                	<h1 class="pull-left"><a href="index.html"><strong>CINEMA PERTO DE VOCÊ</strong></a></h1>
                </div>            	
            </div>
            <div class="row navigation">
	           	<div class="span12">
                    <ul class="nav nav-tabs">
                      <li><a data-toggle="tab" href="#tab3" class="tab3">HOME</a></li>
                      <li><a data-toggle="tab" href="#tab3" class="tab3">SOBRE</a></li>
                      <li><a data-toggle="tab" href="#tab3" class="tab3">PROGRAMAÇÃO</a></li>
                      <li><a data-toggle="tab" href="#tab4" class="tab4">FALE CONOSCO</a></li>
                    </ul>
                </div>
            </div>
        </div>        
    </div>
	<div class="container content">
        <div class="row">
            <div class="span8 leftContent">
            	<h2>FILMES EM CARTAZ</h2>
                <div class="row">
                	<div class="span4">
                    	<p class="cntPara simpleDesign" align="justify">
                        	<strong class="lead">HALLOWEEN</strong>
							trailer  
	<img src = "img.png" />                   	
                        </p>            	                                                
                    </div>
                    
                  	  <div class="span4">
                    	<p class="cntPara itsFree" align="justify">
                        	<strong class="lead">FÚRIA EM ALTO MAR</strong>
							trailer
                       </p>      
                    </div>                                        
                </div>
                <hr/>
                <div class="row">
                	<div class="span4">
                    	<p class="cntPara secureApp"  align="justify">
                        	<strong class="lead">ATIRADOR</strong>
							trailer
                    </div>
                    
                    <div class="span4">
                    	<p class="cntPara easyUse">
                        	<strong class="lead">O REI LEÃO</strong>
							trailer
                         </p>      
                     </div>                                        
                </div>
                <hr/>   
                <div class="row">
                	<div class="span8">
                    	<h3 class="quickTour">FALE CONOSCO</h3>
						Dúvidas
                    </div>                                        
                </div>
            </div>
            
       
  		<div id="tab4" class="tab-pane fade">
    	<h2>FALE CONOSCO</h2>
    	<div class="well quickSignupForm">
                  <h3>Dados:</h3>
				  <label>Nome</label>
                  <input type="text" id="nome" name="j_nome" class="span3"  />
                  <label>Telefone</label>
                  <input type="text" id="telefone" name="j_telefone" class="span3"  />
                  <label>Email</label>
                  <input type="text" id="email" name="j_email" class="span3"  />
                  <label>Digite </label>
                  <input type="blob" id="nome" name="j_nome" class="span3"  />
        </div>
  		</div>
            
            
            <div class="span4 sidebar">
                <h2><a href="#" class="btn btn-large btn-warning">Buscar Filme</a></h2>
                <div class="well quickSignupForm">
                  <h3>Comprar Ingresso</h3>
					<%
					if (request.getParameter("msg") != null) {
						out.print("<span style='color: red;font-weight: bold;'>Usuário ou senha incorretos</span>");
					}%>		
                  <label>Login</label>
                  <input type="text" id="usuario" name="j_username" class="span3"  />
                  <label>Senha</label>
                  <input name="j_password" type="password" class="span3" />                  
                  <input class="btn btn-large btn-success btnSignup" type="submit" value="Entrar" />
                </div>
                <h3>CORRIGIR</h3>
                <p>
					CORRIGIR 
                </p>                
            </div>
            
    	</div>
    </div>
</div>
</body> --%>
