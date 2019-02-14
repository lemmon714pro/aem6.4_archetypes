<%@page session="false" pageEncoding="utf-8" contentType="text/html; charset=utf-8" %>
<%@include file="/apps/${appsFolderName}/global.jsp" %>

<sling:adaptTo var="model" adaptable="${resource}" adaptTo="${package}.components.model.SimpleComponentModel"/>

<h2>This document was last modified on: ${model.lastModified}</h2>
<h3>Document's custom text is: ${model.text}</h3>
