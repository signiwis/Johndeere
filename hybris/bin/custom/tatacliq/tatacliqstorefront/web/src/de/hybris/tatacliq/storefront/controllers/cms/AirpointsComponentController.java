package de.hybris.tatacliq.storefront.controllers.cms;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.cms.AbstractCMSComponentController;
import de.hybris.tatacliq.core.model.AirpointsComponentModel;
import de.hybris.tatacliq.storefront.controllers.ControllerConstants;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller("AirpointsComponentController")
@Scope("tenant")
@RequestMapping(value = ControllerConstants.Actions.Cms.AirpointsComponent)
public class AirpointsComponentController extends AbstractCMSComponentController<AirpointsComponentModel>
{
	@Override
	protected void fillModel(final HttpServletRequest request, final Model model, final AirpointsComponentModel component)
	{
        model.addAttribute("airpointsImage", component.getAirpointsImage());
        model.addAttribute("airpointsText", component.getAirpointsText());
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.acceleratorstorefrontcommons.controllers.cms.AbstractCMSComponentController#getView(de.hybris.
	 * platform.cms2.model.contents.components.AbstractCMSComponentModel)
	 */
	@Override
	protected String getView(final AirpointsComponentModel component)
	{
		// YTODO Auto-generated method stub
		return "/cms/airpointsComponent";
	}
}
