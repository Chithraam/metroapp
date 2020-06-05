<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<script type="text/javascript">
//<![CDATA[
// array of possible countries in the same order as they appear in the country selection list

    var stationsArray = new Array();
    
    <c:forEach items="${routes}" var="route">
    	var rname="${route.routeName};
    	var sname="${route.stations}";
    	stationsArray[rname]=sname;  
        
    </c:forEach>
</script>


<h1>Search for Trains</h1>
<form action="/list-trains" >
	<!-- <input type="text" name="route" id="route" class="form-control" placeholder="Route Name"> -->
	<select name="route" id="route" class="form-control" >
	<option value="" selected disabled hidden>Choose Route</option>
    <c:forEach items="${routes}" var="route">
        <option value="${route.routeName}">${route.routeName}</option>
    </c:forEach>
	</select>
	
	<input type="text" name="station" id="station" class="form-control" placeholder="From Station">
	<button type="submit" class="btn btn-primary">Search</button>
</form>

<%@ include file="common/footer.jspf"%>