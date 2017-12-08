# Servlet_HttpServlet
HttpServlet class      HttpServlet class     Methods of HttpServlet class  The HttpServlet class extends the GenericServlet class and implements Serializable interface. It provides http specific methods such as doGet, doPost, doHead, doTrace etc.

Methods of HttpServlet class

There are many methods in HttpServlet class. They are as follows:

    1.public void service(ServletRequest req,ServletResponse res) dispatches the request to the protected service method 
       by converting the request and response object into http type.
    2.protected void service(HttpServletRequest req, HttpServletResponse res) receives the request from the service method, 
      and dispatches the request to the doXXX() method depending on the incoming http request type.
    3.protected void doGet(HttpServletRequest req, HttpServletResponse res) handles the GET request. It is invoked by the 
       web container.
    4.protected void doPost(HttpServletRequest req, HttpServletResponse res) handles the POST request. It is invoked by the 
       web container.
    5.protected void doHead(HttpServletRequest req, HttpServletResponse res) handles the HEAD request. It is invoked by the 
       web container.
    6.protected void doOptions(HttpServletRequest req, HttpServletResponse res) handles the OPTIONS request. It is invoked by 
       the web container.
    7.protected void doPut(HttpServletRequest req, HttpServletResponse res) handles the PUT request. It is invoked by the
       web container.
    8.protected void doTrace(HttpServletRequest req, HttpServletResponse res) handles the TRACE request. It is invoked by the
       web container.
    9.protected void doDelete(HttpServletRequest req, HttpServletResponse res) handles the DELETE request. It is invoked by 
       the web container.
    10.protected long getLastModified(HttpServletRequest req) returns the time when HttpServletRequest was last modified 
