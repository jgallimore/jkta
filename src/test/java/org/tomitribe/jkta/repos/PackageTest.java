/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.tomitribe.jkta.repos;

import org.junit.Test;
import org.tomitribe.jkta.usage.Package;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PackageTest {

    @Test
    public void matches() {
        assertTrue(Package.JAVAX_ENTERPRISE.matches("javax.enterprise.Foo"));
        assertTrue(Package.JAVAX_ENTERPRISE.matches("javax.enterprise.bar.Foo"));
        assertFalse(Package.JAVAX_ENTERPRISE.matches("javax.enterprise.deploy.Foo"));
    }

    @Test
    public void transaction() {
        assertTrue(Package.JAVAX_TRANSACTION.matches("javax.transaction.Transaction"));
        assertFalse(Package.JAVAX_TRANSACTION.matches("javax.transaction.xa.XAResource"));
    }
}
