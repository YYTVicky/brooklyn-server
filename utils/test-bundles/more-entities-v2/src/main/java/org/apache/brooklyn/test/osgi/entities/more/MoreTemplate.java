/*
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
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.brooklyn.test.osgi.entities.more;

import org.apache.brooklyn.api.catalog.Catalog;
import org.apache.brooklyn.api.entity.Application;
import org.apache.brooklyn.api.entity.Effector;
import org.apache.brooklyn.api.entity.Entity;
import brooklyn.entity.basic.AbstractApplication;
import brooklyn.entity.effector.Effectors;
import org.apache.brooklyn.api.entity.proxying.ImplementedBy;

@Catalog(name="More Template", description="Cataliog item OSGi test template")
public class MoreTemplate extends AbstractApplication {
}