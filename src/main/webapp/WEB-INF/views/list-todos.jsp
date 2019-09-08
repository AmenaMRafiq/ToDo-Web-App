    <%@ include file="common/header.jspf"%>
    <%@ include file="common/navigation.jspf"%>   
         
        <div class="container">
            <table class="table table-striped">
                <caption><b>Your Todos are</b></caption>

                <thead>
                    <tr>
                        <th>Description</th>
                        <th>Date</th>
                        <th>Completed</th>
                        <th></th>
                    </tr>
                </thead>

                <tbody>
                    <c:forEach items="${todos}" var="todo">
                        <tr>
                            <td>${todo.desc}</td>
                            <td><fmt:formatDate pattern="dd/MM/yyyy" value="${todo.targetDate}"/></td>
                            <td>${todo.done}</td>
                            <td><a href="/update-todo?id=${todo.id}" class="btn btn-info">Update</a></td>
                            <td><a href="/delete-todo?id=${todo.id}" class="btn btn-danger">Delete</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        
        <div>
            <a class="btn btn-success" href="/add-todo">Add new</a>
        </div>
        </div>
        
    <%@ include file="common/footer.jspf"%> 