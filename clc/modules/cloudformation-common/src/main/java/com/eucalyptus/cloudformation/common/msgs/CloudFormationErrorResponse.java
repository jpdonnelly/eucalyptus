/*************************************************************************
 * Copyright 2009-2014 Ent. Services Development Corporation LP
 *
 * Redistribution and use of this software in source and binary forms,
 * with or without modification, are permitted provided that the
 * following conditions are met:
 *
 *   Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 *   Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer
 *   in the documentation and/or other materials provided with the
 *   distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 * COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
 * ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 ************************************************************************/
package com.eucalyptus.cloudformation.common.msgs;

import com.eucalyptus.ws.WebServiceError;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class CloudFormationErrorResponse extends CloudFormationMessage implements WebServiceError {

  private String requestId;
  private Error error;

  public CloudFormationErrorResponse( ) {
    set_return( false );
  }

  @Override
  public String toSimpleString( ) {
    return ( error == null ? null : error.getType( ) ) + " error (" + getWebServiceErrorCode( ) + "): " + getWebServiceErrorMessage( );
  }

  @JsonIgnore
  @Override
  public String getWebServiceErrorCode( ) {
    return error == null ? null : error.getCode( );
  }

  @JsonIgnore
  @Override
  public String getWebServiceErrorMessage( ) {
    return error == null ? null : error.getMessage( );
  }

  public String getRequestId( ) {
    return requestId;
  }

  public void setRequestId( String requestId ) {
    this.requestId = requestId;
  }

  public Error getError( ) {
    return error;
  }

  public void setError( Error error ) {
    this.error = error;
  }
}
