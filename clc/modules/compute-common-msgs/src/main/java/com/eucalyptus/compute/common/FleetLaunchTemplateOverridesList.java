/*
 * Copyright 2018 AppScale Systems, Inc
 *
 * SPDX-License-Identifier: BSD-2-Clause
 */
package com.eucalyptus.compute.common;

import edu.ucsb.eucalyptus.msgs.EucalyptusData;
import java.util.ArrayList;


public class FleetLaunchTemplateOverridesList extends EucalyptusData {

  private ArrayList<FleetLaunchTemplateOverrides> member = new ArrayList<FleetLaunchTemplateOverrides>();

  public ArrayList<FleetLaunchTemplateOverrides> getMember( ) {
    return member;
  }

  public void setMember( final ArrayList<FleetLaunchTemplateOverrides> member ) {
    this.member = member;
  }
}
