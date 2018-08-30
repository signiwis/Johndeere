/*
 *  
 * [y] hybris Platform
 *  
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *  
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 *  
 */
package de.hybris.platform.jhondeerestore.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.platform.jhondeerestore.constants.JhondeerestoreConstants;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class JhondeerestoreManager extends GeneratedJhondeerestoreManager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger( JhondeerestoreManager.class.getName() );
	
	public static final JhondeerestoreManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (JhondeerestoreManager) em.getExtension(JhondeerestoreConstants.EXTENSIONNAME);
	}
	
}
