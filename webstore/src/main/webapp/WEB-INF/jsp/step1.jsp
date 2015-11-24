<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="<c:url value="/bootstrap/css/bootstrap.min.css"></c:url>">
<title>Step1</title>
</head>
<c:url var="customerDetailsUrl" value="#"></c:url>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>
					<spring:message code="step1.title"></spring:message>
				</h1>
				<h4>
					<spring:message code="step1.subtitle"></spring:message>
				</h4>
			</div>
		</div>
	</section>
	<section class="container">
		<form:form modelAttribute="customerDetails" class="form-horizontal"
			action="${customerDetailsUrl}" method="post">
			<fieldset>
				<legend>Customer Details</legend>
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="customerFName"><spring:message
							code="step1.form.customerFName.label" /></label>
					<div class="col-lg-10">
						<form:input id="customerFName" path="fname" type="text"
							class="form:input-large" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="customerLName"><spring:message
							code="step1.form.customerLName.label" /></label>
					<div class="col-lg-10">
						<form:input id="customerLName" path="lname" type="text"
							class="form:input-large" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="mobileNo"><spring:message
							code="step1.form.mobileNo.label" /></label>
					<div class="col-lg-10">
						<form:input id="mobileNo" path="mobileNo" type="text"
							class="form:input-large" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="addressLine1"><spring:message
							code="step1.form.addressLine1.label" /></label>
					<div class="col-lg-10">
						<form:input id="addressLine1" path="address.addressLine1" type="text"
							class="form:input-large" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="addressLine2"><spring:message
							code="step1.form.addressLine2.label" /></label>
					<div class="col-lg-10">
						<form:input id="addressLine2" path="address.addressLine2" type="text"
							class="form:input-large" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="city"><spring:message
							code="step1.form.city.label" /></label>
					<div class="col-lg-10">
						<form:input id="city" path="address.city" type="text"
							class="form:input-large" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="pincode"><spring:message
							code="step1.form.pincode.label" /></label>
					<div class="col-lg-10">
						<form:input id="pincode" path="address.pincode" type="text"
							class="form:input-large" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="state"><spring:message
							code="step1.form.state.label" /></label>
					<div class="col-lg-10">
						<form:input id="state" path="address.state" type="text"
							class="form:input-large" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="country"><spring:message
							code="step1.form.country.label" /></label>
					<div class="col-lg-10">
						<form:input id="country" path="address.country" type="text"
							class="form:input-large" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="landmark"><spring:message
							code="step1.form.landmark.label" /></label>
					<div class="col-lg-10">
						<form:input id="landmark" path="address.landmark" type="text"
							class="form:input-large" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="addressType"><spring:message
							code="step1.form.addressType.label" /></label>
					<div class="col-lg-10">
						<form:input id="addressType" path="address.addressType" type="text"
							class="form:input-large" />
					</div>
				</div>
				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<input type="submit" id="btnAdd" class="btn btn-primary"
							value="Continue" />
					</div>
				</div>
			</fieldset>
		</form:form>
	</section>
</body>
</html>