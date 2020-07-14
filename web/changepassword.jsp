<html lang="en">
  <head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link href="https://fonts.googleapis.com/css?family=Droid+Sans" rel="stylesheet">
    <link rel="stylesheet" href="css/dash.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt" crossorigin="anonymous">
 
  </head>
<body>
    <%
         response.setHeader("Cache-Control","no-cache");
      response.setHeader("Cache-Control","no-store");
      response.setDateHeader("Expires",0);
      response.setHeader("Pragma","no-cache");
    %>
    <aside class="side-nav">
		<div class="cross-toggle" style="display:none;">
			<div class="bar1"></div>
			<div class="bar2"></div>
		</div>
        <div class="heading">
			<img src="img/mad.jpeg" alt="" class="img-responsive img-circle">
			<div class="info">
			  <h3><a href="#">ADMIN</a></h3>
			</div>
		</div>
		<ul class="categories">
			<li><i class="fas fa-user"></i><a href="adduser.html" class="drop_hide">Add Users</a></li>
                        <li><i class="fas fa-users-cog"></i><a href="manageuser.html" class="drop_hide">Manage Roles</a></li>
			<li><i class="fas fa-users-cog"></i><a href="manageuser.html" class="drop_hide">Manage JobSeekers</a></li>
                        <li><i class="fas fa-users-cog"></i><a href="manageuser.html" class="drop_hide">Manage Employers</a></li>
                        <li><i class="fas fa-user-circle"></i><a href="manageprofile.html" class="drop_hide"> Manage Profile</a></li>
			<li><i class="fab fa-envira"></i><a href="gallery.html" class="drop_hide"> Manage Gallery</a></li>
                        <li><i class="fas fa-users-cog"></i><a href="manageuser.html" class="drop_hide">Manage Blogs</a></li>
                        <li><i class="fas fa-users-cog"></i><a href="manageuser.html" class="drop_hide">Manage Emails</a></li>
                        <li><i class="fas fa-unlock-alt"></i><a href="changepassword.jsp" class="drop_hide"> Change Password</a></li>
			
        </ul>
    </aside>
	<section id="contents">
    <nav class="navbar navbar-default">
        <div class="container-fluid">
			<div class="toggle-menu" style="display:none;">
			  <div class="toggle-icon"></div>
			  <div class="toggle-icon"></div>
			  <div class="toggle-icon"></div>
			</div>
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
				  <i class="fa fa-align-right"></i>
				</button>
				<a class="navbar-brand" href="dashboard.html"><span class="main-color"> Dashboard</span></a>
			</div>
			<div class="collapse navbar-collapse navbar-right" id="bs-example-navbar-collapse-1">
			<a href="./logout" class="logout">Logout</a>
            </div>
        </div>
    </nav>
<section id="book-appointment">
	    <div class="container-fluid">
		  <div class="row list_header">
		   
			<div class="col-md-12 header-title">
                         
                     <div class="header-icon">
                       <i class="fas fa-unlock-alt" aria-hidden="true"></i> 
                    </div>
					<h1>Change Password</h1>
                        
                    </div>
		  </div>
		  <div class="row">
                      <form class="steps" action="/Jobipher/editpassword" accept-charset="UTF-8" enctype="multipart/form-data" novalidate="">
       
			  <fieldset>
				 <div class="row">
					<div class="col-md-12 hs_firstname field hs-form-field">
					
					  <label for="firstname">Old Password</label>
					  <input id="fname" name="op" required="required" type="text" data-rule-required="true" data-msg-required="Please include your first name" >
					</div>
			
					<div class="col-md-12 hs_fname field hs-form-field">
					
					  <label for="fname">New Password</label>

					  <input id="p" name="p"type="text">
					  <label id="lbl1" style="color:red"></label>
					</div>
					<div class="col-md-12 hs_fname field hs-form-field">
					
					  <label for="fname">Confirm Password</label>

					   <input id="cp" name="cp"type="text">
					  <label id="lbl2" style="color:red"></label>
					</div>			
				<input type="submit" onclick="return validateLoginForm()"class="next action-button" value="Change" />
			  </fieldset>
<script>
           function validateLoginForm(){
		        document.getElementById("lbl1").innerHTML=""
				document.getElementById("lbl2").innerHTML=""
				var pass = document.getElementById("p").value;
				var conpass = document.getElementById("cp").value;
				 if(pass.length!=8)
                {   document.getElementById("lbl1").innerHTML="* Enter Password of minimum 8 length "
                    document.getElementById("p").focus();
                return false;
				}
				 if(pass!==conpass)
                {   document.getElementById("lbl2").innerHTML="* Passwords doesnot match"
                    document.getElementById("cp").focus();
                return false;
				}
             return true;
            }
</script>
</section>
<script src="js/validation.js"></script>
</body>
</html>	