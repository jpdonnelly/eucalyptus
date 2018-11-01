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
package com.eucalyptus.compute.common;

import java.util.ArrayList;
import java.util.List;
import com.eucalyptus.binding.HttpEmbedded;
import com.eucalyptus.util.StreamUtil;
import com.google.common.collect.Lists;
import edu.ucsb.eucalyptus.msgs.EucalyptusData;

public class DhcpConfigurationItemType extends EucalyptusData {

  private String key;
  @HttpEmbedded
  private DhcpValueSetType valueSet;

  public DhcpConfigurationItemType( ) {
  }

  public DhcpConfigurationItemType( String key, List<String> values ) {
    this.key = key;
    this.valueSet = new DhcpValueSetType( StreamUtil.ofAll( values ).map( DhcpValueType.forValue( ) ).toJavaList( ) );
  }

  public List<String> values( ) {
    ArrayList<String> values = Lists.newArrayList( );
    if ( valueSet != null && valueSet.getItem( ) != null ) {
      for ( DhcpValueType item : valueSet.getItem( ) ) {
        values.add( item.getValue( ) );
      }

    }

    return values;
  }

  public String getKey( ) {
    return key;
  }

  public void setKey( String key ) {
    this.key = key;
  }

  public DhcpValueSetType getValueSet( ) {
    return valueSet;
  }

  public void setValueSet( DhcpValueSetType valueSet ) {
    this.valueSet = valueSet;
  }
}