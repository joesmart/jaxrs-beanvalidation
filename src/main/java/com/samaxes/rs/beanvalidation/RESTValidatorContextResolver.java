/*
 * $Id$
 *
 * JAX-RS Bean Validation I18N
 * https://github.com/samaxes/jaxrs-beanvalidation
 *
 * Copyright (c) 2012 samaxes.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.samaxes.rs.beanvalidation;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import org.jboss.resteasy.spi.validation.ValidatorAdapter;

@Provider
public class RESTValidatorContextResolver implements ContextResolver<ValidatorAdapter> {

    private static final RESTValidatorAdapter adapter = new RESTValidatorAdapter();

    @Override
    public ValidatorAdapter getContext(Class<?> type) {
        return adapter;
    }
}
