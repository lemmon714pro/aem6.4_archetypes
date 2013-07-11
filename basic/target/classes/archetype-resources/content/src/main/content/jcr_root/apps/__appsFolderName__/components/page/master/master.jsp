<%@include file="/libs/foundation/global.jsp"%>
<%@page session="false" pageEncoding="utf-8"
	contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<cq:include script="head.jsp" />
<body>
	<cq:include path="clientcontext"
		resourceType="cq/personalization/components/clientcontext" />
	<div>
		<cq:include script="header.jsp" />
		<cq:include script="content.jsp" />
		<cq:include script="footer.jsp" />
	</div>
	<cq:include path="timing" resourceType="foundation/components/timing" />
	<cq:include path="cloudservices"
		resourceType="cq/cloudserviceconfigs/components/servicecomponents" />
</body>
</html>
