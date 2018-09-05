/**
 *
 */
package de.hybris.tatacliq.storefront.controllers.cms;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.cms.AbstractCMSComponentController;
import de.hybris.tatacliq.core.model.UserNameComponentModel;
import de.hybris.tatacliq.storefront.controllers.ControllerConstants;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * @author Prashant UserNameComponentController
 *
 */
@Controller("UserNameComponentController")
@Scope("tenant")
@RequestMapping(value = ControllerConstants.Actions.Cms.UserNameComponent)
public class UserNameComponentController extends AbstractCMSComponentController<UserNameComponentModel>
{

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.acceleratorstorefrontcommons.controllers.cms.AbstractCMSComponentController#fillModel(javax.
	 * servlet.http.HttpServletRequest, org.springframework.ui.Model,
	 * de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel)
	 */
	@Override
	protected void fillModel(final HttpServletRequest request, final Model model, final UserNameComponentModel component)
	{

		model.addAttribute("uname", component.getUname());

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.acceleratorstorefrontcommons.controllers.cms.AbstractCMSComponentController#getView(de.hybris.
	 * platform.cms2.model.contents.components.AbstractCMSComponentModel)
	 */
	@Override
	protected String getView(final UserNameComponentModel component)
	{
		// YTODO Auto-generated method stub
		return "/cms/usernamecomponent";
	}
}
