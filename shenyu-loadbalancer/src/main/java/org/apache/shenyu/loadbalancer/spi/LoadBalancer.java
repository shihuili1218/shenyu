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
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shenyu.loadbalancer.spi;

import org.apache.shenyu.loadbalancer.entity.Upstream;
import org.apache.shenyu.loadbalancer.entity.UpstreamHolder;
import org.apache.shenyu.spi.SPI;

import java.util.List;

/**
 * LoadBalancer interface spi.
 */
@SPI
public interface LoadBalancer {

    /**
     * this is select one for upstream list.
     *
     * @param upstreamHolder Wrapper object of upstream, including total weight and upstream list.
     * @param ip ip
     * @return upstream
     */
    Upstream select(UpstreamHolder upstreamHolder, String ip);

    /**
     * Deprecated
     * @see LoadBalancer#select(UpstreamHolder, String)
     *
     * @param upstreamList upstream list
     * @param ip ip
     * @return upstream
     */
    @Deprecated
    Upstream select(List<Upstream> upstreamList, String ip);
}
