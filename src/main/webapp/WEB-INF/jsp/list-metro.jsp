<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
	
	<div class="container">
		<table class="table table-striped">
			<caption>Following Trains are Approaching....</caption>
			<thead>
				<tr>
					<th>Route Name</th>
					<th>Coach Number</th>
					<th>Capacity</th>
					<th>Free Seats</th>
					<th></th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${trains}" var="train">
					<tr>
						<td>${train.routeName}</td>
						<td>${train.coachNo}</td>
						<td>${train.capacity}</td>
						<td>${train.freeSeats}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
<%@ include file="common/footer.jspf" %>