<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<div class="container">
	<form:form method="post" commandName="store">
		<form:hidden path="storeId" />
		<fieldset class="form-group">
			<form:label path="storeAddress">Address</form:label>
			<form:input path="storeAddress" type="text" class="form-control"
				required="required" />
			<form:errors path="storeAddress" cssClass="text-warning" />
		</fieldset>

		<fieldset class="form-group">
			<form:label path="storeTiming">Store Timings</form:label>
			<form:input path="storeTiming" type="text" class="form-control"
				required="required" />
			<form:errors path="storeTiming" cssClass="text-warning" />
		</fieldset>

		<button type="submit" class="btn btn-success">Add</button>
	</form:form>
</div>
<%@ include file="common/footer.jspf" %>