package org.openmrs.module.dashboardframe.web.extension.html;

import org.openmrs.api.context.Context;
import org.openmrs.module.Extension;
import org.openmrs.module.web.extension.PatientDashboardTabExt;

public class IframeTabExt extends PatientDashboardTabExt {

	public Extension.MEDIA_TYPE getMediaType() {
		return Extension.MEDIA_TYPE.html;
	}

	@Override
	public String getPortletUrl() {
		return "iframe";
	}

	@Override
	public String getRequiredPrivilege() {
		return "Patient Dashboard - View Patient Iframe";
	}
	
	@Override
	public String getTabId() {
		return "Iframe";
	}

	@Override
	public String getTabName() {
		String result = Context.getAdministrationService().getGlobalProperty("patient.iframe.tab_name");
		if (result == null || result.equals("")){
			result = "formentry.patientDashboard.iframe";
		}
		return result;
	}
}
