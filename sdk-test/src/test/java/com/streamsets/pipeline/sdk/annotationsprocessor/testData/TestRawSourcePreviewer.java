/**
 * (c) 2014 StreamSets, Inc. All rights reserved. May not
 * be copied, modified, or distributed in whole or part without
 * written consent of StreamSets, Inc.
 */
package com.streamsets.pipeline.sdk.annotationsprocessor.testData;

import com.streamsets.pipeline.api.RawSourcePreviewer;

import java.io.InputStream;

public class TestRawSourcePreviewer {

  class FaultyRawSourcePreviewer implements RawSourcePreviewer {
    @Override
    public InputStream preview(int maxLength) {
      return null;
    }

    @Override
    public String getMimeType() {
      return null;
    }

    @Override
    public void setMimeType(String mimeType) {

    }
  }
}
