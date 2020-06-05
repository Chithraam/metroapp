<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>


<h1>Search for Trains</h1>
<form action="/list-trains" >
	<input type="text" name="route" id="route" class="form-control" placeholder="Route Name">
	<input type="text" name="station" id="station" class="form-control" placeholder="From Station">
	<button type="submit" class="btn btn-primary">Search</button>
</form>
<%@ include file="common/footer.jspf"%>