<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<jsp:include page="../include/title.jsp" />
<link href="<c:url value='/resources/css/admin/home.css' />"
	rel="stylesheet" type="text/css">
</head>

<body>
	<jsp:include page="../include/header.jsp" /> <!-- ../ (상위 폴더) views 폴터 아래에서 include 폴더 안에있는 header.jsp -->
	<jsp:include page="./include/nav.jsp" />  <!-- ./ (현재 폴더) 현재 폴더 admin 아래의 include 폴더를 가리키는 것이다. -->
	
	<section>
		<div id="section_wrap">
			<div class="word">
				<h3>ADMIN HOME</h3>
			</div>
		</div>
	</section>

	<jsp:include page="../include/footer.jsp" />
</body>

</html>