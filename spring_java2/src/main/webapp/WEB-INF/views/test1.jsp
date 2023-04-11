<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test3</title>

</head>
<body>
	<h1>Test1</h1>
	
	<!-- model이 들어가면 servletRequest를 쓰는거임 -->
	<form:form action="result" method="post" modelAttribute="dataBean">
	<form:select path="a1">
		<form:option value="data1">data1</form:option>
		<form:option value="data2">data2</form:option>
		<form:option value="data3">data3</form:option>
	</form:select>
	<hr />
	<form:select path="a2">
		<form:options items="${requestScope.data_list1 }" />
	</form:select>
	<hr />

	<form:select path="a3">
		<form:options items="${requestScope.data_list2 }" />
	</form:select>
	<hr />

	<form:select path="a4">
		<form:options items="${requestScope.data_list3 }" itemLabel="key" itemValue="value" />
	</form:select>
	
	<form:checkbox path="a5" value="data1"/> 항목1
	<form:checkbox path="a5" value="data2"/> 항목2
	<form:checkbox path="a5" value="data3"/> 항목3
	<hr />
	
	<form:checkboxes items="${requestScope.data_list1 }" path="a6"/>
	<!-- ArrayList 배열 -->
	<hr />
	<form:checkboxes items="${requestScope.data_list2 }" path="a7"/>
		
	<!-- KeyValueBean 배열 -->
	<hr />
	<form:checkboxes items="${requestScope.data_list3 }" path="a8" itemLabel="key" itemValue="value" />
	
	<!-- a9와 동일한 것만 선택 -->		
	<hr />
	<form:radiobutton path="a9" value="data1"/>항목1
	<form:radiobutton path="a9" value="data2"/>항목2
	<form:radiobutton path="a9" value="data3"/>항목3
	<!-- ArrayList 배열 -->
	<hr />
	<form:radiobuttons path="a10" items="${requestScope.data_list1 }"/>
	<hr />
	<form:radiobuttons path="a11" items="${requestScope.data_list2 }"/>
	<!-- KeyValue 배열 -->
	<hr />
	<form:radiobuttons path="a12" items="${requestScope.data_list3 }" itemLabel="key" itemValue="value"/>
	
	</form:form> 
</body>
</html>

<!-- showPassword="true" : form:form에서는 password타입은 노출되지 않으므로 비밀번호 타입 노출 -->

