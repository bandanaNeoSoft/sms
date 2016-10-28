<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
    .row.content {height: 450px}
    
    /* Set gray background color and 100% height */
    .sidenav {
      padding-top: 20px;
      background-color: #f1f1f1;
      height: 100%;
    }
    
    /* Set black background color, white text and some padding */
    footer {
      background-color: #555;
      color: white;
      padding: 15px;
    }
     /* Set black background color, white text and some padding */
    header {
      background-color: #555;
      color: white;
      padding: 15px;
    }
    
    /* On small screens, set height to 'auto' for sidenav and grid */
    @media screen and (max-width: 767px) {
      .sidenav {
        height: auto;
        padding: 15px;
      }
      .row.content {height:auto;} 
    }
  </style>
</head>
    
    <body>

   

<div class="container-fluid text-center">    
  
    <div class="col-sm-8 text-left"> 
    
        <h3>Welcome </h3>
       
       <ul >
           
            Your Account Is Activated Now Please Login with the following Credentials In Utalk Mobile App
            Your credentials are:</br>
          <li> <b>  </br>Username:${username}</br></b></li>
            <li><b>Password: ${password}</b></li></br>
            You can order virtual number from the browser tab in mobile application by selecting MSISDN pattern and country after that you can start 
			texting and calling.
        </ul>
      
        </p>
        <hr>
        <h3>
            Regards 
            UTalkWifi Support
        </h3>
        <p></p>
    </div>
    
  </div>



<div>
    </body>
</html>