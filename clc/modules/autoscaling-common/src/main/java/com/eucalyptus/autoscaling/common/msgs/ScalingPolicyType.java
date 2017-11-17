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
package com.eucalyptus.autoscaling.common.msgs;

import com.eucalyptus.util.CompatFunction;
import edu.ucsb.eucalyptus.msgs.EucalyptusData;

public class ScalingPolicyType extends EucalyptusData {

  private String autoScalingGroupName;
  private String policyName;
  private Integer scalingAdjustment;
  private String adjustmentType;
  private Integer cooldown;
  private String policyARN;
  private Alarms alarms;
  private Integer minAdjustmentStep;

  public static CompatFunction<ScalingPolicyType, String> policyArn() {
    return ScalingPolicyType::getPolicyARN;
  }

  public String getAutoScalingGroupName( ) {
    return autoScalingGroupName;
  }

  public void setAutoScalingGroupName( String autoScalingGroupName ) {
    this.autoScalingGroupName = autoScalingGroupName;
  }

  public String getPolicyName( ) {
    return policyName;
  }

  public void setPolicyName( String policyName ) {
    this.policyName = policyName;
  }

  public Integer getScalingAdjustment( ) {
    return scalingAdjustment;
  }

  public void setScalingAdjustment( Integer scalingAdjustment ) {
    this.scalingAdjustment = scalingAdjustment;
  }

  public String getAdjustmentType( ) {
    return adjustmentType;
  }

  public void setAdjustmentType( String adjustmentType ) {
    this.adjustmentType = adjustmentType;
  }

  public Integer getCooldown( ) {
    return cooldown;
  }

  public void setCooldown( Integer cooldown ) {
    this.cooldown = cooldown;
  }

  public String getPolicyARN( ) {
    return policyARN;
  }

  public void setPolicyARN( String policyARN ) {
    this.policyARN = policyARN;
  }

  public Alarms getAlarms( ) {
    return alarms;
  }

  public void setAlarms( Alarms alarms ) {
    this.alarms = alarms;
  }

  public Integer getMinAdjustmentStep( ) {
    return minAdjustmentStep;
  }

  public void setMinAdjustmentStep( Integer minAdjustmentStep ) {
    this.minAdjustmentStep = minAdjustmentStep;
  }
}
