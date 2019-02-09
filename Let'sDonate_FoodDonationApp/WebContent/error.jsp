
<%@ page isErrorPage="true" %>  
  
  
  <script>
  function falert(){
  window.alert("exception occured");
  }
  </script>
  <body onload="falert()">
<%

response.sendRedirect("index.jsp");

%>
</body>
