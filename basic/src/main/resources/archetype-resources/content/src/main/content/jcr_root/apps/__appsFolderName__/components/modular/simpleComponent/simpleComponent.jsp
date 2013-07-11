<%@page session="false" pageEncoding="utf-8"
	contentType="text/html; charset=utf-8"%>
<%@include file="/libs/foundation/global.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="slice" uri="http://cognifide.com/jsp/slice"%>
<%@page import="${package}.components.model.SimpleComponentModel"%>

<slice:lookup var="model" type="<%=SimpleComponentModel.class%>" />
<h2>This document was last modified on: ${model.lastModified}</h2>
<h3>Document's custom text is: ${model.text}</h3>
