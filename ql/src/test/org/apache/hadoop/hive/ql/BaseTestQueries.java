/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.hive.ql;

import java.io.File;

import junit.framework.TestCase;

/**
 * Base class for testing queries.
 */
public abstract class BaseTestQueries extends TestCase {

  protected final String inpDir = System
      .getProperty("ql.test.query.clientpositive.dir");
  protected final String resDir = System
      .getProperty("ql.test.results.clientpositive.dir");
  protected final String logDir = System.getProperty("test.log.dir")
      + "/clientpositive";

  /**
   * Create a file for each test name in the inpDir.
   * @param testNames
   * @return files corresponding to each test name
   */
  protected File[] setupQFiles(String[] testNames) {
    File[] qfiles = new File[testNames.length];
    for (int i = 0; i < testNames.length; i++) {
      qfiles[i] = new File(inpDir, testNames[i]);
    }
    return qfiles;
  }
}
