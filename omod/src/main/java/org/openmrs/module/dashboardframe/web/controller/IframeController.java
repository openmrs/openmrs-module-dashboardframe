package org.openmrs.module.dashboardframe.web.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.web.controller.PortletController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/module/patientiframe/iframe.form")
public class IframeController extends PortletController {
	protected final Log log = LogFactory.getLog(getClass());

    public IframeController() {
    	
    }
    
    @Override
    protected void populateModel(HttpServletRequest request,
    		Map<String, Object> model) {
    	super.populateModel(request, model);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public String get() {
    	log.debug("GET patient iframe webpage");
        return "/module/patientiframe/iframe";
    }
    @RequestMapping(method = RequestMethod.POST)
    public String post() {
    	log.debug("POST patient iframe webpage");
        return "/module/patient.iframe/iframe";
    }
    
    
}
