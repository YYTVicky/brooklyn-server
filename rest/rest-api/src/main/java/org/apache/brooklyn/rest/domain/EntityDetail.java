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
package org.apache.brooklyn.rest.domain;

import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.apache.brooklyn.core.entity.lifecycle.Lifecycle;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableList;

public class EntityDetail extends EntitySummary {

    private static final long serialVersionUID = 100490507982229165L;

    private final String applicationId;
    private final String parentId;
    @JsonInclude(Include.NON_EMPTY)
    private final List<EntitySummary> children;
    private final List<String> groupIds;
    private final List<Map<String, String>> members;
    private final Boolean serviceUp;
    private final Lifecycle serviceState;
    private final String iconUrl;

    /** @deprecated since 1.0.0, supply links */
    @Deprecated
    public EntityDetail(
            @JsonProperty("applicationId") String applicationId,
            @JsonProperty("id") String id,
            @JsonProperty("parentId") String parentId,
            @JsonProperty("name") String name,
            @JsonProperty("type") String type,
            @JsonProperty("serviceUp") Boolean serviceUp,
            @JsonProperty("serviceState") Lifecycle serviceState,
            @JsonProperty("iconUrl") String iconUrl,
            @JsonProperty("catalogItemId") String catalogItemId,
            @JsonProperty("children") List<EntitySummary> children,
            @JsonProperty("groupIds") List<String> groupIds,
            @JsonProperty("members") List<Map<String, String>> members) {
        this(applicationId, id, parentId, name, type, serviceUp, serviceState, iconUrl, catalogItemId, children, groupIds, members, 
            Collections.<String, URI>emptyMap());
    }
    
    public EntityDetail(
        @JsonProperty("applicationId") String applicationId,
        @JsonProperty("id") String id,
        @JsonProperty("parentId") String parentId,
        @JsonProperty("name") String name,
        @JsonProperty("type") String type,
        @JsonProperty("serviceUp") Boolean serviceUp,
        @JsonProperty("serviceState") Lifecycle serviceState,
        @JsonProperty("iconUrl") String iconUrl,
        @JsonProperty("catalogItemId") String catalogItemId,
        @JsonProperty("children") List<EntitySummary> children,
        @JsonProperty("groupIds") List<String> groupIds,
        @JsonProperty("members") List<Map<String, String>> members,
        @JsonProperty("links") Map<String, URI> links) {
    super(id, name, type, catalogItemId, links);
    this.applicationId = applicationId;
    this.iconUrl = iconUrl;
    this.parentId = parentId;
    this.children = (children == null) ? ImmutableList.<EntitySummary>of() : ImmutableList.copyOf(children);
    this.groupIds = (groupIds == null) ? ImmutableList.<String>of() : ImmutableList.copyOf(groupIds);
    this.members = (members == null) ? ImmutableList.<Map<String, String>>of() : ImmutableList.copyOf(members);
    this.serviceState = serviceState;
    this.serviceUp = serviceUp;
}

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public String getParentId() {
        return parentId;
    }

    public List<EntitySummary> getChildren() {
        return children;
    }

    public List<String> getGroupIds() {
        return groupIds;
    }

    public List<Map<String, String>> getMembers() {
        return members;
    }

    public Boolean getServiceUp() {
        return serviceUp;
    }

    public Lifecycle getServiceState() {
        return serviceState;
    }

    public String getIconUrl() {
        return iconUrl;
    }
}
