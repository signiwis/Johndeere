/*
 * [y] hybris Platform
 *
 * Copyright (c) 2017 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.tatacliq.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.tatacliq.fulfilmentprocess.constants.TatacliqFulfilmentProcessConstants;

@SuppressWarnings("PMD")
public class TatacliqFulfilmentProcessManager extends GeneratedTatacliqFulfilmentProcessManager
{
	public static final TatacliqFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (TatacliqFulfilmentProcessManager) em.getExtension(TatacliqFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
