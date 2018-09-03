package de.hybris.tatacliq.storefront.controllers.cms;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.cms.AbstractCMSComponentController;
import de.hybris.tatacliq.core.model.CustomComponentModel;
import de.hybris.tatacliq.storefront.controllers.ControllerConstants;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller("CustomComponentController")
@Scope("tenant")
@RequestMapping(value = ControllerConstants.Actions.Cms.CustomComponent)
public class CustomComponentController extends AbstractCMSComponentController<CustomComponentModel>
{
	@Override
	protected void fillModel(final HttpServletRequest request, final Model model, final CustomComponentModel component)
	{
		model.addAttribute("customImage", component.getCustomImage());
		model.addAttribute("customText", component.getCustomText());
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.acceleratorstorefrontcommons.controllers.cms.AbstractCMSComponentController#getView(de.hybris.
	 * platform.cms2.model.contents.components.AbstractCMSComponentModel)
	 */
	@Override
	protected String getView(final CustomComponentModel component)
	{
		// YTODO Auto-generated method stub
		return "/cms/customComponent";
	}
}
