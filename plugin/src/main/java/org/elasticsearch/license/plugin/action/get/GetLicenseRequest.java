/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */
package org.elasticsearch.license.plugin.action.get;

import org.elasticsearch.action.ActionRequestValidationException;
import org.elasticsearch.action.support.master.MasterNodeReadOperationRequest;


public class GetLicenseRequest extends MasterNodeReadOperationRequest<GetLicenseRequest> {

    public GetLicenseRequest() {
    }

    @Override
    public ActionRequestValidationException validate() {
        return null;
    }
}