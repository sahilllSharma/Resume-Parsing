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
			<img src="images/mad1.jpg" alt="" class="img-responsive img-circle">
			<div class="info">
			  <h3><a href="#">ADMIN</a></h3>
			</div>
		</div>
		<ul class="categories">
			<li><i class="fas fa-user"></i><a href="adduser.html" class="drop_hide">Add Users</a></li>
                        <li><i class="fas fa-users-cog"></i><a href="manageuser.html" class="drop_hide">Manage Roles</a></li>
			<li><i class="fas fa-users-cog"></i><a href="manageuser.html" class="drop_hide">Manage JobSeekers</a></li>
                        <li><i class="fas fa-users-cog"></i><a href="manageuser.html" class="drop_hide">Manage Employers</a></li>
                        <li><i class="fas fa-user-circle"></i><a href="./manageprofile.jsp" class="drop_hide"> Manage Profile</a></li>
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
	
</section>
    <script src="js/bootstrap.min.js"></script>
    <script src='js/dashboard.js'></script>
	 <script src='js/jquery.min.js'></script>
</body>
</html>