/**
 *
 */
package de.hybris.tatacliq.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author user
 *
 */
@Controller
@Scope("tenant")
@RequestMapping("/bill")
public class BillPageController extends AbstractPageController
{
	private static final String BILL_CMS_PAGE = "billCMSPage";

	@RequestMapping(method = RequestMethod.GET)
	public String getOffers(final Model model) throws CMSItemNotFoundException
	{
		final ContentPageModel billCMSPage = getContentPageForLabelOrId(BILL_CMS_PAGE);
		storeCmsPageInModel(model, billCMSPage);
		setUpMetaDataForContentPage(model, billCMSPage);
		return getViewForPage(model);
	}
}