/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.calculation.definition;

import org.openmrs.calculation.api.CalculationContext;

/**
 * This is the base interface for all definitions, a class that implements this interface indicates
 * that it represents a definition that can be evaluated in a {@link CalculationContext} It is
 * highly recommended to extend {@link BaseParameterDefinition} if the Calculation associated to it
 * makes use of {@link ParameterDefinition}s.
 */
public interface Definition {

}
