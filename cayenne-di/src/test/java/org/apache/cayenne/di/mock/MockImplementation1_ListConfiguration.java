/*****************************************************************
 *   Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 ****************************************************************/
package org.apache.cayenne.di.mock;

import java.util.List;

import org.apache.cayenne.di.Inject;

public class MockImplementation1_ListConfiguration implements MockInterface1 {

    private List<Object> configuration;

    public MockImplementation1_ListConfiguration(@Inject("xyz") List<Object> configuration) {
        this.configuration = configuration;
    }

    public String getName() {

        StringBuilder buffer = new StringBuilder();

        for (Object value : configuration) {
            buffer.append(";").append(value);
        }

        return buffer.toString();
    }

}
