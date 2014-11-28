<%@page session="false" pageEncoding="utf-8" contentType="text/html; charset=utf-8" %>
<%@include file="/apps/${appsFolderName}/global.jsp" %>

<slice:lookup var="model" type="<%=${package}.components.model.SimpleComponentModel.class%>" />
<jsp:useBean id="model" type="${package}.components.model.SimpleComponentModel" />

<h2>This document was last modified on: ${model.lastModified}</h2>
<h3>Document's custom text is: ${model.text}</h3>
