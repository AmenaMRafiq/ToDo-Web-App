<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%> 
<div class ="container">
    <p>${errorMessage}</p>
    <form action="/login" method="post">
            
        Username: <input type="text" name="name"/> 
        Password: <input type="password" name="password"/>
        <input type="submit" value="Login"/>
    </form>
</div>
<%@ include file="common/footer.jspf"%>