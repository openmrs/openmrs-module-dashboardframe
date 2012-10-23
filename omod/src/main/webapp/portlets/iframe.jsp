<%--
  The contents of this file are subject to the OpenMRS Public License
  Version 1.0 (the "License"); you may not use this file except in
  compliance with the License. You may obtain a copy of the License at
  http://license.openmrs.org

  Software distributed under the License is distributed on an "AS IS"
  basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
  License for the specific language governing rights and limitations
  under the License.

  Copyright (C) OpenMRS, LLC.  All Rights Reserved.

--%>

<%@ include file="/WEB-INF/template/include.jsp" %>
<div style="text-align: left;">
<iframe id="iframe_website" width="960px" height="400px">
	<p>Your browser does not support iframes.</p>
</iframe> </div>

<script type="text/javascript">
	patientId = ${patient.patientId};
	website = '<openmrs:globalProperty key="patient.iframe.URL" />';
	tabName = '<openmrs:globalProperty key="patient.iframe.tab_name" />';
	document.getElementById('IframeTab').innerHTML = tabName;
	var iframe_website = document.getElementById('iframe_website');
	iframe_website.src = website.replace('{patientId}', patientId);
	
	iframe_website.onload = function(){		
		var y=(iframe_website.contentWindow || iframe_website.contentDocument);
		if (y.document) y = y.document;		
		iframe_website.height = y.body.scrollHeight + "px";
	};
</script>

