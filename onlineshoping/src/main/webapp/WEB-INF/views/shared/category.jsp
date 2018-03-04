<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="list-group">


	<c:forEach var="category" items="${categories}">
		<a href="${pageContext.request.contextPath}/${category.id}/categoryproduct" class="list-group-item">${category.getName()}</a>
	</c:forEach>
</div>