/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2013 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 * 
 *  
 */
package de.hybris.platform.webservices.objectgraphtransformer;

import de.hybris.platform.catalog.model.classification.ClassificationAttributeValueModel;
import de.hybris.platform.webservices.util.objectgraphtransformer.PropertyContext;
import de.hybris.platform.webservices.util.objectgraphtransformer.PropertyInterceptor;


public class ClassificationAttributeValueModelToStringConverter implements PropertyInterceptor<Object, String>
{

	@Override
	public String intercept(final PropertyContext ctx, final Object source)
	{
		if (source instanceof ClassificationAttributeValueModel)
		{
			//This is for handling attributes that use "predefined" values, it is called "Feature Values" in hMC
			final ClassificationAttributeValueModel temp = (ClassificationAttributeValueModel) source;
			return temp.getCode();
		}
		return String.valueOf(source);
	}
}