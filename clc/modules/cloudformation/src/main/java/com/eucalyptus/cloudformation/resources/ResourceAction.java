package com.eucalyptus.cloudformation.resources;

import com.eucalyptus.cloudformation.entity.StackEntity;
import com.eucalyptus.crypto.Crypto;

/**
 * Created by ethomas on 2/14/14.
 */
public abstract class ResourceAction {
  public abstract ResourceProperties getResourceProperties();
  public abstract void setResourceProperties(ResourceProperties resourceProperties);
  public abstract ResourceInfo getResourceInfo();
  public abstract void setResourceInfo(ResourceInfo resourceInfo);
  public abstract void create(int stepNum) throws Exception;
  public abstract void update(int stepNum) throws Exception;
  public abstract void rollbackUpdate() throws Exception;
  public abstract void delete() throws Exception;
  public abstract void rollbackCreate() throws Exception;
  protected StackEntity stackEntity;

  public StackEntity getStackEntity() {
    return stackEntity;
  }

  public void setStackEntity(StackEntity stackEntity) {
    this.stackEntity = stackEntity;
  }

  public int getNumCreateSteps() {
    return 1;
  }

  public int getNumUpdateSteps() {
    return 1;
  }

  public final String getDefaultPhysicalResourceIdWithSuffixLength(int suffixLength) {
    String prefix = (getStackEntity() != null && getStackEntity().getStackName() != null) ?
      getStackEntity().getStackName() : "UNKNOWN";
    String middle = (getResourceInfo() != null && getResourceInfo().getLogicalResourceId() != null) ?
      getResourceInfo().getLogicalResourceId() : "UNKNOWN";
    String suffix = Crypto.generateAlphanumericId(suffixLength, "");
    return prefix + "-" + middle + "-" + suffix;
  }

  public final String getDefaultPhysicalResourceId() {
    return getDefaultPhysicalResourceIdWithSuffixLength(13);
  }

}