<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
	
	<div class="container">
		<table class="table table-striped">
			<caption>Routes</caption>
			<thead>
				<tr>
					<th>Route Name</th>
					<th>Source</th>
					<th>Destination</th>
					<th></th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${routes}" var="route">
					<tr>
						<td>${route.routeName}</td>
						<td>${route.source}</td>
						<td>${route.destination}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
<%@ include file="common/footer.jspf" %>